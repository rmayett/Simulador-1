import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;

public class Robin {
	
    public static void main(String[] args) {
    	Robin r = new Robin();
    	int quantum = 4;
		int op;   
    	Scanner tec = new Scanner(System.in);
    	do{
    		System.out.println("\tSimulador de Planificador Round Robin\nSelecciona una Opcion para continuar:\n1.-Ingresar nombres de procesos\n2.-Correr simulador con numeros aleatorios\n3.-Generar procesos a partir de un archivo\n4.-Salir");  
    		op=tec.nextInt();
    		switch(op){
    			case 1:
    			break;
    			case 2:
                    generaAleatorio(10);
    			break;
    			case 3:
                    generaDesdeArchivo();
    			break;
                case 4:
                break;
                default:
    			break;
    		}      
    	}while(op!=4);
    }

    public void robin(){
    	//probando la clase cola
    	Cola p = new Cola();
    	p.push(1,1,1,1,1);
    	p.show();
    }    

    public static Cola generaAleatorio(int cantidad){

        Cola procesos = new Cola();
        Random rnd = new Random();

        for (int i = 1; i <= cantidad; i++) {
            int rafaga = rnd.nextInt(20)+1;

            procesos.push(i,rafaga,rafaga,rnd.nextInt(20)+1,rnd.nextInt(20)+1);
        }
        procesos.show();
        System.out.println("");
        return procesos;
    }

    public static Cola generaDesdeArchivo(){

        Cola procesos = new Cola();
        String nombreDeArchivo;
        Scanner teclado = new Scanner(System.in);
        int rafaga, prioridad, tamanio;
        String[] atributos; //Arreglo de cadenas, donde se almacenarán los tres datos requeridos

        System.out.print("Ingresa el nombre del archivo: ");
        String nombreDelArchivo = teclado.nextLine();
        System.out.println(nombreDelArchivo);

        int i = 1; //número de procesos

        try {
          FileReader fr = new FileReader(nombreDelArchivo);
          BufferedReader br = new BufferedReader(fr);
     
          String linea;
          while((linea = br.readLine()) != null){
            atributos = linea.split(" "); //Separo a la primer líneade acuerdo a los espacios que se encuentren

            //Se castean las cadenas y las guardo en sus respectivas variables
            rafaga = Integer.parseInt(atributos[0]);
            prioridad = Integer.parseInt(atributos[1]);
            tamanio = Integer.parseInt(atributos[2]);

            procesos.push(i,rafaga,rafaga,prioridad,tamanio);

            i++;
          }      

     
          fr.close();
        }
        catch(Exception e) {
          System.out.println("\nError al leer "+ nombreDelArchivo + ": " + e);
        }
        procesos.show();

        return procesos;
    }
}
