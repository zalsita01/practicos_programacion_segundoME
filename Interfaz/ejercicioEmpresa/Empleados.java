package segundo;

public class Empleados implements acciones {
	
	int horas;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Empleados(int horas) {
		this.horas = horas;
	}

	@Override
	public void enviar(int comprobar) {
		
		if (comprobar == 1) {
			
			System.out.println("mensaje enviado");
		}else {
			
			System.out.println("no puede enviar a esta entidad");
		}
	}
	
	
}
