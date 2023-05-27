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
@Table(name = "TVA")
public class TVADTO implements Serializable {
	

	public TVADTO(Long id_tva, Long amount, String libelle) {
		super();
		this.id_tva = id_tva;
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
	@Column(name = "ID_tva")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_tva;
	

	@Column(name = "amount")
	private Long amount;
	
	@Column(name = "libelle")
	private String libelle;

	public Long getId_tva() {
		return id_tva;
	}

	public void setId_tva(Long id_tva) {
		this.id_tva = id_tva;
	}

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


	public TVADTO(){}
	public TVADTO(TVADTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
this.amount=_Obj_defDTO.getAmount();
this.id_tva=_Obj_defDTO.id_tva;
this.libelle=_Obj_defDTO.getLibelle();
		}
	

	

}
