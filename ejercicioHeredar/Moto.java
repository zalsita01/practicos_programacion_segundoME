package ejercicioHeredar;

public class Moto extends Vehiculo{
	
	boolean portaEquipaje;
	boolean encendidoAutomatico;
	
	public boolean getPortaEquipaje() {
		
		return portaEquipaje;
	}

	public boolean getEncendidoAutomatico() {
		
		return encendidoAutomatico;
	}
	
	public void setPortaEquipaje(boolean portaEquipaje) {
		
		this.portaEquipaje = portaEquipaje;
	}
	
	public void setEncendidoAutomatico(boolean encendidoAutomatico) {
		
		this.encendidoAutomatico = encendidoAutomatico;
	}
	
	public Moto(String marca, String matricula, double velocidadMax, boolean portaEquipaje, boolean encendidoAutomatico) {
		
		super(marca, matricula, velocidadMax);
		this.portaEquipaje = portaEquipaje;
		this.encendidoAutomatico = encendidoAutomatico;
	}
}
