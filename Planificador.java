import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;

public class Planificador{
	public static void main(String[] args) {
	int opcion,a;

	Scanner teclado = new Scanner(System.in); 
	Robin r = new Robin();
	Pap p = new Pap();
    Cola s = new Cola();
	do{
		System.out.println("\tPlanificador de Procesos \nSelecciona una opción para continuar:\n1.-Leer desde archivo\n2.-Ingresar datos \n3.-Ejecutar con números aleatoreos \n4.-Salir");
		opcion=teclado.nextInt();
		
		switch (opcion){
			case 1:

			    int rafaga, prioridad, tamanio;
			    String[] atributos; //Arreglo de cadenas, donde se almacenarán los tres datos requeridos

			    System.out.print("Ingresa el nombre del archivo: ");   
			    teclado.nextLine();
			    String nombreDelArchivo = teclado.nextLine();
			    System.out.println(nombreDelArchivo);
			    try {
			      FileReader fr = new FileReader(nombreDelArchivo);
			      BufferedReader br = new BufferedReader(fr);
			 
			      String linea;
			      int i = 1;
			      while((linea = br.readLine()) != null){

			        atributos = linea.split(" "); //Separo a la primer línea de acuerdo a los espacios que se encuentren

			        //Se castean las cadenas y las guardo en sus respectivas variables
			        rafaga = Integer.parseInt(atributos[0]);
			        prioridad = Integer.parseInt(atributos[1]);
			        tamanio = Integer.parseInt(atributos[2]);

			        s.push(i,rafaga,rafaga,prioridad,tamanio);
			        i++;
			      }      

			      fr.close();
			    }
			    catch(Exception e) {
			      System.out.println("\nError al leer "+ nombreDelArchivo + ": " + e);
			    }

				switch(menuDeAlgoritmo()){
                	case 1: r.robin(s,s.tam());
                	break;

                	case 2: p.pap(s,s.tam());
                	break;

                	case 3: opcion = 4;
                	break;
                }

				break;

			case 2:	
				
				int proce;
				Scanner tec = new Scanner(System.in);
                System.out.println("Dame el numero de procesos que quieres crear:");
                proce = tec.nextInt();
                for (int j=0;j<proce;j++) {
                    System.out.println("Dame los sig datos:");
                    System.out.print("Rafaga: ");
                    rafaga= tec.nextInt();
                    System.out.print("Prioridad: ");
                    prioridad= tec.nextInt();
                    System.out.print("Tamaño: ");
                    tamanio= tec.nextInt();
                    s.push(j+1,rafaga,rafaga,prioridad,tamanio);                    
                }
                switch(menuDeAlgoritmo()){
                	case 1: r.robin(s,proce);
                	break;

                	case 2: p.pap(s,proce);
                	break;

                	case 3: opcion = 4;
                	break;
                }

				break;
			case 3:
			
				int lim = (int) Math.floor(Math.random()*10);
				lim++;

				for (int i =0;i<lim;i++) {
                    a=(int) Math.floor(Math.random()*16);
                    s.push(i+1,a,a,(int) Math.floor(Math.random()*32),(int) Math.floor(Math.random()*32));                    
                }

				switch(menuDeAlgoritmo()){
                	case 1: r.robin(s,s.tam());
                	break;

                	case 2: p.pap(s,s.tam());
                	break;

                	case 3: opcion = 4;
                	break;
                }



				break;
			case 4:
				break;
			default:
				System.out.println("------Esa no es una opción válida------\n");
				break; 
			}

		}while(opcion!=4);
	}

	public static int menuDeAlgoritmo(){

		int opcion;
		Scanner teclado = new Scanner(System.in); 

   			System.out.println("\nSelecciona el algoritmo de planificación:\n1.-Simular con Round Robin\n2.-Simular con Prioridad Apropiativo \n3.-Salir");
			opcion=teclado.nextInt();
		return opcion;
	}
}