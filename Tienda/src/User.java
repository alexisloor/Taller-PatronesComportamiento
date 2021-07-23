import chain_of_responsibility.*;
import iterator.Producto;

public class User {
	
	
	
	
	public void verificarDevolucion(Producto p) {
		ReturnHandler asistente = new AsistenteHandler();
		ReturnHandler tecnico = new TecnicoHandler();
		ReturnHandler jefe = new JefeHandler();
		ReturnHandler gerente = new GerenteHandler();
		
		asistente.setSucesor(tecnico);
		tecnico.setSucesor(jefe);
		jefe.setSucesor(gerente);
		
		asistente.verificacion(p);
	}

}
