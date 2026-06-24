package practico3;

abstract public class Edificio {
	
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
	public Edificio(String material, int valor) {
		this.material = material;
		this.valor = valor;
	}
	
}
