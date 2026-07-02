package practico1;

public class Electronica extends Producto{

	private int idE;
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getIdE() {
		return idE;
	}

	public void setIdE(int idE) {
		this.idE = idE;
	}

	public Electronica(String nombre, int precio, int idE, String modelo) {
		super(nombre, precio);
		this.modelo = modelo;
		this.idE = idE;
	}
}
