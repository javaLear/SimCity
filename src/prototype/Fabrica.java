package prototype;

public class Fabrica extends EdificioStrategy{

	@Override
	public void construir() {
		super.construir();
		System.out.println("Construyendo Fabrica.");		
	}
	
	@Override
	public void demoler() {
		super.demoler();
		System.out.println("Destruyendo Fabrica.");
	}
		
}