import java.util.Scanner;
import java.util.Random;
public class Planificador{
	public static void main(String[] args) {
	int opcion;
	Scanner teclado = new Scanner(System.in); 
	do{
		System.out.println("\tPlanificador de Procesos \nSelecciona una Opcion para continuar:\n1.-Leer desde archivo\n2.-Ingresar datos \n3.-Ejecutar con numeros aleatoreos \n4.-Salir");
		opcion=teclado.nextInt();
		
		switch (opcion){
			case 1:
				do{
	       			System.out.println("\nSelecciona una Opcion para continuar:\n1.-Simular con Round Robin\n2.-Simular con Prioridad Apropiativo \n3.-Salir");
					opcion=teclado.nextInt();
					switch (opcion){
						case 1:
						break;
						case 2:
						break;
						case 3:
						break;
					  }
					  }while(opcion!=3);
				break;
			case 2:	
				do{
	       			System.out.println("\nSelecciona una Opcion para continuar:\n1.-Simular con Round Robin\n2.-Simular con Prioridad Apropiativo \n3.-Salir");
					opcion=teclado.nextInt();
					switch (opcion){
						case 1:
						break;
						case 2:
						break;
						case 3:
						break;
					  }
					  }while(opcion!=3);
				break;
			case 3:
				do{
	       			System.out.println("\nSelecciona una Opcion para continuar:\n1.-Simular con Round Robin\n2.-Simular con Prioridad Apropiativo \n3.-Salir");
					opcion=teclado.nextInt();
					switch (opcion){
						case 1:
						break;
						case 2:
						break;
						case 3:
						break;
					  }
					  }while(opcion!=3);
				break;
			case 4:
				break;}

	}while(opcion!=4);
	}
}