package practico1;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Electronica electronica[] = new Electronica[10];
		Ropa ropa[] = new Ropa[10];
		Alimento alimento[] = new Alimento[10];

		int menu, menuAltar, menuListar, menuBajar, menuMod, id = 0;

		do {
			System.out.println(
					"Bienvenido al gestor del supermercado: \n1)Altar productos\n2)Listar productos\n3)Modificar Productos\n4)Bajar Productos\n5)Salir");
			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {

			case 1: // ALTAR

				do {
					System.out.println(
							"\n\nElige producto: \n1)Ingresar un producto electronico\n2)Ingresar un producto alimenticio\n3)Ingresar un producto de vestimenta (ropa)\n4)Salir");
					menuAltar = sc.nextInt();
					sc.nextLine();

					switch (menuAltar) {

					case 1:

						System.out.println("Ingresa el nombre del producto electronico: ");
						String nombrePE = sc.nextLine();
						System.out.println("Ingrese el precio del producto electronico: ");
						int precioPE = sc.nextInt();
						sc.nextLine();
						System.out.println("Ingrese el modelo del producto electronico: ");
						String modeloPE = sc.nextLine();

						id = generarID(id);
						altaProductoEletronica(electronica, nombrePE, id, precioPE, modeloPE);

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

						id = generarID(id);
						altaProductoAlimenticio(alimento, nombrePA, precioPA, id, fechaCaducidad, sabor);

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

						id = generarID(id);
						altaProductoVestimenta(ropa, nombrePR, precioPR, id, talle, material);

						break;

					case 4:

						System.out.println("\n\n");

						break;

					default:

						System.out.println("Opción incorrecta");
						break;
					}

				} while (menuAltar != 4);

				break;

			case 2: // LISTAR

				// menu de listar
				do {

					System.out.println(
							"\n\nElige producto: \n1)Listar productos electronicos\n2)Listar productos alimenticios\n3)Listar productos de vestimenta (ropa)\n4)Salir");
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

				} while (menuListar != 4);

				break;

			case 3: // MODIFICAR

				do {
					System.out.println(
							"\n\nMenu Modificar:\n1)Modificar Producto Electronico\n2)Modificar Producto de Vestimenta\n3)Modificar Producto Alimenticio\n4)Salir");
					menuMod = sc.nextInt();
					sc.nextLine();

					switch (menuMod) {

					case 1:

						for (int i = 0; i < electronica.length; i++) {

							if (electronica[i] != null) {

								System.out.println(i+") El producto electronico '" + electronica[i].getNombre()
										+ "', modelo " + electronica[i].getModelo() + ", tiene un valor de $"
										+ electronica[i].getPrecio() + " pesos. ID: " + electronica[i].getIdE());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int a = sc.nextInt();
						sc.nextLine();

						ModificarElectronica(electronica, a);

						break;

					case 2:

						for (int i = 0; i < ropa.length; i++) {

							if (ropa[i] != null) {

								System.out.println(i+") El producto de vestimenta '" + ropa[i].getNombre() + "' hecho de "
										+ ropa[i].getMaterial() + ", talle " + ropa[i].getTalle()
										+ ", tiene un valor de $" + ropa[i].getPrecio() + " pesos. ID:"
										+ ropa[i].getIdR());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int b = sc.nextInt();
						sc.nextLine();

						ModificarRopa(ropa, b);
						break;

					case 3:

						for (int i = 0; i < alimento.length; i++) {

							if (alimento[i] != null) {

								System.out.println(i+") El producto alimenticio '" + alimento[i].getNombre()
										+ "' con sabor a " + alimento[i].getSabor() + " vence el "
										+ alimento[i].getFechaCaducidad() + ", tiene un valor de $"
										+ alimento[i].getPrecio() + " pesos. ID: " + alimento[i].getIdA());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int c = sc.nextInt();
						sc.nextLine();

						ModificarAlimento(alimento, c);

						break;

					case 4:

						System.out.println("\n\n");

					default:

						System.out.println("Opción Inválida");

						break;

					}

				} while (menuMod != 4);

				break;

			case 4: // BAJAR

				do {
					System.out.println(
							"\n\nMenu Bajar:\n1)Bajar Producto Electronica\n2)Bajar Producto de Vestimenta\n3)Bajar Producto Alimenticio\n4)Salir");
					menuBajar = sc.nextInt();
					sc.nextLine();

					switch (menuBajar) {

					case 1:

						int comp = 0;

						for (int i = 0; i < electronica.length; i++) {

							if (electronica[i] != null) {
								comp = 1;
							}

						}

						if (comp == 1) {

							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < electronica.length; i++) {

								if (electronica[i] != null) {

									System.out.println("El producto electronico '" + electronica[i].getNombre()
											+ "', modelo " + electronica[i].getModelo() + ", tiene un valor de $"
											+ electronica[i].getPrecio() + " pesos. ID: " + electronica[i].getIdE());

								}
							}

							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();

							BajarElectronica(electronica, selecID);

						} else {

							System.out
									.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
						}

						break;
					case 2:

						comp = 0;

						for (int i = 0; i < ropa.length; i++) {

							if (ropa[i] != null) {
								comp = 1;
							}

						}

						if (comp == 1) {

							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < ropa.length; i++) {

								if (ropa[i] != null) {

									System.out.println("El producto de vestimenta '" + ropa[i].getNombre()
											+ "' hecho de " + ropa[i].getMaterial() + ", talle " + ropa[i].getTalle()
											+ ", tiene un valor de $" + ropa[i].getPrecio() + " pesos. ID:"
											+ ropa[i].getIdR());

								}
							}

							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();

							BajarRopa(ropa, selecID);

						} else {

							System.out.println(
									"Debe haber una revista registrada (Altar) para poder elimminarla (Bajar).");
						}
						break;
					case 3:

						comp = 0;

						for (int i = 0; i < alimento.length; i++) {

							if (alimento[i] != null) {
								comp = 1;
							}

						}

						if (comp == 1) {

							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < ropa.length; i++) {

								if (alimento[i] != null) {

									System.out.println("El producto alimenticio '" + alimento[i].getNombre()
											+ "' con sabor a " + alimento[i].getSabor() + " vence el "
											+ alimento[i].getFechaCaducidad() + ", tiene un valor de $"
											+ alimento[i].getPrecio() + " pesos. ID: " + alimento[i].getIdA());

								}
							}

							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();

							BajarAlimento(alimento, selecID);

						} else {

							System.out
									.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
						}
						break;
					case 4:
						System.out.println("\n\n");
						break;
					default:
						System.out.println("Opción Inválida");
						break;
					}

				} while (menuBajar != 4);

				break;
			case 5:

				System.out.println("Hasta Luego!");

				break;
			default:

				System.out.println("Opción incorrecta");

				break;
			}

		} while (menu != 5);
	}

	public static void altaProductoEletronica(Electronica[] a, String nombre, int idE, int precio, String modelo) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new Electronica(nombre, precio, idE, modelo);
				break;
			}
		}
	}

	public static void altaProductoAlimenticio(Alimento[] a, String nombre, int precio, int idA, String fechaCaducidad,
			String sabor) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new Alimento(nombre, precio, idA, fechaCaducidad, sabor);
				break;
			}
		}
	}

	public static void altaProductoVestimenta(Ropa[] a, String nombre, int precio, int idR, String talle,
			String material) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new Ropa(nombre, precio, idR, talle, material);
				break;
			}
		}
	}

	public static void listarProductoElectronica(Electronica[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("El producto electronico '" + a[i].getNombre() + "', modelo " + a[i].getModelo()
						+ ", tiene un valor de $" + a[i].getPrecio() + " pesos. ID: " + a[i].getIdE());

			}
		}

	}

	public static void listarProductoAlimenticio(Alimento[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("El producto alimenticio '" + a[i].getNombre() + "' con sabor a " + a[i].getSabor()
						+ " vence el " + a[i].getFechaCaducidad() + ", tiene un valor de $" + a[i].getPrecio()
						+ " pesos. ID: " + a[i].getIdA());

			}
		}

	}

	public static void listarProductoVestimenta(Ropa[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("El producto de vestimenta '" + a[i].getNombre() + "' hecho de " + a[i].getMaterial()
						+ ", talle " + a[i].getTalle() + ", tiene un valor de $" + a[i].getPrecio() + " pesos. ID:"
						+ a[i].getIdR());

			}
		}

	}

	public static void ModificarElectronica(Electronica[] E, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica que atributo quieres modificar: (a,b,c) \na) Nombre\nb) Precio\nc) Modelo");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Nombre del Producto");
			String nombre = sc.nextLine();

			E[a].setNombre(nombre);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Precio del Producto");
			int precio = sc.nextInt();
			sc.nextLine();

			E[a].setPrecio(precio);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Modelo del Producto");
			String modelo = sc.nextLine();

			E[a].setModelo(modelo);

			break;

		default:

			System.out.println("Opción Incorrecta");

			break;
		}
	}

	public static void ModificarRopa(Ropa[] R, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Indica que atributo quieres modificar: (a,b,c) \na) Nombre\nb) Precio\nc) Talle\nd) Material");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Nombre del Producto");
			String nombre = sc.nextLine();

			R[a].setNombre(nombre);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Precio del Producto");
			int precio = sc.nextInt();
			sc.nextLine();

			R[a].setPrecio(precio);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Talle de la prenda");
			String talle = sc.nextLine();

			R[a].setTalle(talle);

			break;

		case 'd':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Material de la prenda");
			String material = sc.nextLine();

			R[a].setMaterial(material);

			break;

		default:

			System.out.println("Opción Incorrecta");

			break;
		}
	}

	public static void ModificarAlimento(Alimento[] A, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Indica que atributo quieres modificar: (a,b,c) \na) Nombre\nb) Precio\nc) Fecha de Caducidad\nd) Sabor");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Nombre del Producto");
			String nombre = sc.nextLine();

			A[a].setNombre(nombre);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Precio del Producto");
			int precio = sc.nextInt();
			sc.nextLine();

			A[a].setPrecio(precio);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese la nueva fecha de caducidad del Alimento");
			String fechaCaducidad = sc.nextLine();

			A[a].setFechaCaducidad(fechaCaducidad);

			break;

		case 'd':

			sc.nextLine();
			System.out.println("Ingrese el nuevo sabor del Alimento");
			String sabor = sc.nextLine();

			A[a].setSabor(sabor);

			break;

		default:

			System.out.println("Opción Incorrecta");

			break;
		}
	}

	public static void BajarElectronica(Electronica[] E, int id) {

		int comprobacion = 0;
		
		for (int i = 0; i < E.length; i++) {

			if (E[i] != null && E[i].getIdE() == id) {

				E[i] = null;
				System.out.println("Producto eliminado");

				break;
				
			} else {

				comprobacion = 1;
			}
			
			if (comprobacion == 1) {
				
				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}
	
	public static void BajarRopa(Ropa[] R, int id) {

		int comprobacion = 0;
		
		for (int i = 0; i < R.length; i++) {

			if (R[i] != null && R[i].getIdR() == id) {

				R[i] = null;
				System.out.println("Producto eliminado");

				break;
				
			} else {

				comprobacion = 1;
			}
			
			if (comprobacion == 1) {
				
				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}
	
	public static void BajarAlimento(Alimento[] A, int id) {

		int comprobacion = 0;
		
		for (int i = 0; i < A.length; i++) {

			if (A[i] != null && A[i].getIdA() == id) {

				A[i] = null;
				System.out.println("Producto eliminado");

				break;
				
			} else {

				comprobacion = 1;
			}
			
			if (comprobacion == 1) {
				
				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}

	public static int generarID(int id) {

		id = id + 1;

		return id;

	}

}
