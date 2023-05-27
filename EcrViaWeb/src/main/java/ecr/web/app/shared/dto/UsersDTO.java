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
@Table(name = "USERTAB")
public class UsersDTO implements Serializable {

	
	

	public UsersDTO(Long id, String login, String password, String role,
			String ipadess, String ipadess1, String ipadess2, String ipadess3,long idcash,
			String name, String name2, String tel1, String tel2, Date datenais,
			String adresse, String codepos, String image,String mail) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.role = role;
		this.ipadess = ipadess;
		this.ipadess1 = ipadess1;
		this.ipadess2 = ipadess2;
		this.ipadess3 = ipadess3;
		this.idcash=idcash;
		this.name = name;
		this.name2 = name2;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.datenais = datenais;
		this.adresse = adresse;
		this.codepos = codepos;
		this.image = image;
		this.mail=mail;
		
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
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "LOGIN")
	private String login;
	
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "ROLE")
	private String role;
	@Column(name = "IPADRESS")
	private String ipadess;
	@Column(name = "IPADRESS1")
	private String ipadess1;
	@Column(name = "IPADRESS2")
	private String ipadess2;
	@Column(name = "IPADRESS3")
	private String ipadess3;
	@Column(name = "IDCASH")
	private Long idcash ;
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
	@Column(name = "MAIL")
	private String mail;
	@Column(name = "Interest")
	private String Interest;
	/* Constructors*/

	


	/**
	 * @param _Obj_defDTO
	 */
	public UsersDTO(UsersDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
		this.id = _Obj_defDTO.getId();
		this.password = _Obj_defDTO.getPassword();	
		this.login=_Obj_defDTO.getLogin();
		this.role = _Obj_defDTO.getRole();
		this.ipadess= _Obj_defDTO.getIpadess();
		this.ipadess1= _Obj_defDTO.getIpadess1();
		this.ipadess2= _Obj_defDTO.getIpadess2();
		this.ipadess3= _Obj_defDTO.getIpadess3();
        this.idcash=_Obj_defDTO.getIdcash();
		this.name = _Obj_defDTO.getName();
		this.name2 = _Obj_defDTO.getName2();
		this.tel1 = _Obj_defDTO.getTel1();
		this.datenais = _Obj_defDTO.getDatenais();
		this.adresse = _Obj_defDTO.getAdresse();
		this.codepos = _Obj_defDTO.getCodepos();
		this.image = _Obj_defDTO.getImage();
		this.mail=_Obj_defDTO.getMail();
		this.Interest=_Obj_defDTO.getInterest();
	}
	
	public String getInterest() {
		return Interest;
	}

	public void setInterest(String interest) {
		Interest = interest;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public UsersDTO() {		
			
	}
	



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	

	public Date getDatenais() {
		return datenais;
	}

	public void setDatenais(Date datenais) {
		this.datenais = datenais;
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



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getIpadess() {
		return ipadess;
	}



	public void setIpadess(String ipadess) {
		this.ipadess = ipadess;
	}






	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	




	public String getIpadess1() {
		return ipadess1;
	}



	public void setIpadess1(String ipadess1) {
		this.ipadess1 = ipadess1;
	}



	public String getIpadess2() {
		return ipadess2;
	}



	public void setIpadess2(String ipadess2) {
		this.ipadess2 = ipadess2;
	}



	public String getIpadess3() {
		return ipadess3;
	}



	public void setIpadess3(String ipadess3) {
		this.ipadess3 = ipadess3;
	}

	public Long getIdcash() {
		return idcash;
	}

	public void setIdcash(Long idcash) {
		this.idcash = idcash;
	}



}
