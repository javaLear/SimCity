package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
import java.util.HashMap;

public class ZonaPrototype {

	private HashMap<String,Zona> prototypes;

	public ZonaPrototype() {
		this.prototypes= new HashMap<String, Zona>();
		this.prototypes.put("RB", new ZResidencial("Residencial Grande", 500));
		this.prototypes.put("RM", new ZResidencial("Residencial Mediana", 150));
		this.prototypes.put("RS", new ZResidencial("Residencial Pequeña", 80));
		this.prototypes.put("CB", new ZComercial("Comercial Grande", 800));
		this.prototypes.put("CM", new ZComercial("Comercial Mediana", 450));
		this.prototypes.put("CS", new ZComercial("Comercial Pequeña", 200));
		this.prototypes.put("IB", new ZComercial("Industrial Grande", 1100));
		this.prototypes.put("IM", new ZComercial("Industrial Mediana", 850));
		this.prototypes.put("IS", new ZComercial("Industrial Pequeña", 500));
		
	}
	
	public void put(String key,Zona zona){
		this.prototypes.put(key, zona);
	}
	
	public void remove(String key,Zona zona){
		this.prototypes.remove(key);
	}
	
	public Zona getPrototype(String key){	
		try {
			Zona zona = this.prototypes.get(key);	
			return (Zona) zona.clone();			
		} catch (NullPointerException e) {
			return null;
		}catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
