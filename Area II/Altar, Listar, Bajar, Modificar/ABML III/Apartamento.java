package practico3;

public class Apartamento extends Edificio {
	
	int CantHabitaciones;
	int pisoUbi;
	
	public int getCantHabitaciones() {
		return CantHabitaciones;
	}
	
	public void setCantHabitaciones(int cantHabitaciones) {
		CantHabitaciones = cantHabitaciones;
	}
	
	public int getPisoUbi() {
		return pisoUbi;
	}
	
	public void setPisoUbi(int pisoUbi) {
		this.pisoUbi = pisoUbi;
	}
	
	public Apartamento(int id, String material, int valor, int cantHabitaciones, int pisoUbi) {
		super(id, material, valor);
		this.CantHabitaciones = cantHabitaciones;
		this.pisoUbi = pisoUbi;
	}
	
}
