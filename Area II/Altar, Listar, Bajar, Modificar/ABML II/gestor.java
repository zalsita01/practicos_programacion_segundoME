package practico2;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menu, menuAltar, menuListar, menuBajar, menuMod, id = 0;
		Libro libro[] = new Libro[10];
		Revista revista[] = new Revista[10];
		ArticuloCientifico articuloCientifico[] = new ArticuloCientifico[10];

		do {

			System.out.println(
					"Bienvenido al programa\nSeleccione una opción:\n1)Altar Publicaciones\n2)Listar Publicaciones\n3)Modificar Publicación\n4)Bajar Publicación\n5)Salir");
			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {

			case 1: //ALTAR

				do {

					System.out.println(
							"\n\nMenu Altar:\n1)Altar Libro\n2)Altar Revista\n3)Altar Articulo Científico\n4)Salir");
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

						id = generarID(id);
						AltaLibro(libro, fechapublicacionL, editorialL, numeroPag, leido, id);
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

						id = generarID(id);
						AltaRevista(revista, fechapublicacionR, editorialR, marca, precio, id);
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

						id = generarID(id);
						AltaArticuloCientifico(articuloCientifico, fechapublicacionAC, editorialAC, tema, institucion,
								id);
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

			case 2: //LISTAR

				do {

					System.out.println(
							"\n\nMenu Listar:\n1)Listar Libros\n2)Listar Revistas\n3)Listar Articulos Científicos\n4)Salir");
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

				} while (menuListar != 4);

				break;

			case 3: //MODIFICAR

				do {
					System.out.println(
							"\n\nMenu Modificar:\n1)Modificar Libro\n2)Modificar Revista\n3)Modificar Articulo Científico\n4)Salir");
					menuMod = sc.nextInt();
					sc.nextLine();
					System.out.println("flG: " + menuMod);

					switch (menuMod) {

					case 1:

						for (int i = 0; i < libro.length; i++) {

							if (libro[i] != null) {

								System.out.println(i + ") El libro se publicó el " + libro[i].getFechaLanzamiento()
										+ " por la editorial " + libro[i].getEditorial() + ", tiene "
										+ libro[i].getNumeroPag() + " paginas, y fue leido(" + libro[i].getLeido()
										+ "). ID: " + libro[i].getIdL());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int a = sc.nextInt();
						sc.nextLine();

						ModificarLibro(libro, a);

						break;

					case 2:

						for (int i = 0; i < revista.length; i++) {

							if (revista[i] != null) {

								System.out.println(i + ") La revista se publicó el " + revista[i].getFechaLanzamiento()
										+ " por la editorial " + revista[i].getEditorial() + ", es de la marca "
										+ revista[i].getMarca() + ", y cuesta $" + revista[i].getPrecio()
										+ " pesos. ID:" + revista[i].getIdR());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int b = sc.nextInt();
						sc.nextLine();

						ModificarRevista(revista, b);
						break;

					case 3:

						for (int i = 0; i < articuloCientifico.length; i++) {

							if (articuloCientifico[i] != null) {

								System.out.println(i + ") El articulo científico se publicó el "
										+ articuloCientifico[i].getFechaLanzamiento() + " por la editorial "
										+ articuloCientifico[i].getEditorial() + ", habla sobre "
										+ articuloCientifico[i].getTema()
										+ ", paginas, desarrollado por la institución: "
										+ articuloCientifico[i].getInstitucion() + ". ID: "
										+ articuloCientifico[i].getIdA());

							}
						}

						System.out.println("Elije uno de la lista: ");
						int c = sc.nextInt();
						sc.nextLine();

						ModificarArticuloCientifico(articuloCientifico, c);

						break;

					case 4:

						System.out.println("\n\n");

					default:

						System.out.println("Opción Inválida");

						break;

					}

				} while (menuMod != 4);

				break;

			case 4: //BAJAR

				do {
					System.out.println("\n\nMenu Bajar:\n1)Bajar Libro\n2)Bajar Revista\n3)Bajar Articulo Científico\n4)Salir");
					menuBajar = sc.nextInt();
					sc.nextLine();
					
					switch (menuBajar){
					
					case 1:
						
						int comp = 0;
						
						for(int i = 0; i < libro.length; i++) {
							
							if (libro[i] != null) {
								comp = 1;
							}
							
						}
						
						if ( comp == 1) {
							
							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < libro.length; i++) {

								if (libro[i] != null) {

									System.out.println("El libro se publicó el " + libro[i].getFechaLanzamiento() + " por la editorial "
											+ libro[i].getEditorial() + ", tiene " + libro[i].getNumeroPag() + " paginas, y fue leido("
											+ libro[i].getLeido() + "). ID: " + libro[i].getIdL());

								}
							}
							
							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();
							
							BajarLibro(libro, selecID);
							
						}else {
							
							System.out.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
						}
						
						
						break;
					case 2:
						
						comp = 0;
						
						for(int i = 0; i < revista.length; i++) {
							
							if (revista[i] != null) {
								comp = 1;
							}
							
						}
						
						if (comp == 1) {
							
							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < revista.length; i++) {

								if (libro[i] != null) {

									System.out.println("La revista se publicó el " + revista[i].getFechaLanzamiento() + " por la editorial "
											+ revista[i].getEditorial() + ", es de la marca " + revista[i].getMarca() + ", y cuesta $"
											+ revista[i].getPrecio() + " pesos. ID: " + revista[i].getIdR());

								}
							}
							
							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();
							
							BajarRevista(revista, selecID);
							
						}else {
							
							System.out.println("Debe haber una revista registrada (Altar) para poder elimminarla (Bajar).");
						}
						break;
					case 3:
						
						comp = 0;
						
						for(int i = 0; i < articuloCientifico.length; i++) {
							
							if (articuloCientifico[i] != null) {
								comp = 1;
							}
							
						}
						
						if (comp == 1) {
							
							System.out.println("Elegir de la lista: \n");
							for (int i = 0; i < articuloCientifico.length; i++) {

								if (articuloCientifico[i] != null) {

									System.out.println("El articulo científico se publicó el " + articuloCientifico[i].getFechaLanzamiento()
											+ " por la editorial " + articuloCientifico[i].getEditorial() + ", habla sobre " + articuloCientifico[i].getTema()
											+ ", paginas, desarrollado por la institución: " + articuloCientifico[i].getInstitucion() + ". ID: "
											+ articuloCientifico[i].getIdA());

								}
							}
							
							System.out.println("Introduzca el ID del producto a eliminar");
							int selecID = sc.nextInt();
							sc.nextLine();
							
							BajarRevista(revista, selecID);
							
						}else {
							
							System.out.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
						}
						break;
					case 4:
						System.out.println("\n\n");
						break;
					default:
						System.out.println("Opción Inválida");
						break;
					}
					
				}while (menuBajar != 4);

				break;
			case 5:

				System.out.println("Hasta luego!");

				break;

			default:

				System.out.println("Opción Incorrecta");

				break;

			}
		} while (menu != 5);

	}

	public static void AltaLibro(Libro[] L, String fechaPublicacion, String editorial, int numPag, boolean leido,
			int id) {

		for (int i = 0; i < L.length; i++) {

			if (L[i] == null) {
				L[i] = new Libro(fechaPublicacion, editorial, id, numPag, leido);
				break;
			}
		}

	}

	public static void AltaRevista(Revista[] R, String fechaPublicacion, String editorial, String marca, double precio,
			int id) {

		for (int i = 0; i < R.length; i++) {

			if (R[i] == null) {
				R[i] = new Revista(fechaPublicacion, editorial, id, marca, precio);
				break;
			}
		}

	}

	public static void AltaArticuloCientifico(ArticuloCientifico[] AC, String fechaPublicacion, String editorial,
			String tema, String institucion, int id) {

		for (int i = 0; i < AC.length; i++) {

			if (AC[i] == null) {
				AC[i] = new ArticuloCientifico(fechaPublicacion, editorial, id, tema, institucion);
				break;
			}
		}
	}

	public static void ListarLibros(Libro[] L) {

		for (int i = 0; i < L.length; i++) {

			if (L[i] != null) {

				System.out.println("El libro se publicó el " + L[i].getFechaLanzamiento() + " por la editorial "
						+ L[i].getEditorial() + ", tiene " + L[i].getNumeroPag() + " paginas, y fue leido("
						+ L[i].getLeido() + "). ID: " + L[i].getIdL());

			}
		}

	}

	public static void ListarRevistas(Revista[] R) {

		for (int i = 0; i < R.length; i++) {
			if (R[i] != null) {

				System.out.println("La revista se publicó el " + R[i].getFechaLanzamiento() + " por la editorial "
						+ R[i].getEditorial() + ", es de la marca " + R[i].getMarca() + ", y cuesta $"
						+ R[i].getPrecio() + " pesos. ID: " + R[i].getIdR());

			}
		}
	}

	public static void ListarArticulosCientificos(ArticuloCientifico[] AC) {

		for (int i = 0; i < AC.length; i++) {

			if (AC[i] != null) {

				System.out.println("El articulo científico se publicó el " + AC[i].getFechaLanzamiento()
						+ " por la editorial " + AC[i].getEditorial() + ", habla sobre " + AC[i].getTema()
						+ ", paginas, desarrollado por la institución: " + AC[i].getInstitucion() + ". ID: "
						+ AC[i].getIdA());

			}
		}
	}

	public static void ModificarLibro(Libro[] L, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Indica que atributo quieres modificar: (a,b,c,d) \na) Fecha de Publicación\nb) Editorial\nc) Número de Páginas\nd) 'Leido'");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese la nueva Fecha de Publicación del libro");
			String newFPLibro = sc.nextLine();

			L[a].setFechaLanzamiento(newFPLibro);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese la nueva Editorial");
			String newEditorialLibro = sc.nextLine();

			L[a].setEditorial(newEditorialLibro);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Número de Páginas");
			int newNumPag = sc.nextInt();
			sc.nextLine();

			L[a].setNumeroPag(newNumPag);

			break;

		case 'd':

			sc.nextLine();
			System.out.println("Ingrese nuevo valor de 'Leído' (true/faalse)");
			boolean newLeido = sc.nextBoolean();

			L[a].setLeido(newLeido);

			break;

		default:

			System.out.println("Opción Incorrecta");
		}

	}

	public static void ModificarRevista(Revista[] R, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Indica que atributo quieres modificar: (a,b,c,d) \na) Fecha de Publicación\nb) Editorial\nc) Marca\nd) Precio");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese la nueva Fecha de Publicación del libro");
			String newFPrevista = sc.nextLine();

			R[a].setFechaLanzamiento(newFPrevista);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese la nueva Editorial");
			String newEditorialRevista = sc.nextLine();

			R[a].setEditorial(newEditorialRevista);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese la nueva Marca de la revista");
			String newMarca = sc.nextLine();

			R[a].setMarca(newMarca);

			break;

		case 'd':

			sc.nextLine();
			System.out.println("Ingrese nuevo precio de la Revista");
			double newPrecio = sc.nextDouble();

			R[a].setPrecio(newPrecio);

			break;

		default:

			System.out.println("Opción Incorrecta");
		}

	}

	public static void ModificarArticuloCientifico(ArticuloCientifico[] AC, int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Indica que atributo quieres modificar: (a,b,c,d) \na) Fecha de Publicación\nb) Editorial\nc) Tema\nd) Institución");
		char atributo = sc.next().charAt(0);

		switch (atributo) {

		case 'a':

			sc.nextLine();
			System.out.println("Ingrese la nueva fecha de publicación del libro");
			String newFPac = sc.nextLine();

			AC[a].setFechaLanzamiento(newFPac);

			break;

		case 'b':

			sc.nextLine();
			System.out.println("Ingrese la nueva Editorial");
			String newEditorialAC = sc.nextLine();

			AC[a].setEditorial(newEditorialAC);

			break;

		case 'c':

			sc.nextLine();
			System.out.println("Ingrese el nuevo Tema");
			String newTema = sc.nextLine();

			AC[a].setTema(newTema);

			break;

		case 'd':

			sc.nextLine();
			System.out.println("Ingrese la nueva Institución");
			String newInstitucion = sc.nextLine();

			AC[a].setInstitucion(newInstitucion);

			break;

		default:

			System.out.println("Opción Incorrecta");
		}

	}

	public static void BajarLibro(Libro[] L, int id) {
		
		int comp = 0;
		
		for (int i = 0; i < L.length; i++) {
			
			if (L[i] != null && L[i].getIdL() == id) {
				
				L[i] = null;
				System.out.println("Publicación Eliminada");
				
				return;
				
			}else {
			
				comp = 1;
			}
		}
		
		if (comp == 1) {
			
			System.out.println("Algo salió mal, vuelvelo a intentar.");
		}
	
	}
	
	public static void BajarRevista(Revista[] R, int id) {
		
		int comp = 0;
		
		for (int i = 0; i < R.length; i++) {
			
			if (R[i] != null && R[i].getIdR() == id) {
				
				R[i] = null;
				System.out.println("Publicación Eliminada");
				
				return;
				
			}else {
			
				comp = 1;
			}
		}
		
		if (comp == 1) {
			
			System.out.println("Algo salió mal, vuelvelo a intentar.");
		}
	
	}
	
	public static void BajarArticuloCientifico(ArticuloCientifico[] AC, int id) {
		
		int comp = 0;
		
		for (int i = 0; i < AC.length; i++) {
			
			if (AC[i] != null && AC[i].getIdA() == id) {
				
				AC[i] = null;
				System.out.println("Publicación Eliminada");
				
				return;
				
			}else {
			
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
