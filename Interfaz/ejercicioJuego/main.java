package primer;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Perro perro = new Perro("Firulais", "Dalgo");
		Dinosaurio dino = new Dinosaurio("Pepinillo", 167);
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("Menú\n1)Dar de comer al perro\n2)Dar de comer al dinosaurio\n3)Acostar al perro\n4)Dar de comer al dinosaurio\n5)Ver datos\n6) Salir ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			
			case 1:
				perro.comer();
				break;
			case 2:
				dino.comer();
				break;
			case 3:
				perro.dormir();
				break;
			case 4:
				dino.dormir();
				break;
			case 5:
				
				System.out.println("El perro se llama "+perro.getNombre()+" y es un "+perro.getRaza());
				System.out.println("El dinosaurio se llama "+dino.getNombre()+ " y ha ASESINADO brutalmente a "+dino.getKills()+"criaturas");
				
				break;
			case 6: 
				
				System.out.println("Hasta luego");
				
				break;
			default:
				
				System.out.println("Opción Invalida");
			}
			
		}while (menu != 6);
		
		
	}

}
