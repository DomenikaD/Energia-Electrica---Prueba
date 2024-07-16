package ec.ups.edu.pww.energiaElectrica.business;

import java.util.List;

import ec.ups.edu.pww.energiaElectrica.dao.ClienteDAO;
import ec.ups.edu.pww.energiaElectrica.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {

	
	@Inject
	private ClienteDAO daoCliente;
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("~~~~~~~~~INICIO~~~~~~~~~");
		
		
		Cliente cliente  = new Cliente();
		cliente.setCedula("1717273401");
		cliente.setNombre("Domenika Delgado");
		
		daoCliente.insert(cliente);
		
		
		List<Cliente> listado = daoCliente.getAll();
		for(Cliente cli: listado) {
			System.err.println(cli.getCedula() + " " + cli.getNombre());
		}
		
	}
}
