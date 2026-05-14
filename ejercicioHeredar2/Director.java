package ejercicioHeredar2;

public class Director extends Persona {
	 
	String escuela;
	int añosExperiencia;
	
	public String getEscuela() {
		
		return escuela;
	}
	
	public int getAñosExperiencia() {
		
		return añosExperiencia;
	}
	
	public void setEscuela(String escuela) {
		
		this.escuela = escuela;
	}
	public void setAñosExperiencia(int añosExperiencia) {
		
		this.añosExperiencia = añosExperiencia;
		
	}
	
	public Director(String nombre, String apellido, String edad, String escuela, int añosExperiencia) {
		
		super(nombre, apellido, edad);
		this.escuela = escuela;
		this.añosExperiencia = añosExperiencia;
		
	}
}
