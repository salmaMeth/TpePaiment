package ecr.web.app.shared.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PROVIDER")
public class ProviderDTO implements Serializable {

	
	

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
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NAME1")
	private String name2;
	@Column(name = "TEL1")
	private String tel1;
	@Column(name = "TEL2")
	private String tel2;
	
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "CODEPOS")
	private String codepos;
	@Column(name = "property")
	private String property;
	@Column(name = "mail")
	private String mail;
	

	public ProviderDTO(ProviderDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
		this.id = _Obj_defDTO.getId();
		this.name = _Obj_defDTO.getName();
		this.name2 = _Obj_defDTO.getName2();
		this.tel1 = _Obj_defDTO.getTel1();
		this.tel2 = _Obj_defDTO.getTel2();
		this.adresse = _Obj_defDTO.getAdresse();
		this.codepos = _Obj_defDTO.getCodepos();
		this.property=_Obj_defDTO.getProperty();
		this.mail=_Obj_defDTO.getMail();
	}
	
	public ProviderDTO() {		
			
	}
	



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodepos() {
		return codepos;
	}

	public void setCodepos(String codepos) {
		this.codepos = codepos;
	}








	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	



	


}
