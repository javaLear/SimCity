package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public class ZResidencial extends Zona{
	
	private double precioTerreno;
	
	public ZResidencial(String nombre, int superficie) {
		super(nombre, superficie);
	}

	public double getPrecioTerreno() {
		return precioTerreno;
	}

	public void setPrecioTerreno(double precioTerreno) {
		this.precioTerreno = precioTerreno;
	}
		
}
