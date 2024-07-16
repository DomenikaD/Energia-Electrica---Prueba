package ec.ups.edu.pww.energiaElectrica.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_CONSUMO")
public class Consumo {
	
	
	@Id
	@Column(name="con_id")
	private int id;
	
	@Column(name="con_fecha")
	private Date fecha;
	
	@Column(name="con_valor")
	private double valor;

	
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	/*°°°°°°°°°°°°°°°°°°°°°°
	 *      ToString
	 *°°°°°°°°°°°°°°°°°°°°°°*/
	
	@Override
	public String toString() {
		return "Consumo [id=" + id + ", fecha=" + fecha + ", valor=" + valor + "]";
	}
	
	
	
	
	

}
