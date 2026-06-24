package practico4;

public class Escultura extends ObraArte{

	String material;
	String tema;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Escultura(String autor, int añoCreacion, String material, String tema) {
		super(autor, añoCreacion);
		this.material = material;
		this.tema = tema;
	}
	
	
}
