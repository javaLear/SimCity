package prototype;
/**
 * Tema: Curso Java
 * Proyecto: EJ_Prototype
 * Autor: Harlem m. Cortes
 *
 */
public class SimCity {

	public static void main(String[] args){
		
		Region region = new Region("Valle de Cauca", "Montañas y Planicie", 150200);
		Ciudad ciudad1 = new Ciudad("Palmira", 10000, "Turismo", 40500);
		region.addCiudad(ciudad1);
		
		ZonaPrototype pZona = new ZonaPrototype();
		ciudad1.addZona(pZona.getPrototype("RS"));
		ciudad1.addZona(pZona.getPrototype("RS"));
		ciudad1.addZona(pZona.getPrototype("RS"));
		ciudad1.addZona(pZona.getPrototype("RM"));
		ciudad1.addZona(pZona.getPrototype("RM"));
		ciudad1.addZona(pZona.getPrototype("RB"));
		ciudad1.addZona(pZona.getPrototype("CS"));
		ciudad1.addZona(pZona.getPrototype("CS"));
		ciudad1.addZona(pZona.getPrototype("IM"));
		
		ciudad1.getZonas().get(0).construir(new Casa());
		ciudad1.getZonas().get(5).construir(new Apartamentos());
		ciudad1.getZonas().get(6).construir(new Tienda());
		ciudad1.getZonas().get(8).construir(new Fabrica());
		ciudad1.getZonas().get(0).construir(new Casa());
		ciudad1.getZonas().get(2).demoler();
				
		TransportePrototype pTransporte = new TransportePrototype();
		ciudad1.addTransportre(pTransporte.getPrototype("Buses"));
		ciudad1.addTransportre(pTransporte.getPrototype("Barcos"));
		
		ServicioPrototype pServicio = new ServicioPrototype();
		ciudad1.addServicio(pServicio.getPrototype("Hospital"));
		ciudad1.addServicio(pServicio.getPrototype("Deposito"));
		ciudad1.addServicio(pServicio.getPrototype("Eolico"));
		
		Ciudad ciudad2 = new Ciudad("Yumbo", 40000, "Industria", 180500);
		region.addCiudad(ciudad2);
		
		ciudad2.addZona(pZona.getPrototype("RS"));
		ciudad2.addZona(pZona.getPrototype("RS"));
		ciudad2.addZona(pZona.getPrototype("RM"));
		ciudad2.addZona(pZona.getPrototype("RM"));
		ciudad2.addZona(pZona.getPrototype("RB"));
		ciudad2.addZona(pZona.getPrototype("RB"));
		ciudad2.addZona(pZona.getPrototype("CS"));
		ciudad2.addZona(pZona.getPrototype("CM"));
		ciudad2.addZona(pZona.getPrototype("IS"));
		ciudad2.addZona(pZona.getPrototype("IM"));
		

		ciudad2.addTransportre(pTransporte.getPrototype("Trenes"));
		ciudad2.addTransportre(pTransporte.getPrototype("Barcos"));
		ciudad2.addTransportre(pTransporte.getPrototype("Aviones"));
		
		ciudad2.addServicio(pServicio.getPrototype("Clinica"));
		ciudad2.addServicio(pServicio.getPrototype("Extracion"));
		ciudad2.addServicio(pServicio.getPrototype("Eolico"));
		ciudad2.addServicio(pServicio.getPrototype("Comisaria"));
		
		System.out.println(region);
	}

}
