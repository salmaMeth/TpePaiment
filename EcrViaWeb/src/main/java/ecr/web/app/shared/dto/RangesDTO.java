package ecr.web.app.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ranges")
public class RangesDTO implements Serializable{
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
	@Column(name = "ID_range")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_range ;
	
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String Description;
	@Column(name = "Code")
	private String Code;
	@Column(name = "IMAGR")
	private String image;
	public RangesDTO() {}
	
	public RangesDTO(RangesDTO _Rayon_DTO) 
	{   this.id_range=_Rayon_DTO.getId_range();
		this.Code="RAN"+ _Rayon_DTO.getId_range();
		this.name = _Rayon_DTO.getName();	
		this.Description=_Rayon_DTO.getDescription();
		this.image=_Rayon_DTO.getImage();

	}

	public long getId_range() {
		return id_range;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}



	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId_range(long id_range) {
		this.id_range = id_range;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
	}

		
	
	
	
	
	


	
