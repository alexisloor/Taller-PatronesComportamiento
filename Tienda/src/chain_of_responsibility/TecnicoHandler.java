package chain_of_responsibility;
import iterator.Producto;

public class TecnicoHandler implements ReturnHandler {
	
	private ReturnHandler sucesor;
		
		public void setSucesor(ReturnHandler handler) {
			this.sucesor= handler;
		}
		
		public ReturnHandler getSucesor() {
			return sucesor;
		}
		
		public void verificacion(Producto p) {
			System.out.println("Ingrese el fallo");
			String fallo = "fallo ingresado";
			if(p.getFallos().contains(fallo)) {
				this.sucesor.verificacion(p);
			}else {
				System.out.println("La garantía no cubre ese fallo");
			}
		}

}
