package ejercicioHeredar2;

public class Alumno extends Persona{
	
	String curso;
	int calificacion;
	
	public String getCurso() {
		
		return curso;
	}
	public int getCalificacion() {
		
		return calificacion;
	}
	public void setCurso(String curso) {
		
		this.curso = curso;
	}
	public void setCalificacion(int calificacion) {
		
		this.calificacion = calificacion;
	}
	
	public Alumno(String nombre, String apellido, String edad, String curso, int calificacion) {
		
		super(nombre, apellido, edad);
		this.curso = curso;
		this.calificacion = calificacion;

	}
}
