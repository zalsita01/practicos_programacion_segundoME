package segundo;

public class Dueño implements acciones{
	
	String posesion;

	public String getPosesion() {
		return posesion;
	}

	public void setPosesion(String posesion) {
		this.posesion = posesion;
	}

	public Dueño(String posesion) {
		this.posesion = posesion;
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
