package prototype;

import java.util.LinkedList;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public class Region{
	
	private String nombre;
	private String caracteristicas;
	private double superficie;
	private LinkedList<Ciudad> ciudades = new LinkedList<Ciudad>();
		
	public Region(String nombre, String caracteristicas, double superficie) {
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public LinkedList<Ciudad> getCiudades() {
		return ciudades;
	}
	
	public void addCiudad(Ciudad ciudad){
		this.ciudades.add(ciudad);
	}

	public void setCiudades(LinkedList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	@Override
	public String toString() {
		String info = "Region [Nombre = " + nombre + ", Caracteristicas = " + caracteristicas + ", Superficie = " + superficie + "]\n";
		for (Ciudad c : this.ciudades) {
			info += c.toString();
		}
		return info;
	}	
	
}
