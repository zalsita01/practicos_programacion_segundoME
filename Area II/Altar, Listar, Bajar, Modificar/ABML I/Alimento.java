package practico1;

public class Alimento extends Producto{
	
	private int idA;
	private String fechaCaducidad;
	private String sabor;

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

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public Alimento(String nombre, int precio, int idA, String fechaCaducidad, String sabor) {
		super(nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		this.sabor = sabor;
		this.idA = idA;
	}

	
}
