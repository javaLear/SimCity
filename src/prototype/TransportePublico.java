package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public abstract class TransportePublico implements Cloneable{
	
	private String nombre;
	private double precio;
		
	public TransportePublico(String nombre, double precio) {
		super();
		this.nombre = nombre;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "     Transporte Publico [Nombre = " + nombre + ", Precio = " + precio + "]\n";
	}	

}
