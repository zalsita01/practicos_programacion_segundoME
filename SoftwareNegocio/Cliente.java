package SoftwareNegocio;

public class Cliente {

	private String nombre;
	private String apellido;
	private boolean carnetConductor;
	private int edad;
	
	

public int getEdad() {
	
	return edad;
}

public void setEdad( int edad) {
	
	this.edad = edad;
	
}

public String getNombre() {
	
	return nombre;
}

public void setNombre(String nombre) {
	
	this.nombre = nombre;
	
}

public String getApellido() {
	
	return apellido;
}


public void setApellido(String apellido) {
	
	this.apellido = apellido;
	
}

public boolean getCarnetConductor() {
	
	return carnetConductor;
}

public void setCarnetConductor(boolean carnetConductor) {
	
	this.carnetConductor = carnetConductor;
	
}


public Cliente(String nombre, String apellido, boolean carnetConductor, int edad) {
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.carnetConductor = carnetConductor;
	this.edad = edad;
	
}
}
