package practico1;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Electronica electronica[] = new Electronica[10];
		Ropa ropa[] = new Ropa[10];
		Alimento alimento[] = new Alimento[10];
		
		int menu, menuAltar, menuListar;
		
		do {
			System.out.println("Bienvenido al gestor del supermercado: \n1)Altar productos\n2)Listar productos\n3)Salir");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			
			case 1: 
				
				// menu de altar
				do {
					System.out.println("\n\nElige producto: \n1)Ingresar un producto electronico\n2)Ingresar un producto alimenticio\n3)Ingresar un producto de vestimenta (ropa)\n4)Salir");
					menuAltar = sc.nextInt();
					sc.nextLine();
					
					switch(menuAltar) {
					
					case 1:
						
						System.out.println("Ingresa el nombre del producto electronico: ");
						String nombrePE = sc.nextLine();
						System.out.println("Ingrese el precio del producto electronico: ");
						int precioPE = sc.nextInt();
						sc.nextLine();
						System.out.println("Ingrese el modelo del producto electronico: ");
						String modeloPE = sc.nextLine();
						
						altaProductoEletronica(electronica, nombrePE, precioPE, modeloPE);
						
						break;
						
					case 2:
						
						System.out.println("Ingresa el nombre del producto alimenticio: ");
						String nombrePA = sc.nextLine();
						System.out.println("Ingrese el precio del producto alimenticio: ");
						int precioPA = sc.nextInt();
						sc.nextLine();
						System.out.println("Ingrese la fecha de caducidad del producto alimenticio: ");
						String fechaCaducidad = sc.nextLine();
						System.out.println("Ingrese el sabor del producto alimenticio: ");
						String sabor = sc.nextLine();
						
						altaProductoAlimenticio(alimento, nombrePA, precioPA, fechaCaducidad, sabor);
						
						break;
						
					case 3: 
						
						System.out.println("Ingresa el nombre del producto de vestimenta: ");
						String nombrePR = sc.nextLine();
						System.out.println("Ingrese el precio del producto de vestimenta: ");
						int precioPR = sc.nextInt();
						sc.nextLine();
						System.out.println("Ingrese el talle del producto de vestimenta: ");
						String talle = sc.nextLine();
						System.out.println("Ingrese el material del producto de vestimenta: ");
						String material = sc.nextLine();
						
						altaProductoVestimenta(ropa, nombrePR, precioPR, talle, material);
						
						break;
						
						
					case 4:
						
						 System.out.println("\n\n");
						 
						break;
						
					default: 
						
						System.out.println("Opción incorrecta");
						break;
					}
					
					
					
				
				}while (menuAltar != 4);
				
				
				break;
				
			case 2:
				
				//menu de listar
				do {
					
					System.out.println("\n\nElige producto: \n1)Listar productos electronicos\n2)Listar productos alimenticios\n3)Listar productos de vestimenta (ropa)\n4)Salir");
					menuListar = sc.nextInt();
					sc.nextLine();
					
					switch (menuListar) {
					
					case 1:
						
						listarProductoElectronica(electronica);
						
						break;
						
					case 2:
						
						listarProductoAlimenticio(alimento);
						
						break;
						
					case 3:
						
						listarProductoVestimenta(ropa);
						
						break;
						
					case 4:
						
						System.out.println("\n\n");
						
						break;
						
					default: 
						
						System.out.println("Opción Incorrecta");
						
						break;
					}
					
				}while (menuListar != 4);
				
				
				break;
			case 3: 
				
				System.out.println("Hasta Luego!");
				
				break;
			default:
				
				System.out.println("Opción incorrecta");
				
				break;
			}
			
		}while (menu != 3);
	}

	public static void altaProductoEletronica(Electronica[] a, String nombre, int precio, String modelo) {
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == null) {
				a[i] = new Electronica(nombre, precio, modelo);
				break;
			}	
		} 
	}
		
		
	public static void altaProductoAlimenticio(Alimento[] a, String nombre, int precio, String fechaCaducidad, String sabor) {
		
	for (int i = 0; i < a.length; i++) {
			
			if (a[i] == null) {
				a[i] = new Alimento(nombre, precio, fechaCaducidad, sabor);
				break;
			}	
		} 
	}
	
	public static void altaProductoVestimenta(Ropa[] a, String nombre, int precio, String talle, String material) {
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == null) {
				a[i] = new Ropa(nombre, precio, talle, material);
				break;
			}	
		} 
	}
	
	
	public static void listarProductoElectronica(Electronica[] a) {
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] != null) {
				System.out.println("El producto electronico '"+ a[i].getNombre() + "', modelo "+ a[i].getModelo() + ", tiene un valor de $"+ a[i].getPrecio()+" pesos.");
				
			}
		}

	}
	
	public static void listarProductoAlimenticio(Alimento[] a) {
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] != null) {
				System.out.println("El producto alimenticio '"+ a[i].getNombre() + "' con sabor a "+a[i].getSabor()+" vence el "+ a[i].getFechaCaducidad() + ", tiene un valor de $"+ a[i].getPrecio()+" pesos.");
				
			}
		}

	}
	

	public static void listarProductoVestimenta(Ropa[] a) {
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] != null) {
				System.out.println("El producto de vestimenta '"+ a[i].getNombre() + "' hecho de "+a[i].getMaterial()+", talle "+ a[i].getTalle() + ", tiene un valor de $"+ a[i].getPrecio()+" pesos.");
				
			}
		}

	}
}






