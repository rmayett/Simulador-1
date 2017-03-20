import java.lang.Math;
import java.util.Scanner;
public class Pap {
   
    public static void main(String[] args) {
        Cola s = new Cola();           
        int lim = (int) Math.floor(Math.random()*32);
        Pap p = new Pap();
		int op,a;   
    	Scanner tec = new Scanner(System.in);
    	do{
    		System.out.println("\tSimulador de Planificador Round Robin\nSelecciona una Opcion para continuar:\n1.-ingresar nombres de procesos\n2.-Correr simulador con numeros aleatorios\n3.-Salir");  
    		op=tec.nextInt();
    		switch(op){
    			case 1:
    			break;
    			case 2:
                 for (int i =0;i<lim;i++) {
                    a=(int) Math.floor(Math.random()*32);
                    s.push((int) Math.floor(Math.random()*32),a,a,(int) Math.floor(Math.random()*32),(int) Math.floor(Math.random()*32));                    
                }
    			p.pap(s,lim);
    			break;
    			case 3:
    			break;
    			default:
    			break;
    		}      
    	}while(op!=3);
    }
    public void pap(Cola r, int lim){
        int aux; 
        Proceso auxp = new Proceso();
    	Orden o = new Orden();
    	r=o.orden(r);
    	r.show();
        System.out.println("----");
        do{
            aux=r.tope().gettiempo();
            aux=aux-1;  
            System.out.println("Nombre del Proceso: "+ r.tope().getnombre() +" id: "+ r.tope().getid() +" rafaga: "+ r.tope().getrafaga() +" tiempo restante: "+r.tope().gettiempo()+" Prioridad: "+r.tope().getprioridad()+" Tamaño: "+r.tope().gettamanio()+"MB");                
            
            r.tope().settiempo(aux);
            if (aux<=0) {                
                System.out.println("Nombre del Proceso: "+ r.tope().getnombre() +" id: "+ r.tope().getid() +" rafaga: "+ r.tope().getrafaga() +" tiempo restante: 0 Prioridad: "+r.tope().getprioridad()+" Tamaño: "+r.tope().gettamanio()+"MB");                         
            }
            if (r.tope().gettiempo()<=0) {
                r.pop();                
            }                
        }while(r.tope().getsig()!=null);    

    }
}
