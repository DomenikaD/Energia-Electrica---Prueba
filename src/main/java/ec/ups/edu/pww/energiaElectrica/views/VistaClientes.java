package ec.ups.edu.pww.energiaElectrica.views;

import java.util.List;

import ec.ups.edu.pww.energiaElectrica.model.Cliente;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("clientes")
@RequestScoped 
public class VistaClientes {
	
	private Cliente persona = new Cliente();
	
	
	private List<Cliente> listado;
	

	/*GETTERS & SETTERS*/
	
	public Cliente getPersona() {
		return persona;
	}
	public void setPersona(Cliente persona) {
		this.persona = persona;
	}
	
	
	
	public List<Cliente> getListado() {
		return listado;
	}
	public void setListado(List<Cliente> listado) {
		this.listado = listado;
	}
	
	


}
