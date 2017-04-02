import java.lang.Math;
import java.util.Scanner;
public class Robin {

    public void robin(Cola r,int lim){ 
        int aux; 
        Proceso auxp = new Proceso();
        r.show();
        System.out.println("----");
        do{
            aux=r.tope().gettiempo();
            aux=aux-4;  

            System.out.println("Nombre del Proceso: "+ r.tope().getnombre() +"\tId: "+ r.tope().getid() +"\tRáfaga: "+ r.tope().getrafaga() +"\tTiempo restante: "+r.tope().gettiempo()+"\tPrioridad: "+r.tope().getprioridad()+"\tTamaño: "+r.tope().gettamanio()+" MB");                

            auxp=r.pop();
            r.push(auxp.getid(),auxp.getrafaga(),auxp.gettiempo(),auxp.getprioridad(),auxp.gettamanio());
            r.tope().settiempo(aux);
            if (aux<=0) {                
                System.out.println("Nombre del Proceso: "+ r.tope().getnombre() +"\tId: "+ r.tope().getid() +"\tRáfaga: "+ r.tope().getrafaga() +"\tTiempo restante: 0\tPrioridad: "+r.tope().getprioridad()+"\tTamaño: "+r.tope().gettamanio()+" MB");                         

            }
            if (r.tope().gettiempo()<=0) {
                r.pop();                
            }                
        }while(r.tope().getsig()!=null);    
    }        
}