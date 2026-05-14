package ejercicioHeredar3;

public class Triangulo extends FiguraGeometrica{
	
	String tipo;
	double angulo;
	
	public String getTipo() {
		
		return tipo;
	}
	
	public double getAngulo() {
		
		return angulo;
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
	}
	
	public void setAngulo(double angulo) {
		
		this.angulo = angulo;
		
	}
	
	public Triangulo(int cantidadLados, double area, String tipo, double angulo) {
		super(cantidadLados, area);
		this.tipo = tipo;
		this.angulo = angulo;
		
	}
}
