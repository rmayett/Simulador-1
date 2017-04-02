import java.lang.Math;
import java.util.Scanner;
public class Pap {

    public void pap(Cola r, int lim){
        int aux; 
        Proceso auxp = new Proceso();
    	Orden o = new Orden();
        System.out.println("Cola de procesos listos:");
        r.show();
    	r=o.orden(r);
        System.out.println("\nCola de procesos listos para ejecución:");
    	r.show();
        do{           
            aux=r.tope().gettiempo();
            aux=aux-1;  
            System.out.println("Nombre del Proceso: "+ r.tope() +" Id: "+ r.tope().getid() +" Ráfaga: "+ r.tope().getrafaga() +" Tiempo restante: "+r.tope().gettiempo()+" Prioridad: "+r.tope().getprioridad()+" Tamaño: "+r.tope().gettamanio()+"MB");                            
            r.tope().settiempo(aux);
            if (aux<=0) {                
                System.out.println("Nombre del Proceso: "+ r.tope() +" Id: "+ r.tope().getid() +" Ráfaga: "+ r.tope().getrafaga() +" Tiempo restante: 0 Prioridad: "+r.tope().getprioridad()+" Tamaño: "+r.tope().gettamanio()+"MB");                         
            }
            if (r.tope().gettiempo()<=0) {
                r.pop();
                r.show();                
            }                
        }while(r.tope().getsig()!=null);    

    }
}