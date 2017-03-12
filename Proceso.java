public class Proceso{
	int id,rafaga,tiempor,prioridad,tamanio;
	String nombre;
	Proceso sig;
	public Proceso (){
		nombre=null;
		prioridad=0;
		id=0;
		tiempor=0;
		rafaga=0;
		sig=null;
	}
	public Proceso(int id,int rafaga,int tiempo,int prioridad,int tamanio){
		nombre="Proceso"+id;
		this.nombre=nombre;
		this.id=id;
		this.tiempor=tiempo;
		this.rafaga=rafaga;
		this.prioridad=prioridad;
		this.tamanio=tamanio;
		this.sig=null;
	}

	public Proceso(int id,int rafaga,int tiempo,int prioridad,int tamanio,Proceso sig){
		nombre="Proceso"+id;
		this.nombre=nombre;
		this.id=id;
		this.tiempor=tiempo;
		this.rafaga=rafaga;
		this.prioridad=prioridad;
		this.tamanio=tamanio;
		this.sig=sig;
	}
	public void setsig(Proceso sig){
		this.sig=sig;
	}
	public Proceso getsig(){
		return this.sig;
	}
	public void setnombre(String nombre){
		this.nombre=nombre;
	}
	public String getnombre(){
		return nombre;
	}
	public void setprioridad(int prioridad){
		this.prioridad=prioridad;
	}
	public int gettamanio(){
		return tamanio;
	}
	public void settamanio(int tamanio){
		this.tamanio=tamanio;
	}
	public int getprioridad(){
		return prioridad;
	}
	public void settiempo(int tiempo){
		this.tiempor=tiempo;
	}
	public int gettiempo(){
		return tiempor;
	}
	public void setrafaga(int rafaga){
		this.rafaga=rafaga;
	}
	public int getrafaga(){
		return rafaga;
	}
	public void setid(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
}