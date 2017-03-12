import java.lang.Math;
import java.util.Scanner;
public class Robin {
	
    public static void main(String[] args) {
    	Robin r = new Robin();
    	int quantum = 4;
		int op;   
    	Scanner tec = new Scanner(System.in);
    	do{
    		System.out.println("\tSimulador de Planificador Round Robin\nSelecciona una Opcion para continuar:\n1.-ingresar nombres de procesos\n2.-Correr simulador con numeros aleatorios\n3.-Salir");  
    		op=tec.nextInt();
    		switch(op){
    			case 1:
    			break;
    			case 2:
    			r.robin();
    			break;
    			case 3:
    			break;
    			default:
    			break;
    		}      
    	}while(op!=3);
    }

    public void robin(){
    	//probando la clase cola
    	Cola p = new Cola();
    	p.push(1,1,1,1,1);
    	p.show();
    }    
}
