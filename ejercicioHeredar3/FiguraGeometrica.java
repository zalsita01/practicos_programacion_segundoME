package ejercicioHeredar3;

public class FiguraGeometrica {

	int cantidadLados;
	double area;
	
	public int getCantidadLados() {
		return cantidadLados;
	}
	
	public double getArea() {
		return area;
	}
	public void setCantidadLados(int cantidadLados) {
		
		this.cantidadLados = cantidadLados;
	}
	public void setArea( double area) {
		
		this.area = area;
	}
	
	public FiguraGeometrica(int cantidadLados, double area) { 
		
		this.cantidadLados = cantidadLados;
		this.area = area;
	}
}
