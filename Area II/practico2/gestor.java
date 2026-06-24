package practico2;
import java.util.Scanner;
public class gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu, menuAltar, menuListar, prueba1 = 0, prueba2 = 0, prueba3 = 0;
		Libro libro[] = new Libro[10];
		Revista revista[] = new Revista[10];
		ArticuloCientifico articuloCientifico[] = new ArticuloCientifico[10];
		
		
		do {
			
			System.out.println("Bienvenido al programa\nSeleccione una opción:\n1)Altar Publicaciones\n2)Listar Publicaciones\n3)Salir");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			
			case 1: 
				
				do {
					
					System.out.println("\n\nMenu Altar:\n1)Altar Libro\n2)Altar Revista\n3)Altar Articulo Científico\n4)Salir");
					menuAltar = sc.nextInt();
					sc.nextLine();
					
					switch (menuAltar) {
					
					
					case 1:
								
						System.out.println("Ingresar fecha de lanzamiento");
						String fechapublicacionL = sc.nextLine();
						System.out.println("Ingresar nombre de editorial");
						String editorialL = sc.nextLine();
						System.out.println("Ingrese el número de páginas");
						int numeroPag = sc.nextInt();
						sc.nextLine();
						System.out.println("Indique si leyó o no el libro (true/false)");
						boolean leido = sc.nextBoolean();
						
						AltaLibro(libro, fechapublicacionL, editorialL , numeroPag, leido);
						prueba1 = 1;
						break;
						
					case 2:
					
						System.out.println("Ingresar fecha de lanzamiento");
						String fechapublicacionR = sc.nextLine();
						System.out.println("Ingresar nombre de editorial");
						String editorialR = sc.nextLine();			
						System.out.println("Ingresar nombre de la marca");
						String marca = sc.nextLine();
						System.out.println("Ingrese el precio de la revista");
						double precio = sc.nextDouble();
						
						AltaRevista(revista, fechapublicacionR, editorialR , marca, precio);
						prueba2 = 1;
						break;
						
					case 3:
						
						System.out.println("Ingresar fecha de lanzamiento");
						String fechapublicacionAC = sc.nextLine();
						System.out.println("Ingresar nombre de editorial");
						String editorialAC = sc.nextLine();
						System.out.println("Ingrese el tema");
						String tema = sc.nextLine();
						System.out.println("Ingrese la institución");
						String institucion = sc.nextLine();
						
						AltaArticuloCientifico(articuloCientifico, fechapublicacionAC, editorialAC , tema, institucion);
						prueba3 = 1;
						
						break;
						
					case 4:
						
						System.out.println("\n");
						break;
						
					default:
						
						System.out.println("Opción Incorrecta");
						
						break;
					}
					
					
					
					
				} while (menuAltar != 4);
				
				
				
				break;
				
			case 2:
				
				if (prueba1+prueba2+prueba3 == 3) {
					
					do {
						
						System.out.println("\n\nMenu Listar:\n1)Listar Libros\n2)Listar Revistas\n3)Listar Articulos Científicos\n4)Salir");
						menuListar = sc.nextInt();
						sc.nextLine();
						
						
						switch (menuListar) {
						
						case 1:

							ListarLibros(libro);
							
							break;
							
						case 2:

							ListarRevistas(revista);
							
							break;
							
						case 3:

							ListarArticulosCientificos(articuloCientifico);
							
							break;
							
						case 4:
							
							System.out.println("\n");
							
							break;
							
						default:
							
							System.out.println("Opción Incorrecta");
							
							break;
						
						}
						
					}while (menuListar != 4);
					
				}else {
					
					System.out.println("Debes altar por lo menos una publicación de cada tipo");
					
				}
				
				
				
				break;
					

			case 3:
					
				System.out.println("Hasta luego!");
				
				break;
				
			default:
				
				System.out.println("Opción Incorrecta");
				
				break;
					
			}
		}while (menu != 3);
		
	}

	
	public static void AltaLibro(Libro[] L, String fechaPublicacion, String editorial, int numPag, boolean leido) {
		
		for (int i = 0; i < L.length; i++) {
			
			if (L[i] == null) {
				L[i] = new Libro(fechaPublicacion, editorial, numPag, leido);
				break;
			}	
		} 
		
	}
	
	
	public static void AltaRevista(Revista[] R, String fechaPublicacion, String editorial, String marca, double precio) {
		
		for (int i = 0; i < R.length; i++) {
			
			if (R[i] == null) {
				R[i] = new Revista(fechaPublicacion, editorial, marca, precio);
				break;
			}	
		} 
		
	}
	
	public static void AltaArticuloCientifico(ArticuloCientifico[] AC, String fechaPublicacion, String editorial, String tema, String institucion) {
		
		for (int i = 0; i < AC.length; i++) {
			
			if (AC[i] == null) {
				AC[i] = new ArticuloCientifico(fechaPublicacion, editorial, tema, institucion);
				break;
			}	
		} 
	}
	
	public static void ListarLibros(Libro[] L) {
		
		for (int i = 0; i < L.length; i++) {
			
			System.out.println("El libro se publicó el "+ L[i].getFechaLanzamiento() + " por la editorial "+ L[i].getEditorial()+ ", tiene "+ L[i].getNumeroPag()+ " paginas, y fue leido("+ L[i].getLeido()+").");
		}
		
	}
	
	public static void ListarRevistas(Revista[] R) {
		
		for (int i = 0; i < R.length; i++) {
			
			System.out.println("La revista se publicó el "+ R[i].getFechaLanzamiento() + " por la editorial "+ R[i].getEditorial()+ ", es de la marca "+ R[i].getMarca()+ ", y cuesta $"+ R[i].getPrecio()+" pesos.");
		}
	}
	
	public static void ListarArticulosCientificos(ArticuloCientifico[] AC) {
		
		for (int i = 0; i < AC.length; i++) {
	
			System.out.println("El articulo científico se publicó el "+ AC[i].getFechaLanzamiento() + " por la editorial "+ AC[i].getEditorial()+ ", habla sobre "+ AC[i].getTema()+ ", paginas, desarrollado por la institución: "+ AC[i].getInstitucion()+".");
		}
	}
	
}
