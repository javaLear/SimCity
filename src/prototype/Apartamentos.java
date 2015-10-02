package prototype;

public class Apartamentos extends EdificioStrategy{

	@Override
	public void construir() {
		super.construir();
		System.out.println("Construyendo Apartamentos.");		
	}
	
	@Override
	public void demoler() {
		super.demoler();
		System.out.println("Destruyendo Apartamentos.");
	}
		
}