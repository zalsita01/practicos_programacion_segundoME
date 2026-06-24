package practico4;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu, menuAltar, menuListar;

		Pintura pintura[] = new Pintura[10];
		Escultura escultura[] = new Escultura[10];
		Fotografia fotografia[] = new Fotografia[10];

		do {

			System.out.println("Bienvenido al programa\n1)Altar Obras de Arte\nListar Obras de Arte\n3)Salir");
			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {

			case 1:

				do {
					System.out.println("Menu Altar:\n1)Altar Pintura\n2)Altar Escultura\n3)Altar Fotografía\n4)Salir");
					menuAltar = sc.nextInt();
					sc.nextLine();

					switch (menuAltar) {

					case 1:

						System.out.println("Ingrese el nombre del autor");
						String autorP = sc.nextLine();
						System.out.println("Ingrese el año de creacion de la obra");
						int añoCreacionP = sc.nextInt();
						sc.nextLine();

						System.out.println(
								"Introduzca el nombre de la paleta de color utilizada para la pintura (ej: calida, fría)");
						String paleta = sc.nextLine();
						System.out.println("Introduzca el area del lienzo en centimetros cuadrados (ej: 100)");
						int tamañoArea = sc.nextInt();
						sc.nextLine();

						AltarPintura(pintura, autorP, añoCreacionP, paleta, tamañoArea);

						break;
					case 2:

						System.out.println("Ingrese el nombre del autor");
						String autorE = sc.nextLine();
						System.out.println("Ingrese el año de creacion de la obra");
						int añoCreacionE = sc.nextInt();
						sc.nextLine();

						System.out.println("Ingrese el material de la escultura");
						String material = sc.nextLine();
						System.out.println("Ingrese el tema en el que esta basada la escultura");
						String tema = sc.nextLine();

						AltarEscultura(escultura, autorE, añoCreacionE, material, tema);

						break;
					case 3:

						System.out.println("Ingrese el nombre del autor");
						String autorF = sc.nextLine();
						System.out.println("Ingrese el año de creacion de la obra");
						int añoCreacionF = sc.nextInt();
						sc.nextLine();

						System.out.println("Ingrese el nombre de la cámara que tomó la fotografía");
						String camaraProv = sc.nextLine();
						System.out.println("Ingrese la resolución de la fotografía (pj: 1080)");
						int resolucion = sc.nextInt();
						sc.nextLine();

						AltarFotografia(fotografia, autorF, añoCreacionF, camaraProv, resolucion);

						break;
					case 4:

						System.out.println("\n");

						break;
					default:

						System.out.println("Opción invalida");

						break;

					}

				} while (menuAltar != 4);

				break;
			case 2:

				do {
					System.out.println(
							"Menu Listar:\n1)Listar Pintura\n2)Listar Escultura\n3)Listar Fotografía\n4)Salir");
					menuAltar = sc.nextInt();
					sc.nextLine();

					switch (menuAltar) {

					case 1:

						ListarPintura(pintura);

						break;
					case 2:

						ListarEscultura(escultura);

						break;
					case 3:

						ListarFotografia(fotografia);

						break;
					case 4:

						System.out.println("\n");

						break;
					default:

						System.out.println("Opción invalida");

						break;

					}

				} while (menuAltar != 4);

				break;
			case 3:

				System.out.println("Hasta Luego!");

				break;
			default:

				System.out.println("Opción Incorrecta");

				break;
			}

		} while (menu != 3);

	}

	public static void AltarPintura(Pintura[] p, String autor, int añoCreacion, String paleta, int tamañoArea) {

		for (int i = 0; i < p.length; i++) {

			if (p[i] == null) {

				p[i] = new Pintura(autor, añoCreacion, paleta, tamañoArea);
				break;
			}
		}

	}

	public static void AltarEscultura(Escultura[] p, String autor, int añoCreacion, String material, String tema) {

		for (int i = 0; i < p.length; i++) {

			if (p[i] == null) {

				p[i] = new Escultura(autor, añoCreacion, material, tema);
				break;
			}
		}

	}

	public static void AltarFotografia(Fotografia[] p, String autor, int añoCreacion, String camaraProv,
			int resolucion) {

		for (int i = 0; i < p.length; i++) {

			if (p[i] == null) {

				p[i] = new Fotografia(autor, añoCreacion, camaraProv, resolucion);
				break;
			}
		}

	}

	public static void ListarPintura(Pintura[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("El autor de la pintura se llama " + a[i].getAutor() + " y la creo en el año "
						+ a[i].getAñoCreacion() + ". Se uso una paleta de colores " + a[i].getPaletaPrincipal()
						+ ". El tamaño del area de la pintura es de " + a[i].getTamañoArea()
						+ " centimetros cuadrados.");

			}
		}
	}

	public static void ListarEscultura(Escultura[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("El autor de la escultura se llama " + a[i].getAutor() + " y la creo en el año "
						+ a[i].getAñoCreacion() + ". Esta hecha de " + a[i].getMaterial()
						+ ". La escultura se baso en el tema: " + a[i].getTema() + ".");

			}
		}
	}

	public static void ListarFotografia(Fotografia[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("El autor de la pintura se llama " + a[i].getAutor() + " y la creo en el año "
						+ a[i].getAñoCreacion() + ". La fotografía fue tomada por " + a[i].getCamaraProv()
						+ ". La fotografia tiene una resolución de " + a[i].getResolucion() + " pixeles.");

			}
		}
	}
}
