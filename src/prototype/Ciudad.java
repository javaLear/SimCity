package prototype;


import java.util.LinkedList;


/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public class Ciudad extends Terreno{
	
	private String nombre;
	private int poblacion;
	private String especializacion;
	private LinkedList<Zona> zonas = new LinkedList<Zona>();
	private LinkedList<TransportePublico> transportesPublicos = new LinkedList<TransportePublico>();
	private LinkedList<Servicio> servicios = new LinkedList<Servicio>(); 
	
	public Ciudad(String nombre, int poblacion, String especializacion, int superficie) {
		super(superficie);
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.especializacion = especializacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public LinkedList<TransportePublico> getTransportesPublicos() {
		return transportesPublicos;
	}
	
	public void addTransportre(TransportePublico traporte){
		this.transportesPublicos.add(traporte);
	}
	
	public void setTransportesPublicos(
			LinkedList<TransportePublico> transportesPublicos) {
		this.transportesPublicos = transportesPublicos;
	}

	public LinkedList<Servicio> getServicios() {
		return servicios;
	}
	
	public void addServicio(Servicio servicio){
		this.servicios.add(servicio);
	}

	public void setServicios(LinkedList<Servicio> servicios) {
		this.servicios = servicios;
	}

	public LinkedList<Zona> getZonas() {
		return zonas;
	}
	
	/*public void addZona(Zona zona){
		this.zonas.add(zona);
	}*/
	
	public void addZona(Zona zona) {
	    Terreno terreno = (Terreno) zona;
		terreno.setNivelJerarquico(this.getNivelJerarquico()+1);
		this.zonas.add(zona);		
	}

	/*public void setZonas(LinkedList<Zona> zonas) {
		this.zonas = zonas;
	}*/

	@Override
	public String toString() {
		String info = "   Ciudad [Nombre = " + nombre + ", Poblacion = " + poblacion
			          + ", Especializacion = " + especializacion + ", Superficie = " + super.getSuperficie() +"]\n";
		for (Zona z : this.zonas) {
			info += z.toString();
		}
		for (TransportePublico t : this.transportesPublicos) {
			info += t.toString();
		}
		for (Servicio s : this.servicios) {
			info += s.toString();
		}
		return info;
	}	
	
}
