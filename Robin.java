import java.lang.Math;
import java.util.Scanner;
public class Robin {

    public void robin(Cola r,int lim){ 
        int aux; 
        float tiempos_espera = 0, tiempos_ejecucion = 0;
        int quantum = 0;
        int memoria = 1000;
        Proceso auxp = new Proceso();
        System.out.println("Cola de procesos listos:");
        r.show();
        System.out.println("\nCola de procesos listos para ejecución:\n");
        
        Proceso auxiliar = new Proceso();
        auxiliar = r.tope();
        
        while(memoria>0 && auxiliar != null){
            memoria -= auxiliar.gettamanio();
            System.out.println("El "+auxiliar+" ocupó "+auxiliar.gettamanio()+" MB de memoria.\tMemoria disponible: "+memoria);
            auxiliar = auxiliar.getsig();
        }

        r.show();

        System.out.println("----");
        int tiempo = 0;
        int bandera = 0;

        while(r.tope()!=null){
            quantum = 4;
            bandera = 0;
            while(quantum>0 && bandera == 0){

                tiempo++;
                aux=r.tope().gettiempo();
                aux=aux-1;  

                System.out.println("Nombre del Proceso: "+ r.tope() +"\tId: "+ r.tope().getid() +"\tRáfaga: "+ r.tope().getrafaga() +"\tTiempo restante: "+r.tope().gettiempo()+"\tPrioridad: "+r.tope().getprioridad()+"\tTamaño: "+r.tope().gettamanio()+" MB");                
                System.out.println("Quántum: "+(quantum));
                r.tope().settiempo(aux);
                if (aux<=0) {
                                  
                    System.out.println("Nombre del Proceso: "+ r.tope() +"\tId: "+ r.tope().getid() +"\tRáfaga: "+ r.tope().getrafaga() +"\tTiempo restante: 0\tPrioridad: "+r.tope().getprioridad()+"\tTamaño: "+r.tope().gettamanio()+" MB");                         
                    memoria += r.tope().gettamanio();
                    quantum = 4;
                    System.out.println("\nSe han liberado "+r.tope().gettamanio()+" MB de memoria, memoria disponible "+memoria);
                }
                if (r.tope().gettiempo()<=0 || quantum-1 == 0) {
                    r.tope().tiempo_final = tiempo;
                    if(r.tope().getsig() != null)
                        r.tope().getsig().tiempo_inicio = tiempo;
                    System.out.println("Inicio: "+r.tope().tiempo_inicio+" tiempo_final: "+r.tope().tiempo_final);
                    
                    tiempos_espera += r.tope().tiempo_inicio;
                    tiempos_ejecucion += r.tope().tiempo_final;
                    if (r.tope().gettiempo()<=0) {
                        r.pop();
                        bandera = 1;
                    }else{
                    
                    r.push(r.pop());
                    bandera = 1;
                    r.show();
                    }              
                }
            quantum--;
            }
                     
        }
        System.out.println("Tiempo promedio de espera: "+tiempos_espera/lim+"\tTiempo promedio de ejecución: "+tiempos_ejecucion/lim+"\n\n");    
    }        
}