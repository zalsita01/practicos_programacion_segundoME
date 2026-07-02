package practico3;

abstract public class Edificio {
	
	int id;
	String material;
	int valor;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Edificio(int id, String material, int valor) {
		this.id = id;
		this.material = material;
		this.valor = valor;
	}
	
}
