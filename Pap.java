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

        while(r.tope()!=null){
           aux=r.tope().gettiempo();
            aux=aux-1;  
            System.out.println("Nombre del Proceso: "+ r.tope() +"\tId: "+ r.tope().getid() +"\tRáfaga: "+ r.tope().getrafaga() +"\tTiempo restante: "+r.tope().gettiempo()+"\tPrioridad: "+r.tope().getprioridad()+"\tTamaño: "+r.tope().gettamanio()+" MB");                            
            r.tope().settiempo(aux);
            if (aux<=0) {                
                System.out.println("Nombre del Proceso: "+ r.tope() +"\tId: "+ r.tope().getid() +"\tRáfaga: "+ r.tope().getrafaga() +"\tTiempo restante: 0\tPrioridad: "+r.tope().getprioridad()+"\tTamaño: "+r.tope().gettamanio()+" MB");                         
            }
            if (r.tope().gettiempo()<=0) {
                r.pop();
                r.show();                
            } 
        }

    }
}