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
@Table(name = "Shift")
public class ShiftDTO implements Serializable {
	

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
	@Column(name = "ID_shift")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_shift;
	
	
	@Column(name = "AMOUNT")
	private long amount;

	@Column(name = "ID_CAISSE")
	private long id_caisse;
	
	@Column(name = "NUM_SHIFT")
	 private String num_shift;
	
	@Column(name = "DATE")
   	private Date date;
	
	
	
	public ShiftDTO(ShiftDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
this.amount=_Obj_defDTO.getAmount();
this.id_caisse=_Obj_defDTO.getId_caisse();
this.date=_Obj_defDTO.getDate();
		}

	
public ShiftDTO(){}


public Long getId_shift() {
	return id_shift;
}


public void setId_shift(Long id_shift) {
	this.id_shift = id_shift;
}


public long getAmount() {
	return amount;
}


public void setAmount(long amount) {
	this.amount = amount;
}


public long getId_caisse() {
	return id_caisse;
}


public void setId_caisse(long id_caisse) {
	this.id_caisse = id_caisse;
}


public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public String getNum_shift() {
	return num_shift;
}


public void setNum_shift(String num_shift) {
	this.num_shift = num_shift;
}











	

}
