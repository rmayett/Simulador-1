public class Orden{
	public Cola orden(Cola r){
		Cola  resp = new Cola();
        int t=r.tam();
		Proceso p[] = new Proceso[r.tam()];
		for (int i=0;i<t;i++) {
			p[i]=r.pop();			
		}
		for(int i = 0; i <t - 1; i++){
            for(int j = 0; j < t - i - 1; j++){
                if (p[j].getprioridad() < p[j + 1].getprioridad()){
                    Proceso tmp = p[j+1];
                    p[j+1] = p[j];
                    p[j] = tmp;
                }
            }
        }
        for (int i=0;i<t;i++) {
        	resp.push(p[i].getid(),p[i].getrafaga(),p[i].gettiempo(),p[i].getprioridad(),p[i].gettamanio());
        }
		return resp;
	}
}