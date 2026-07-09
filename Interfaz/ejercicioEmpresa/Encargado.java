package segundo;

public class Encargado implements acciones{
	
	String sector;

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Encargado(String sector) {
		this.sector = sector;
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
