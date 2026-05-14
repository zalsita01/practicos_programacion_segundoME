package ejercicioHeredar;

public class Vehiculo {
	String marca;
	String matricula;
	double velocidadMax;
	
	
	public String getMarca() {
		return marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public double getVelocidadMax() {
		return velocidadMax;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
	
	public Vehiculo(String marca, String matricula, double velocidadMax) {
		this.marca = marca;
		this.matricula = matricula;
		this.velocidadMax = velocidadMax;
	}
	
	
}
