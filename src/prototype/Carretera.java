package prototype;

public abstract class Carretera implements Cloneable{
	
	private String descripcion;
	private double precio;
		
	public Carretera(String descripcion, double precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "carretera [descripcion=" + descripcion + ", precio=" + precio + "]";
	}	

}
