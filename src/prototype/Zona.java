package prototype;

/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public abstract class Zona extends Terreno implements Cloneable{
	
	private String nombre;
	private EdificioStrategy edificio;
	
	public Zona(String nombre, int superficie) {
		super(superficie);
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "     Zona [Nombre = " + nombre + ", Superficie = "+super.getSuperficie()
			   + ", Estado = "+( edificio != null ? edificio.getEstado()+"("+edificio.getClass().getSimpleName()+")": "Libre" )+"]\n";
	}	
	
	public EdificioStrategy getHerramienta() {
		return edificio;
	}

	public void construir(EdificioStrategy edificio) {
		if(this.edificio == null){
			this.edificio = edificio;
			this.edificio.construir();
		}else{
			System.out.println("Zona ocupada");
		}
	}

	public void remodelar() {
		try {
			this.edificio.construir();
		} catch (NullPointerException e) {
			System.out.println("No hay un edifico");
		}
	}

	public void demoler() {
		try {
			this.edificio.demoler();
		} catch (NullPointerException e) {
			System.out.println("No hay Edificio");
		}
	}

	public void informar() {
		try {
			String estado = this.edificio.getEstado();
			System.out.println("La zona esta " + estado+".");
		} catch (NullPointerException e) {
			System.out.println("La zona esta Libre");
		}

	}

	
	
}
