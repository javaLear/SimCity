package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public class ZIndustrial extends Zona{
	
	private int capProduccion;
	private double radioContaminacion;

	public ZIndustrial(String nombre, int superfice) {
		super(nombre, superfice);
	}

	public int getCapProduccion() {
		return capProduccion;
	}

	public void setCapProduccion(int capProduccion) {
		this.capProduccion = capProduccion;
	}

	public double getRadioContaminacion() {
		return radioContaminacion;
	}

	public void setRadioContaminacion(double radioContaminacion) {
		this.radioContaminacion = radioContaminacion;
	}
		
	
}