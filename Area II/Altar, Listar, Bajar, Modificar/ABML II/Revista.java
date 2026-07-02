package practico2;

public class Revista extends Publicacion{
	
	int idR;
	String marca; 
	double precio;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getIdR() {
		return idR;
	}
	public void setIdR(int idR) {
		this.idR = idR;
	}
	
	public Revista(String fechaLanzamiento, String editorial, int idR, String marca, double precio) {
		super(fechaLanzamiento, editorial);
		this.marca = marca;
		this.precio = precio;
		this.idR = idR;
	}
	
	
	
}
