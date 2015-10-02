package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public abstract class Servicio implements Cloneable{
	
	private String nombre;
	private int capacidad;
	private double precio;
		
	public Servicio(String nombre, int capacidad, double precio) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.precio = precio;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();		
	}	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "     Servicio [Nombre = " + nombre + ", Capacidad = " + capacidad + ", Precio = " + precio + "]\n";
	}	
	
	
	
}
