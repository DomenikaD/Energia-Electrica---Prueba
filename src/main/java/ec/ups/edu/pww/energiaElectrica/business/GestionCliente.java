package ec.ups.edu.pww.energiaElectrica.business;

import java.util.List;

import ec.ups.edu.pww.energiaElectrica.dao.ClienteDAO;
import ec.ups.edu.pww.energiaElectrica.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionCliente {
	
	@Inject
	private ClienteDAO daoCliente;
	
	
	/*Objecto de negocio llama a un DAO*/
	public Cliente getCliente(String cedula) throws Exception {
		if(cedula.length() != 10) { //!= si es diferente a 0
			throw new Exception("Cedula Incorrecta");
		}
		Cliente cliente = daoCliente.read(cedula);
		if (cliente == null) {
			throw new Exception("Cliente no existe");
		}
		return cliente;
	}
	

	
	public List<Cliente> getClientes() {
		return daoCliente.getAll();
	}
 
	
	
	public void createCliente(Cliente cliente) throws Exception {
		if (cliente.getCedula().length() != 10) { //!= si es diferente a 0
			throw new Exception("Cedula Incorrecta");
		}
		daoCliente.insert(cliente);
	}
	
	
	public void updateCliente(Cliente cliente) throws Exception {
		if (cliente.getCedula().length() != 10) {
			throw new Exception("No se logro actualizar");
		}
		daoCliente.update(cliente);
		
	}

	
	public void deleteCliente(String cedula) throws Exception{
		Cliente cliente = daoCliente.read(cedula);
		if(cliente == null) {				
			throw new Exception("Cliente no existe");
		}
			daoCliente.delete(cedula);
		}

}
