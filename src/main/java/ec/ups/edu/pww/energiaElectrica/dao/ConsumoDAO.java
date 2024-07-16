package ec.ups.edu.pww.energiaElectrica.dao;

import java.util.List;

import ec.ups.edu.pww.energiaElectrica.model.Consumo;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


@Stateless
public class ConsumoDAO {

	@PersistenceContext
	private EntityManager em;

	
	/* °°°°°°°°°°°°°°°°°°°°
	 *   INSERTAR CLIENTES
	 * °°°°°°°°°°°°°°°°°°°° */
	
	public void insert(Consumo consumo) {
		em.persist(consumo);
	}
	
	
	/* °°°°°°°°°°°°°°°°°°°°°°°
	 *   ACTUALIZAR CLIENTES
	 * °°°°°°°°°°°°°°°°°°°°°°° */
	
	public void update(Consumo consumo) {
		em.merge(consumo);
	}
	
	
	/* °°°°°°°°°°°°°°°°°°
	 *   LEER CLIENTES
	 * °°°°°°°°°°°°°°°°°° */
	
	public Consumo read(String cedula) {
		return em.find(Consumo.class, cedula);
	}
	
	
	/* °°°°°°°°°°°°°°°°°°°°
	 *   ELIMINAR CLIENTES
	 * °°°°°°°°°°°°°°°°°°°° */
	
	public void delete(String cedula) {
		Consumo consumo = em.find(Consumo.class, cedula);
		if (consumo != null) {
			em.remove(consumo);
		}
	}
	
	/* °°°°°°°°°°°°°°°°°°
	 *      LISTA
	 * °°°°°°°°°°°°°°°°°° */
	public List<Consumo> getAll() {
	String jpql = "SELECT c FROM Consumo c";
	Query query = em.createQuery(jpql, Consumo.class);  
	return query.getResultList();  
}
	
}
