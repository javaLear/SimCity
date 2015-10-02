package prototype;

public class Casa extends EdificioStrategy{

	@Override
	public void construir() {
		super.construir();
		System.out.println("Construyendo Casa.");		
	}
	
	@Override
	public void demoler() {
		super.demoler();
		System.out.println("Destruyendo Casa.");
	}
		
}