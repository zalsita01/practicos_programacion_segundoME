package practico1;

public class Ropa extends Producto{

	private int idR;
	private String talle;
	private String material;
	
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
	
	public int getIdR() {
		return idR;
	}
	public void setIdR(int idR) {
		this.idR = idR;
	}
	public Ropa(String nombre, int precio, int idR, String talle, String material) {
		super(nombre, precio);
		this.talle = talle;
		this.material = material;
		this.idR = idR;
	}
}
