package segundo;
import java.util.Scanner;
public class main {

	 public static void main(String[] args) {	
			Encargado encargado = new Encargado("Finanzas");
			Empleados empleado = new Empleados(8);
			Dueño dueño = new Dueño("Empresa");
			Scanner sc = new Scanner (System.in);
			
			int menu, menu1, menu2, menu3, comp;
			
			do {
				System.out.println("1)Dueño \n2)Empleado \n3)Encargado\n4)Salir");
				menu = sc.nextInt();
				sc.nextLine();
				
				switch (menu) {
				
				case 1:
					
					do {
						System.out.println("Enviar Mail \n1)Encargado\n2)Empleado\n3)Salir");
						menu1 = sc.nextInt();
						sc.nextLine();
						
						switch (menu1) {
						
						case 1: 
							
							dueño.enviar(1);
							break;
						case 2:
							dueño.enviar(0);
							break;
						}
						
					}while (menu1 != 3);
										
					break;
				case 2:
					do {
						System.out.println("Enviar Mail \n1)Dueño\n2)Encargado\n3)Salir");
						menu2 = sc.nextInt();
						sc.nextLine();
						
						switch (menu2) {
						
						case 1:
							empleado.enviar(0);
							break;
						case 2:
							empleado.enviar(1);
							break;
						}
					}while (menu2 != 3);
					
					break;
				case 3:
					do {
						System.out.println("Enviar Mail \n1)Dueño\n2)Empleado\n3)Salir");
						menu3 = sc.nextInt();
						sc.nextLine();
						
						switch (menu3) {
						
						case 1:
							encargado.enviar(1);
							break;
						case 2:
							encargado.enviar(1);
							break;
							
						}
					}while (menu3 != 3);
					
					break;
					
				case 4:
					System.out.println("Salir");
					
					break;
				default:
					System.out.println("Opción Incorrecta");
					break;
				}
				
			}while (menu != 4);
	 }
		
}
