package practico1;

public class Electronica extends Producto{

	String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Electronica(String nombre, int precio, String modelo) {
		super(nombre, precio);
		this.modelo = modelo;
	}
}
