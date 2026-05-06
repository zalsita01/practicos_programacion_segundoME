package SoftwareNegocio;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner (System.in);
		int menu = 0, comprobacion = 0;
		
		Cliente cliente1 = new Cliente(null, null, true, 0);
		
		do {
			
			System.out.println("Bienvenido al registro de clientes de la automotora.\n1) Ingresar Datos\n2) Obtener Datos\n3) Salir");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			
			case 1: 
				
				comprobacion++;
				
				System.out.println("Ingrese nombre del cliente");
				String nombre = sc.nextLine();
				cliente1.setNombre(nombre);
				
				
				System.out.println("Ingrese apellido del cliente");
				String apellido = sc.nextLine();
				cliente1.setApellido(apellido);

				
				System.out.println("Ingrese edad del cliente");
				int edad = sc.nextInt();
				cliente1.setEdad(edad);

				
				System.out.println("Ingrese si el cliente tiene carnet de conducir (true/false)");
				boolean carnet = sc.nextBoolean();
				cliente1.setCarnetConductor(carnet);
				
				break;
			
			case 2:
				
				if (comprobacion == 0) {
					System.out.println("Debes ingresar datos primero");
				}else {
					System.out.println(cliente1.getNombre()+"\n"+cliente1.getApellido()+"\n"+cliente1.getEdad()+"\n"+cliente1.getCarnetConductor());
					
					
				}
				
				break;
			
			case 3: 
				
				System.out.println("Hasta Luego");

				
				
				break;
				
			default:
				
				System.out.println("Opción Incorrecta");
				
				break;
			}
			
			
			
			
		}while (menu != 3);
		
	}

}
