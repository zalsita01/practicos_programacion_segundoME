package ejercicioHeredar2;

public class Persona {

	String nombre;
	String apellido;
	String edad;
	
	public String getNombre() {
		
		return nombre;
	}
	
	public String getApellido() {
		
		return apellido;
	}
	
	public String getEdad() {
		
		return edad;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		
		this.apellido = apellido;
	}
	
	public void setEdad(String edad) {
		
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellido, String edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
}
