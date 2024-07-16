package ec.ups.edu.pww.energiaElectrica.views;

import java.util.List;

import ec.ups.edu.pww.energiaElectrica.business.GestionCliente;
import ec.ups.edu.pww.energiaElectrica.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("clientes")
@RequestScoped 
public class VistaClientes {
	
	@Inject
	private GestionCliente gClientes;
	
	private Cliente persona = new Cliente();
	
	
	private List<Cliente> listado;
	
	
	@PostConstruct
	public void init() {
		listado = gClientes.getClientes();  /*recupere en listado los clientes que tengo en mi BD*/
	}

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
	
	
	public String consultar() {
		System.out.println(this.persona);
	
	try {
		gClientes.createCliente(persona);
		return "listadoClientes?faces-redirect=true";
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return "error";
		}
	}


}
