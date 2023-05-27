package ecr.web.app.shared.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "CASH")
public class CashDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;

	
	/**
	 * (1) Add columns here using syntax :
	 * 		@Column(name = "FIELD")
	 * 		private <Type> field;
	 * 
	 * (2) Add their getters and setters.
	 * 
	 * (3) Complete constructors with fields.
	 * 
	 */

	@Id
	@Column(name = "ID_CASH")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_cash;
	
	
	@Column(name = "AMOUNT")
	private long amount;


	@Column(name = "DATE")
	private Date date;
	@Column(name = "ID_CAISSE")
	private Long id_caisse;
	
	
	public CashDTO(CashDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
this.amount=_Obj_defDTO.getAmount();
this.id_caisse=_Obj_defDTO.getId_caisse();
this.id_cash=_Obj_defDTO.getId_cash();
		}

	
public CashDTO(){}


public long getAmount() {
	return amount;
}


public void setAmount(long amount) {
	this.amount = amount;
}


public Long getId_cash() {
	return id_cash;
}


public void setId_cash(Long id_cash) {
	this.id_cash = id_cash;
}




public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public Long getId_caisse() {
	return id_caisse;
}


public void setId_caisse(Long id_caisse) {
	this.id_caisse = id_caisse;
}






	

}
