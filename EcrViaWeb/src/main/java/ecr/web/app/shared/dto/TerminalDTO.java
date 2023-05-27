package ecr.web.app.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Terminal")
public class TerminalDTO implements Serializable{
	
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
	@Column(name = "ID_TERMINAL")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "ADRESSIP")
	private String adressip;
	
	@Column(name = "BRANDE")
	private String brande;
	
	@Column(name = "REFERENCE")
	private String reference;
	@Column(name = "Code")
	private String Code;
	
	

	public TerminalDTO(TerminalDTO _Obj_defDTO) {
		this.id = _Obj_defDTO.getId() ;
		this.adressip = _Obj_defDTO.getAdressip();
		this.brande = _Obj_defDTO.getBrande();
		this.reference = _Obj_defDTO.getReference();
		this.Code="TER"+ _Obj_defDTO.getId();
	}

	public TerminalDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	
	/**
	 * @return the brande
	 */
	public String getBrande() {
		return brande;
	}

	/**
	 * @param brande the brande to set
	 */
	public void setBrande(String brande) {
		this.brande = brande;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "TerminalDTO [id=" + id + ", adressip=" + adressip + ", brande="
				+ brande + ", reference=" + reference + "]";
	}

	public String getAdressip() {
		return adressip;
	}

	public void setAdressip(String adressip) {
		this.adressip = adressip;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	




	

	
	
	
}
