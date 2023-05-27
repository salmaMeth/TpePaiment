package ecr.web.app.shared.dto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "DISCOUNTS")
public class DiscountsDTO implements Serializable {
	

	public DiscountsDTO(Long id_tva, Long amount, String libelle) {
		super();
		this.id_discount = id_tva;
		this.amount = amount;
		this.libelle = libelle;
	}

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
	@Column(name = "id_discount")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_discount;
	

	@Column(name = "amount")
	private Long amount;
	
	@Column(name = "libelle")
	private String libelle;

	
	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public DiscountsDTO(){}
	public DiscountsDTO(DiscountsDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
this.amount=_Obj_defDTO.getAmount();
this.id_discount=_Obj_defDTO.id_discount;
this.libelle=_Obj_defDTO.getLibelle();
		}

	public Long getId_discount() {
		return id_discount;
	}

	public void setId_discount(Long id_discount) {
		this.id_discount = id_discount;
	}
	

	

}
