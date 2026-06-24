package practico4;

public abstract class ObraArte {

	String autor;
	int añoCreacion;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAñoCreacion() {
		return añoCreacion;
	}
	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}
	
	
	public ObraArte(String autor, int añoCreacion) {
		this.autor = autor;
		this.añoCreacion = añoCreacion;
	}
	
	
}
