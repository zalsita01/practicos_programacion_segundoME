package practico2;

public class ArticuloCientifico extends Publicacion{

	int idA;
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
	
	public int getIdA() {
		return idA;
	}
	public void setIdA(int idA) {
		this.idA = idA;
	}
	
	public ArticuloCientifico(String fechaLanzamiento, String editorial,int idA, String tema, String institucion) {
		super(fechaLanzamiento, editorial);
		this.tema = tema;
		this.institucion = institucion;
		this.idA = idA;
		
	}
	
	
}
