package practico2;

public class ArticuloCientifico extends Publicacion{

	String tema;
	String institucion;
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
	public ArticuloCientifico(String fechaLanzamiento, String editorial, String tema, String institucion) {
		super(fechaLanzamiento, editorial);
		this.tema = tema;
		this.institucion = institucion;
	}
	
	
}
