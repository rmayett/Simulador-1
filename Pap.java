import java.lang.Math;
import java.util.Scanner;
public class Pap {
   
    public static void main(String[] args) {
        int quantum = 4;
        Pap p
		int op;   
    	Scanner tec = new Scanner(System.in);
    	do{
    		System.out.println("\tSimulador de Planificador Round Robin\nSelecciona una Opcion para continuar:\n1.-ingresar nombres de procesos\n2.-Correr simulador con numeros aleatorios\n3.-Salir");  
    		op=tec.nextInt();
    		switch(op){
    			case 1:
    			break;
    			case 2:
    			p.pap(s);
    			break;
    			case 3:
    			break;
    			default:
    			break;
    		}      
    	}while(op!=3);
    }
    public void pap(Cola r){
    	Orden o = new Orden();
    	r=o.orden(r);
    	r.show();

    }
}
