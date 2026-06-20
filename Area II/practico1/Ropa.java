package practico1;

public class Ropa extends Producto{

	String talle;
	String material;
	
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Ropa(String nombre, int precio, String talle, String material) {
		super(nombre, precio);
		this.talle = talle;
		this.material = material;
	}
}
