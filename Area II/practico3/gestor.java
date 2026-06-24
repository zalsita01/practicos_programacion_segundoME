package practico3;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu, menuAltar, menuListar;
		Apartamento apartamento[] = new Apartamento[10];
		Casa casa[] = new Casa[10];

		do {

			System.out.println("Bienvenido al Programa\n1)Altar un Edificio\n2)Listar Edificios\n3)Salir");
			menu = sc.nextInt();

			switch (menu) {

			case 1:

				do {
					System.out.println("Menu Altar\n1)Altar Apartamento\n2)Altar Casa\n3)Salir");
					menuAltar = sc.nextInt();

					switch (menuAltar) {

					case 1:
						System.out.println("Ingrese el material del que esta hecho el apto");
						String materialA = sc.nextLine();
						System.out.println("Ingrese el valor del apto");
						int valorA = sc.nextInt();
						sc.nextLine();
						System.out.println("Ingrese la cantidad de habitaciones del apto");
						int cantidadHab = sc.nextInt();
						sc.nextLine();
						System.out.println("Ingrese el piso en el que se encuentra el apto");
						int pisoUbi = sc.nextInt();
						sc.nextLine();

						AltarApto(apartamento, materialA, valorA, cantidadHab, pisoUbi);
						break;
					case 2:

						System.out.println("Ingrese el material del que esta hecha la casa");
						String materialC = sc.nextLine();
						System.out.println("Ingrese el valor de la casa");
						int valorC = sc.nextInt();
						sc.nextLine();
						System.out.println("Ingrese la cantidad de pisos de la casa");
						int cantPiso = sc.nextInt();
						sc.nextLine();
						System.out.println("Introduzca el tamaño de su casa en metros cuadrados (pj: 32)");
						int metrosCuadrados = sc.nextInt();
						sc.nextLine();

						AltarCasa(casa, materialC, valorC, cantPiso, metrosCuadrados);
						break;
					case 3:

						System.out.println("\n");

						break;
					default:

						System.out.println("Opción Inválida");

						break;

					}
				} while (menuAltar != 3);

				break;
			case 2:

				do {
					System.out.println("Menu Listar\n1)Listar Apartamento\n2)Listar Casa\n3)Salir");
					menuListar = sc.nextInt();

					switch (menuListar) {

					case 1:

						ListarApto(apartamento);

						break;
					case 2:

						ListarCasa(casa);

						break;
					case 3:

						System.out.println("\n");

						break;
					default:

						System.out.println("Opción Inválida");

						break;

					}
				} while (menuListar != 3);

				break;
			case 3:

				break;
			default:

				System.out.println("Opción Inválida");

				break;

			}

		} while (menu != 3);
	}

	public static void AltarApto(Apartamento[] a, String material, int valor, int cantHabitaciones, int pisoUbi) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {

				a[i] = new Apartamento(material, valor, cantHabitaciones, pisoUbi);
				break;
			}
		}

	}

	public static void AltarCasa(Casa[] a, String material, int valor, int CantPisos, int metrosCuadrados) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {

				a[i] = new Casa(material, valor, CantPisos, metrosCuadrados);
				break;
			}
		}

	}

	public static void ListarApto(Apartamento[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("El apartamento esta hecho de " + a[i].getMaterial() + ", tiene un valor de $"
						+ a[i].getValor() + ". Tiene " + a[i].getCantHabitaciones()
						+ " habitaciones, el apartamento se encuentra en el piso " + a[i].getPisoUbi() + ".");

			}
		}

	}

	public static void ListarCasa(Casa[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("La casa esta hecha de " + a[i].getMaterial() + ", tiene un valor de $"
						+ a[i].getValor() + ". Tiene " + a[i].getCantPisos() + " pisos, la casa es de "
						+ a[i].getMetrosCuadrados() + " metros cuadrados.");

			}
		}

	}

}
