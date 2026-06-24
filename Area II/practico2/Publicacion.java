package practico2;

abstract public class Publicacion {
	
	String fechaLanzamiento;
	String editorial;
	
	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	public Publicacion(String fechaLanzamiento, String editorial) {
		this.fechaLanzamiento = fechaLanzamiento;
		this.editorial = editorial;
	}
	
	
	
	
}
