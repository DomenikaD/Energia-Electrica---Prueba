package ec.ups.edu.pww.energiaElectrica.dao;

import java.util.List;

import ec.ups.edu.pww.energiaElectrica.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ClienteDAO {
	
	@PersistenceContext
	private EntityManager em;

	
	/* °°°°°°°°°°°°°°°°°°°°
	 *   INSERTAR CLIENTES
	 * °°°°°°°°°°°°°°°°°°°° */
	
	public void insert(Cliente cliente) {
		em.persist(cliente);
	}
	
	
	/* °°°°°°°°°°°°°°°°°°°°°°°
	 *   ACTUALIZAR CLIENTES
	 * °°°°°°°°°°°°°°°°°°°°°°° */
	
	public void update(Cliente cliente) {
		em.merge(cliente);
	}
	
	
	/* °°°°°°°°°°°°°°°°°°
	 *   LEER CLIENTES
	 * °°°°°°°°°°°°°°°°°° */
	
	public Cliente read(String cedula) {
		return em.find(Cliente.class, cedula);
	}
	
	
	/* °°°°°°°°°°°°°°°°°°°°
	 *   ELIMINAR CLIENTES
	 * °°°°°°°°°°°°°°°°°°°° */
	
	public void delete(String cedula) {
		Cliente cliente = em.find(Cliente.class, cedula);
		if (cliente != null) {
			em.remove(cliente);
		}
	}
	
	/* °°°°°°°°°°°°°°°°°°
	 *      LISTA
	 * °°°°°°°°°°°°°°°°°° */
	public List<Cliente> getAll() {
	String jpql = "SELECT c FROM Cliente c";
	Query query = em.createQuery(jpql, Cliente.class);  
	return query.getResultList();  
}
	

}
