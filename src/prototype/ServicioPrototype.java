package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
import java.util.HashMap;

public class ServicioPrototype {

	private HashMap<String,Servicio> prototypes;

	public ServicioPrototype() {
		this.prototypes= new HashMap<String, Servicio>();
		this.prototypes.put("Eolico", new SElectricidad("Parque Eolico", 60, 6000));
		this.prototypes.put("Carbon", new SElectricidad("Central Carbon", 120, 4500));
		this.prototypes.put("Deposito", new SAgua("Deposito de Agua", 90, 6000));
		this.prototypes.put("Extracion", new SAgua("Estacion de Extracion", 550, 45000));	
		this.prototypes.put("Comisaria", new SPolicia("Comisaria SantaCruz", 12, 10100));
		this.prototypes.put("Distrito", new SElectricidad("Distrito Policial", 50, 72100));
		this.prototypes.put("Clinica", new SAgua("Clinica Farallones", 30, 23200));
		this.prototypes.put("Hospital", new SAgua("Hospital Universitario", 100, 64500));
	} 
	
	public void put(String key,Servicio servicio){
		this.prototypes.put(key, servicio);
	}
	
	public void remove(String key,Servicio servicio){
		this.prototypes.remove(key);
	}
	
	public Servicio getPrototype(String key){	
		try {
			Servicio servicio= this.prototypes.get(key);	
			return (Servicio) servicio.clone();			
		} catch (NullPointerException e) {
			return null;
		}catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}

