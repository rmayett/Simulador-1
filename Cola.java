public class Cola{

	Proceso h = new Proceso(); 
	Proceso t = new Proceso();
	public Cola(){
		this.h=null;
		this.t=null;
	}
	public boolean ColaVacia(){
		if (this.h==null&&this.t==null) {
			return true;			
		}
		return false;
	}
	public void push(int id,int rafaga,int tiempo,int prioridad,int tamanio){
		Proceso aux = new Proceso(id,rafaga,tiempo,prioridad,tamanio);
		if (!ColaVacia()) {
			t.setsig(aux);
			t=aux;
			this.t.setsig(null);			
		}
		else{
			this.h=aux;
			this.t=aux;
		}
	}
	public Proceso pop(){
		if (!ColaVacia()) {
			Proceso resp = this.h;
			if (this.h==null) {
				this.t=null;							
						}
			this.h=this.h.getsig();	
			return resp;		
		}
		else{
			System.out.println("La cola esta vacia");
		}
	}
	public void VaciarCola(){
		this.h=null;
		this.t=null;
	}
	public void show(){
		Proceso aux = this.h;
		while(aux!=null){
			System.out.println("Nombre del Proceso: "+ aux.getnombre() +" id: "+ aux.getid() +" rafaga: "+ aux.getrafaga() +" tiempo restante: "+aux.gettiempo()+" Prioridad: "+aux.getprioridad()+" Tamaño: "+aux.gettamanio()+"MB");
			aux=aux.getsig();
		}
	}
}