package prototype;

public class Tienda extends EdificioStrategy{

	@Override
	public void construir() {
		super.construir();
		System.out.println("Construyendo Tienda.");		
	}
	
	@Override
	public void demoler() {
		super.demoler();
		System.out.println("Destruyendo Tienda.");
	}
		
}