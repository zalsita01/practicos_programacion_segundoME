package primer;

public class Perro implements acciones{

	String nombre;
	String raza; 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void comer() {
		System.out.println("El perro come 500 gramos");		
	}

	@Override
	public void dormir() {
		System.out.println("El perro duerme 9 horitass");
	}
	

	public Perro(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}

	
	
}
