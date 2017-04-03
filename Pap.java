import java.lang.Math;
import java.util.Scanner;
public class Pap {

    public void pap(Cola r, int lim){
        int aux; 
        int memoria = 1000;
        Proceso auxp = new Proceso();
    	Orden o = new Orden();
        System.out.println("Cola de procesos listos:");
        r.show();
    	r=o.orden(r);
        System.out.println("\nCola de procesos listos para ejecución:");

        Proceso auxiliar = new Proceso();
        auxiliar = r.tope();
        while(memoria>0 && auxiliar != null){
            if ((memoria - auxiliar.gettamanio()) <= 0)
                System.out.println("No hay espacio suficiente en la memoria");
            else{
                memoria -= auxiliar.gettamanio();
                System.out.println("El "+auxiliar+" ocupó "+auxiliar.gettamanio()+" MB de memoria.\tMemoria disponible: "+memoria);
                auxiliar = auxiliar.getsig();
            }   
        }

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
                memoria += r.tope().gettamanio();
                System.out.println("\nSe han liberado "+r.tope().gettamanio()+" MB de memoria, memoria disponible "+memoria);
                r.pop();
                r.show();                
            } 
        }
    }
}