package chain_of_responsibility;

import iterator.Producto;

public interface ReturnHandler {
	
	
	// metodo que asigna un manejador como un sucesor
	public void setSucesor(ReturnHandler handler);
	
	//metodo que se encarga de hacer las verificaciones
	public void verificacion(Producto p);
}
