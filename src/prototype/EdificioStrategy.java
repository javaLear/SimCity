package prototype;

public abstract class EdificioStrategy {
	
	protected String estado = "Libre";

	public void construir(){
		this.estado = "Ocupada";
	}
	
	//public abstract void ocupar();
	
	public void demoler(){
		this.estado = "Libre";
	}

	public String getEstado() {
		return estado;
	}
		
}
