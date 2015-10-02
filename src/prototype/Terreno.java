package prototype;

public class Terreno{
	
	private int superficie;
	private int nivelJerarquico;
	
	public Terreno(int superficie){
		super();
		this.setSuperficie(superficie);
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getNivelJerarquico() {
		return nivelJerarquico;
	}

	public void setNivelJerarquico(int nivelJerarquico) {
		this.nivelJerarquico = nivelJerarquico;
	}
	
	public String mensajeNivelado(String mensaje){
		for (int i = 0; i < this.getNivelJerarquico(); i++) {
			mensaje= "	" + mensaje;
		}
		return mensaje;
	}
	
}