package ecr.web.app.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADRESSMAIL")
public class AdressMailDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdressMailDTO(Long id_Mail, String adressmail) {
		super();
		Id_Mail = id_Mail;
		this.adressmail = adressmail;
	}
	public AdressMailDTO(AdressMailDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
this.Id_Mail=_Obj_defDTO.getId();
this.adressmail=_Obj_defDTO.getAdressmail();
		}

	
public AdressMailDTO(){}

	
	
	
	
	@Override
	public String toString() {
		return "AdressMailDTO [id=" + Id_Mail + ", adressmail=" + adressmail + "]";
	}

	public String getAdressmail() {
		return adressmail;
	}

	public void setAdressmail(String adressmail) {
		this.adressmail = adressmail;
	}

	public Long getId() {
		return Id_Mail;
	}

	public void setId(Long Id_Mail) {
		this.Id_Mail = Id_Mail;
	}



	@Id
	@Column(name = "ID_MAIL")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id_Mail;
	
	@Column(name = "ADRESSMAIL")
	private String adressmail;

	
}
