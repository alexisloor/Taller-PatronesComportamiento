package chain_of_responsibility;
import iterator.Producto;

public class GerenteHandler implements ReturnHandler {
	
	private ReturnHandler sucesor;
	
	public void setSucesor(ReturnHandler handler) {
		this.sucesor= handler;
	}
	
	public ReturnHandler getSucesor() {
		return sucesor;
	}
	
	public void verificacion(Producto p) {
		boolean aprobacion= true; 
		if(aprobacion) { //si el gerente aprueba el cambio
			System.out.println("Se puede solicitar el cambio del producto");
		}else { //si el gerente no aprueba el cambio
			System.out.println("No se aprueba el cambio del producto");
		}
	}
}
