package practico2;

public class Libro extends Publicacion {

	int numeroPag;
	boolean leido;

	public int getNumeroPag() {
		return numeroPag;
	}

	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}

	public boolean getLeido() {
		return leido;
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}

	public Libro(String fechaLanzamiento, String editorial, int numeroPag, boolean leido) {
		super(fechaLanzamiento, editorial);
		this.numeroPag = numeroPag;
		this.leido = leido;
	}
	
	
}
