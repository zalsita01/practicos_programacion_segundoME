package ejercicioHeredar3;

public class Circulo extends FiguraGeometrica{

	double radio;
	double diametro;
	
	public double getRadio() {
		
		return radio;
	}
	
	public double getDiametro() {
		
		return diametro;
	}
	
	public void setRadio(double radio) {
		
		this.radio = radio;
	}
	
	public void setDiametro(double diametro) {
		
		this.diametro = diametro;
	}
	
	public Circulo(int cantidadLados, double area, double radio, double diametro) {
		
		super(cantidadLados, area);
		this.radio = radio;
		this.diametro = diametro;
	}
}
