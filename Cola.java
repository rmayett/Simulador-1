public class Cola{

	int i;

	Proceso h = new Proceso(); 
	Proceso t = new Proceso();
	public Cola(){
		this.h=null;
		this.t=null;
		i=0;
	}
	public boolean ColaVacia(){
		if (this.h==null&&this.t==null) {
			return true;			
		}
		return false;
	}

	public int tam(){
		return this.i;
	}

	public void push(int id,int rafaga,int tiempo,int prioridad,int tamanio){
		Proceso aux = new Proceso(id,rafaga,tiempo,prioridad,tamanio);
		if (!ColaVacia()) {
			t.setsig(aux);
			t=aux;
			t.setsig(null);	
			i++;
		}
		else{
			this.h=aux;
			this.t=aux;
			i=1;
		}
	}
	public Proceso tope(){
		return this.h;
	}

	public Proceso pop(){
		if (!ColaVacia()) {
			Proceso resp = this.h;
			if (this.h==null) {
				this.t=null;							
						}
			this.h=this.h.getsig();	
			i--;
			return resp;		
		}
		else{
			System.out.println("La cola esta vacia");
			i=0;
			return null;
		}
	}
	public void VaciarCola(){
		this.h=null;
		this.t=null;
		i=0;

	}
	public void show(){
		System.out.println("\t\t\t\t\t--Cola de procesos--");
		Proceso aux = h;
		while(aux!=null){
			System.out.println("Nombre del Proceso: "+ aux +"\tId: "+ aux.getid() +"\tRáfaga: "+ aux.getrafaga() +"\tTiempo restante: "+aux.gettiempo()+"\tPrioridad: "+aux.getprioridad()+"\tTamaño: "+aux.gettamanio()+"MB");
			aux=aux.getsig();
		}
		System.out.println("\t\t\t\t\t\t----");
	}
}