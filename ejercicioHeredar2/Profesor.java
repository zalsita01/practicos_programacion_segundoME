package ejercicioHeredar2;

public class Profesor extends Persona {
	
	int cantidadCursos;
	String asignatura;
	
	public int getCantidadCursos() {
		return cantidadCursos;
	}
	
	public String getAsignatura() {
		return asignatura;
	}
	
	public void setCantidadCursos(int cantidadCursos) {
		
		this.cantidadCursos = cantidadCursos;
	}
	public void setAsignatura(String asignatura) {
		
		this.asignatura = asignatura;
	}
	
	public Profesor(String nombre, String apellido, String edad, int cantidadCursos, String asignatura) {
		
		super( nombre, apellido, edad);
		this.cantidadCursos = cantidadCursos;
		this.asignatura = asignatura;

	}	
}
