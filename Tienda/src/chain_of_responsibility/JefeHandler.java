package chain_of_responsibility;
import iterator.Producto;

public class JefeHandler implements ReturnHandler{
	
	private ReturnHandler sucesor;
	
	public void setSucesor(ReturnHandler handler) {
		this.sucesor= handler;
	}
	
	public ReturnHandler getSucesor() {
		return sucesor;
	}
	
	public void verificacion(Producto p) {
		if(//el producto existe en bodega) {
				if(p.getPrecio()>1000) {
					this.sucesor.verificacion(p);
				}else {
					System.out.println("Se puede solicitar el cambio del producto");
				}
		}else {
			System.out.println("No existe producto para reponer");
		}
	}

}
