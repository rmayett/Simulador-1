public class Proceso{
	int id,rafaga,tiempor;
	public Proceso (){
		id=0;
		tiempor=0;
		rafaga=0;
	}
	public Proceso(int id,int rafaga,int tiempo){
		this.id=id;
		this.tiempor=tiempo;
		this.rafaga=rafaga;
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