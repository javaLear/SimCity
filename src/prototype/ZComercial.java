package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public class ZComercial extends Zona{
	
	private double precio;

	public ZComercial(String nombre, int superfice) {
		super(nombre, superfice);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
		
}