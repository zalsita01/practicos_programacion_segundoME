package primer;

public class Dinosaurio implements acciones{
	
	String nombre;
	int kills;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	@Override
	public void comer() {
		System.out.println("El dinosaurio come 20 kilos");
	}

	@Override
	public void dormir() {
		System.out.println("El dinosaurio duerme 6 horas");
	}

	public Dinosaurio(String nombre, int kills) {
		this.nombre = nombre;
		this.kills = kills;
	}
	
	
}
