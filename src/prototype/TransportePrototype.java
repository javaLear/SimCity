package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
import java.util.HashMap;

public class TransportePrototype {

	private HashMap<String,TransportePublico> prototypes;

	public TransportePrototype() {
		this.prototypes=new HashMap<String, TransportePublico>();
		this.prototypes.put("Buses", new TBuses("Estacion de Buses", 54000));
		this.prototypes.put("Trenes", new TTrenes("Estacion de Trenes", 68000));
		this.prototypes.put("Barcos", new TBarcos("Puerto Maria", 65000));
		this.prototypes.put("Aviones", new TAviones("Aeropuerto Jose Garcia", 110000));	
	}
	
	public void put(String key,TransportePublico transporte){
		this.prototypes.put(key, transporte);
	}
	
	public void remove(String key,TransportePublico transporte){
		this.prototypes.remove(key);
	}
	
	public TransportePublico getPrototype(String key){	
		try {
			TransportePublico transporte= this.prototypes.get(key);	
			return (TransportePublico) transporte.clone();			
		} catch (NullPointerException e) {
			return null;
		}catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
