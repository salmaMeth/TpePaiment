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
@Table(name = "CLIENT")
public class ClientDTO implements Serializable {

	
	

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
	
	@Column(name = "CARDID")
	private long cardid;
	
	@Column(name = "LOYALITY")
	private long loyality;
	@Column(name = "city")
	private String city;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NAME1")
	private String name2;
	@Column(name = "TEL1")
	private String tel1;
	@Column(name = "TEL2")
	private String tel2;
	@Column(name = "DATENAIS")
	private Date datenais;
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "CODEPOS")
	private String codepos;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "continent")
	private String continent;
	@Column(name = "SituationFa")
	private String SituationFa;
	@Column(name = "Profession")
	private String Profession;
	@Column(name = "Sexe")
	private String Sexe;
	
	
	public String getSexe() {
		return Sexe;
	}



	public void setSexe(String sexe) {
		Sexe = sexe;
	}



	public String getSituationFa() {
		return SituationFa;
	}



	public void setSituationFa(String situationFa) {
		SituationFa = situationFa;
	}



	public String getProfession() {
		return Profession;
	}



	public void setProfession(String profession) {
		Profession = profession;
	}



	public String getContinent() {
		return continent;
	}



	public void setContinent(String continent) {
		this.continent = continent;
	}



	
	/* Constructors*/




	public ClientDTO(ClientDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
		this.id = _Obj_defDTO.getId();
		this.cardid = _Obj_defDTO.getCardid();	
		this.loyality=_Obj_defDTO.getLoyality();
		this.city= _Obj_defDTO.getCity();
		this.name = _Obj_defDTO.getName();
		this.name2 = _Obj_defDTO.getName2();
		this.tel1 = _Obj_defDTO.getTel1();
		this.tel2 = _Obj_defDTO.getTel2();
		this.datenais = _Obj_defDTO.getDatenais();
		this.adresse = _Obj_defDTO.getAdresse();
		this.codepos = _Obj_defDTO.getCodepos();
		this.image = _Obj_defDTO.getImage();
		this.continent=_Obj_defDTO.getContinent();
		this.Profession=_Obj_defDTO.getProfession();
		this.SituationFa=_Obj_defDTO.getSituationFa();
        this.Sexe=_Obj_defDTO.getSexe();
		
	}
	
	public ClientDTO() {		
			
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

	public Date getDatenais() {
		return datenais;
	}

	public void setDatenais(Date datenais) {
		this.datenais = datenais;
	}



	public String getCodepos() {
		return codepos;
	}

	public void setCodepos(String codepos) {
		this.codepos = codepos;
	}



	





	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	


	public long getCardid() {
		return cardid;
	}



	public void setCardid(long cardid) {
		this.cardid = cardid;
	}



	public long getLoyality() {
		return loyality;
	}



	public void setLoyality(long loyality) {
		this.loyality = loyality;
	}




}
