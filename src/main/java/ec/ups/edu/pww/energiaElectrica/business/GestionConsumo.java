package ec.ups.edu.pww.energiaElectrica.business;

import java.util.List;

import ec.ups.edu.pww.energiaElectrica.dao.ConsumoDAO;
import ec.ups.edu.pww.energiaElectrica.model.Consumo;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionConsumo {
	
	@Inject
	private ConsumoDAO daoConsumo;
	
	
	public Consumo getConsumo(String cedula) throws Exception {
		if(cedula.length() != 10) { //!= si es diferente a 0
			throw new Exception("Cedula Incorrecta");
		}
		Consumo Consumo = daoConsumo.read(cedula);
		if (Consumo == null) {
			throw new Exception("Consumo no existe");
		}
		return Consumo;
	}
	

	
	public List<Consumo> getConsumos() {
		return daoConsumo.getAll();
	}
 
	
	
	public void createConsumo(Consumo consumo) throws Exception {
		if (Consumo.getCedula().length() != 10) { //!= si es diferente a 0
			throw new Exception("Cedula Incorrecta");
		}
		daoConsumo.insert(consumo);
	}
	
	
	public void updateConsumo(Consumo consumo) throws Exception {
		if (Consumo.getCedula().length() != 10) {
			throw new Exception("No se logro actualizar");
		}
		daoConsumo.update(consumo);
		
	}

	
	public void deleteConsumo(String cedula) throws Exception{
		Consumo Consumo = daoConsumo.read(cedula);
		if(Consumo == null) {				
			throw new Exception("Consumo no existe");
		}
			daoConsumo.delete(cedula);
		}

}
