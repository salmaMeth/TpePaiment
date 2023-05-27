package ecr.web.app.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPTIONS")
public class OptionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "ENTETE")
	private String entete;
	
	public String getPasswordmail() {
		return passwordmail;
	}
	public void setPasswordmail(String passwordmail) {
		this.passwordmail = passwordmail;
	}
	@Column(name = "PIED")
	private String pied;
	
	@Column(name = "MAIL")
	private String mail;
	@Column(name = "PASSWORD")
	private String passwordmail;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Column(name = "IMAGE")
	private String image;
	
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
	public String getEntete() {
		return entete;
	}
	public void setEntete(String entete) {
		this.entete = entete;
	}
	public String getPied() {
		return pied;
	}
	public void setPied(String pied) {
		this.pied = pied;
	}
	@Override
	public String toString() {
		return "OptionDTO [id=" + id + ", name=" + name + ", entete=" + entete
				+ ", pied=" + pied + ", image=" + image + "]";
	}
	public OptionDTO(OptionDTO optionDTO) {		
		// TODO Auto-generated constructor stub
		this.id = optionDTO.getId();
		this.entete = optionDTO.getEntete();	
		this.name=optionDTO.getName();
		this.pied=optionDTO.getPied();
		this.image= optionDTO.getImage();
		this.mail= optionDTO.getMail();
		this.passwordmail=optionDTO.getPasswordmail();
		}
	
	public OptionDTO() {		
			
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
