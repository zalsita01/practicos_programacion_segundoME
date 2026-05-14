package ejercicioHeredar;

public class Auto extends Vehiculo {
	
	int cantidadPuertas;
	boolean radioEncendida;
	
	public boolean getRadioEncendida() {
		
		return radioEncendida;
	}
	
	public int getCantidadPuertas() {
		
		return cantidadPuertas;
	}
	
	public void setRadioEncendida(boolean radioEncendida) {
		this.radioEncendida = radioEncendida;
	}
	
	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}
	
	public Auto(String marca, String matricula, double velocidadMax, int cantidadPuertas, boolean radioEncendida) {
		
		super(marca, matricula, velocidadMax);
		this.cantidadPuertas = cantidadPuertas;
		this.radioEncendida = radioEncendida;
	}
}
