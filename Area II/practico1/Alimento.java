package practico1;

public class Alimento extends Producto{
	
	String fechaCaducidad;
	String sabor;

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Alimento(String nombre, int precio, String fechaCaducidad, String sabor) {
		super(nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		this.sabor = sabor;
	}

	
}
