package ec.ups.edu.pww.energiaElectrica.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_DEUDA")
public class Deuda {
	
	
	@Id
	@Column(name="deu_id")
	private int id;
	
	@Column(name="deu_fecha")
	private Date fecha;
	
	@Column(name="deu_costo")
	private double costo;

	
	/*°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
	 *      GETTERS & SETTERS
	 *°°°°°°°°°°°°°°°°°°°°°°°°°°°°°*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	/*°°°°°°°°°°°°°°°°°°°°°°
	 *      ToString
	 *°°°°°°°°°°°°°°°°°°°°°°*/
	
	@Override
	public String toString() {
		return "Deuda [id=" + id + ", fecha=" + fecha + ", costo=" + costo + "]";
	}
	
	
	

}
