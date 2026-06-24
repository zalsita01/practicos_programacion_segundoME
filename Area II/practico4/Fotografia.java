package practico4;

public class Fotografia extends ObraArte{
	
	String camaraProv;
	int resolucion;
	public String getCamaraProv() {
		return camaraProv;
	}
	public void setCamaraProv(String camaraProv) {
		this.camaraProv = camaraProv;
	}
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	
	public Fotografia(String autor, int añoCreacion, String camaraProv, int resolucion) {
		super(autor, añoCreacion);
		this.camaraProv = camaraProv;
		this.resolucion = resolucion;
	}
	
	
}
