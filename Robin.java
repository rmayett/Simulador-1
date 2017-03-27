import java.lang.Math;
import java.util.Scanner;
public class Robin {
    
    public static void main(String[] args) {
        Robin r = new Robin();
        Cola s = new Cola();         
        int op,a;  
        int lim = (int) Math.floor(Math.random()*32);
        Scanner tec = new Scanner(System.in);
        do{
            s.VaciarCola();
            System.out.println("\tSimulador de Planificador Round Robin\nSelecciona una Opcion para continuar:\n1.-ingresar nombres de procesos\n2.-Correr simulador con numeros aleatorios\n3.-Salir");  
            op=tec.nextInt();
            switch(op){
                case 1:
                int proce,id,rafaga,prioridad,tamanio;
                System.out.println("Dame el numero de procesos que quieres crear:");
                proce = tec.nextInt();
                for (int j=0;j<proce;j++) {
                    System.out.println("Dame los sig datos:\n id:");
                    id= tec.nextInt();
                    System.out.println("Rafaga:");
                    rafaga= tec.nextInt();
                    System.out.println("Prioridad:");
                    prioridad= tec.nextInt();
                    System.out.println("Tamaño:");
                    tamanio= tec.nextInt();
                    s.push(id,rafaga,rafaga,prioridad,tamanio);                    
                }
                r.robin(s,proce);
                break;
                case 2:
                for (int i =0;i<lim;i++) {
                    a=(int) Math.floor(Math.random()*32);
                    s.push((int) Math.floor(Math.random()*32),a,a,(int) Math.floor(Math.random()*32),(int) Math.floor(Math.random()*32));                    
                }
                r.robin(s,lim);
                break;
                case 3:
                break;
                default:
                break;
            }      
        }while(op!=3);
    }

    public void robin(Cola r,int lim){ 
        int aux; 
        Proceso auxp = new Proceso();
        r.show();
        System.out.println("----");
        do{
            aux=r.tope().gettiempo();
            aux=aux-4;  
            System.out.println("Nombre del Proceso: "+ r.tope().getnombre() +" id: "+ r.tope().getid() +" rafaga: "+ r.tope().getrafaga() +" tiempo restante: "+r.tope().gettiempo()+" Prioridad: "+r.tope().getprioridad()+" Tamaño: "+r.tope().gettamanio()+"MB");                
            auxp=r.pop();
            r.push(auxp.getid(),auxp.getrafaga(),auxp.gettiempo(),auxp.getprioridad(),auxp.gettamanio());
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
