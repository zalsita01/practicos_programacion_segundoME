package practico3;

public class Casa extends Edificio {

	int CantPisos;
	int metrosCuadrados;
	public int getCantPisos() {
		return CantPisos;
	}
	public void setCantPisos(int cantPisos) {
		CantPisos = cantPisos;
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	
	public Casa(String material, int valor, int cantPisos, int metrosCuadrados) {
		super(material, valor);
		this.CantPisos = cantPisos;
		this.metrosCuadrados = metrosCuadrados;
	}
	
	
}
