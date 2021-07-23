package chain_of_responsibility;
import iterator.Producto;

public class AsistenteHandler implements ReturnHandler {
	
	private ReturnHandler sucesor;
	
	public void setSucesor(ReturnHandler handler) {
		this.sucesor= handler;
	}
	
	public void verificacion(Producto p) {
		if(p.getGarantia()) {
			this.sucesor.verificacion(p);
		}else {
			System.out.println("No cumple con los años de garantía");
		}
	}

}
