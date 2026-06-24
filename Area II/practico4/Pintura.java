package practico4;

public class Pintura extends ObraArte {

	String paletaPrincipal;
	int tamañoArea;
	
	public String getPaletaPrincipal() {
		return paletaPrincipal;
	}
	public void setPaletaPrincipal(String paletaPrincipal) {
		this.paletaPrincipal = paletaPrincipal;
	}
	public int getTamañoArea() {
		return tamañoArea;
	}
	public void setTamañoArea(int tamañoArea) {
		this.tamañoArea = tamañoArea;
	}
	
	public Pintura(String autor, int añoCreacion, String paletaPrincipal, int tamañoArea) {
		super(autor, añoCreacion);
		this.paletaPrincipal = paletaPrincipal;
		this.tamañoArea = tamañoArea;
	}
	
	
}
