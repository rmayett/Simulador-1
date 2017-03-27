import java.util.Scanner;
import java.util.Random;
public class Planificador{
	public static void main(String[] args) {
	int opcion;
	Scanner teclado = new Scanner(System.in); 
	Robin r = new Robin();
	Pap p = new Pap();
    Cola s = new Cola();
	do{
		System.out.println("\tPlanificador de Procesos \nSelecciona una opción para continuar:\n1.-Leer desde archivo\n2.-Ingresar datos \n3.-Ejecutar con números aleatoreos \n4.-Salir");
		opcion=teclado.nextInt();
		
		switch (opcion){
			case 1:
				menuDeAlgoritmo();
				break;
			case 2:	
				
				int proce,id,rafaga,prioridad,tamanio;
				Scanner tec = new Scanner(System.in);
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
                switch(menuDeAlgoritmo()){
                	case 1:
                		r.robin(s,proce);
                	break;

                	case 2:
                		p.pap(s,proce);
                	break;

                	case 3:
                		opcion = 4;
                	break;

                }
                menuDeAlgoritmo();
                


				break;
			case 3:
				
	

	
				break;
			case 4:
				break;}

		}while(opcion!=4);
	}

	public static int menuDeAlgoritmo(){

		int opcion;
		Scanner teclado = new Scanner(System.in); 


   			System.out.println("\nSelecciona una opción para continuar:\n1.-Simular con Round Robin\n2.-Simular con Prioridad Apropiativo \n3.-Salir");
			opcion=teclado.nextInt();
		return opcion;
	}
}