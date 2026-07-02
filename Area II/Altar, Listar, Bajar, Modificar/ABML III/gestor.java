package practico3;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu, menuAltar, menuListar, menuMod, menuBajar, id = 0;
		Apartamento apartamento[] = new Apartamento[10];
		Casa casa[] = new Casa[10];

		do {

			System.out.println(
					"Bienvenido al Programa\n1)Altar un Edificio\n2)Listar Edificios\n3)Modificar un Edificio\n4)Bajar un Edificio\n5)Salir");
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

						id = generarID(id);
						AltarApto(apartamento, materialA, valorA, cantidadHab, pisoUbi, id);
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

						id = generarID(id);
						AltarCasa(casa, materialC, valorC, cantPiso, metrosCuadrados, id);

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

				do {
					System.out.println("\n\nMenu Modificar:\n1)Modificar Apto\n2)Modificar Casa\n3)Salir");
					menuMod = sc.nextInt();
					sc.nextLine();

					switch (menuMod) {

					case 1:

						for (int i = 0; i < apartamento.length; i++) {

							if (apartamento[i] != null) {

								System.out.println("El apartamento esta hecho de " + apartamento[i].getMaterial()
										+ ", tiene un valor de $" + apartamento[i].getValor() + ". Tiene "
										+ apartamento[i].getCantHabitaciones()
										+ " habitaciones, el apartamento se encuentra en el piso "
										+ apartamento[i].getPisoUbi() + ". ID: " + apartamento[i].getId());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int a = sc.nextInt();
						sc.nextLine();

						ModificarApto(apartamento, a);

						break;

					case 2:

						for (int i = 0; i < casa.length; i++) {

							if (casa[i] != null) {

								System.out.println("La casa esta hecha de " + casa[i].getMaterial()
										+ ", tiene un valor de $" + casa[i].getValor() + ". Tiene "
										+ casa[i].getCantPisos() + " pisos, la casa es de "
										+ casa[i].getMetrosCuadrados() + " metros cuadrados. ID: " + casa[i].getId());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int b = sc.nextInt();
						sc.nextLine();

						ModificarCasa(casa, b);

						break;

					case 3:

						System.out.println("\n\n");

					default:

						System.out.println("Opción Inválida");

						break;

					}

				} while (menuMod != 3);

				break;
			case 4:
				do {
					System.out.println("\n\nMenu Bajar:\n1)Bajar Apartamento\n2)Bajar Casa\n3)Salir");
					menuBajar = sc.nextInt();
					sc.nextLine();

					switch (menuBajar) {

					case 1:

						int comp = 0;

						for (int i = 0; i < apartamento.length; i++) {

							if (apartamento[i] != null) {
								comp = 1;
							}

						}

						if (comp == 1) {

							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < apartamento.length; i++) {

								if (apartamento[i] != null) {

									System.out.println("El apartamento esta hecho de " + apartamento[i].getMaterial()
											+ ", tiene un valor de $" + apartamento[i].getValor() + ". Tiene "
											+ apartamento[i].getCantHabitaciones()
											+ " habitaciones, el apartamento se encuentra en el piso "
											+ apartamento[i].getPisoUbi() + ". ID: " + apartamento[i].getId());
								}
							}

							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();

							BajarApto(apartamento, selecID);

						} else {

							System.out
									.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
						}

						break;
					case 2:

						comp = 0;

						for (int i = 0; i < casa.length; i++) {

							if (casa[i] != null) {
								comp = 1;
							}

						}

						if (comp == 1) {

							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < casa.length; i++) {

								if (casa[i] != null) {

									System.out.println(i + ") La casa esta hecha de " + casa[i].getMaterial()
											+ ", tiene un valor de $" + casa[i].getValor() + ". Tiene "
											+ casa[i].getCantPisos() + " pisos, la casa es de "
											+ casa[i].getMetrosCuadrados() + " metros cuadrados. ID: "
											+ casa[i].getId());

								}
							}

							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();

							BajarCasa(casa, selecID);

						} else {

							System.out.println(
									"Debe haber una revista registrada (Altar) para poder elimminarla (Bajar).");
						}

						break;
					case 3:

						System.out.println("\n\n");
						break;
					default:

						System.out.println("Opción Inválida");
						break;
					}

				} while (menuBajar != 3);
				break;
			case 5:

				System.out.println("¡Hasta Luego!");
				break;
			default:

				System.out.println("Opción Inválida");

				break;

			}

		} while (menu != 3);
	}

	public static void AltarApto(Apartamento[] a, String material, int valor, int cantHabitaciones, int pisoUbi,
			int id) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {

				a[i] = new Apartamento(id, material, valor, cantHabitaciones, pisoUbi);
				break;
			}
		}

	}

	public static void AltarCasa(Casa[] a, String material, int valor, int CantPisos, int metrosCuadrados, int id) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {

				a[i] = new Casa(id, material, valor, CantPisos, metrosCuadrados);
				break;
			}
		}

	}

	public static void ListarApto(Apartamento[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("El apartamento esta hecho de " + a[i].getMaterial() + ", tiene un valor de $"
						+ a[i].getValor() + ". Tiene " + a[i].getCantHabitaciones()
						+ " habitaciones, el apartamento se encuentra en el piso " + a[i].getPisoUbi() + ". ID: "
						+ a[i].getId());

			}
		}

	}

	public static void ListarCasa(Casa[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("La casa esta hecha de " + a[i].getMaterial() + ", tiene un valor de $"
						+ a[i].getValor() + ". Tiene " + a[i].getCantPisos() + " pisos, la casa es de "
						+ a[i].getMetrosCuadrados() + " metros cuadrados. ID: " + a[i].getId());

			}
		}

	}

	public static void ModificarApto(Apartamento[] A, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Indica que atributo quieres modificar: (a,b,c,d) \na) Material\nb) Valor\nc) Cantidad de Habitaciones\nd) Ubicacion del piso");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Material del Edificio");
			String material = sc.nextLine();

			A[a].setMaterial(material);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Valor del edificio.");
			int valor = sc.nextInt();
			sc.nextLine();

			A[a].setValor(valor);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese la Cantidad de Habitaciones");
			int cantHab = sc.nextInt();
			sc.nextLine();

			A[a].setCantHabitaciones(cantHab);

			break;

		case 'd':

			sc.nextLine();
			System.out.println("Ingrese la Ubicacion del Piso");
			int ubicacionPiso = sc.nextInt();
			sc.nextLine();

			A[a].setPisoUbi(ubicacionPiso);

			break;

		default:

			System.out.println("Opción Incorrecta");
		}

	}

	public static void ModificarCasa(Casa[] C, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Indica que atributo quieres modificar: (a,b,c,d) \na) Material\nb) Valor\nc) Cantidad de Pisos\nd) Metros Cuadrados");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Material del edificio");
			String material = sc.nextLine();

			C[a].setMaterial(material);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Valor del edificio");
			int valor = sc.nextInt();
			sc.nextLine();

			C[a].setValor(valor);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese la Cantidad de Pisos de la casa");
			int pisos = sc.nextInt();
			sc.nextLine();

			C[a].setCantPisos(pisos);

			break;

		case 'd':

			sc.nextLine();
			System.out.println("Ingrese la nueva Cantidad de Metros Cuadrados");
			int metrosCuadrados = sc.nextInt();
			sc.nextLine();

			C[a].setMetrosCuadrados(metrosCuadrados);

			break;

		default:

			System.out.println("Opción Incorrecta");
		}

	}

	public static void BajarApto(Apartamento[] A, int id) {
		int comp = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] != null && A[i].getId() == id) {

				A[i] = null;
				System.out.println("Publicación Eliminada");

				return;

			} else {

				comp = 1;
			}
		}

		if (comp == 1) {

			System.out.println("Algo salió mal, vuelvelo a intentar.");
		}

	}
	
	public static void BajarCasa(Casa[] C, int id) {
		int comp = 0;

		for (int i = 0; i < C.length; i++) {

			if (C[i] != null && C[i].getId() == id) {

				C[i] = null;
				System.out.println("Publicación Eliminada");

				return;

			} else {

				comp = 1;
			}
		}

		if (comp == 1) {

			System.out.println("Algo salió mal, vuelvelo a intentar.");
		}

	}

	public static int generarID(int id) {

		id = id + 1;

		return id;
	}

}
