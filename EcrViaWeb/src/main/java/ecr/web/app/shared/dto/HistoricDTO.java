package ecr.web.app.shared.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "HistProduct")
public class HistoricDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name = "IDHIS")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Id
	@Column(name = "IDTRANSACTION")
	private long idtransaction;
	
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "productid")
	private long productid;
	@Column(name = "DESCREPTION")
	private String descreption;
	@Column(name = "NAME")
	private String name;
	@Column(name = "Price")
	private long Price;
	@Column(name = "Quantity")
	private long quantity;
	@Column(name = "LOYALITY")
	private long loyality;
	@Column(name = "PRICE_SALE")
	private String sale;
    @Column(name="CODE_RANGE")
    private String code_range;
    @Column(name = "MARQUE")
	private String marque;
	public String getCode_range() {
		return code_range;
	}


	public void setCode_range(String code_range) {
		this.code_range = code_range;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public HistoricDTO(HistoricDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
		this.productid=_Obj_defDTO.getProductid();
		this.code ="PROD";
		this.idtransaction=_Obj_defDTO.getIdtransaction();
		this.descreption=_Obj_defDTO.getDescreption();
		this.Price=_Obj_defDTO.getPrice();
		this.quantity=_Obj_defDTO.getQuantity();
		this.name = _Obj_defDTO.getName();
		this.loyality= _Obj_defDTO.getLoyality();
		this.code_range=_Obj_defDTO.getCode_range();
		this.marque=_Obj_defDTO.getMarque();
		}


public HistoricDTO(){}





public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public long getIdtransaction() {
	return idtransaction;
}


public void setIdtransaction(long idtransaction) {
	this.idtransaction = idtransaction;
}





public String getDescreption() {
	return descreption;
}


public void setDescreption(String descreption) {
	this.descreption = descreption;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}





public long getLoyality() {
	return loyality;
}


public void setLoyality(long loyality) {
	this.loyality = loyality;
}


public long getPrice() {
	return Price;
}


public void setPrice(long price) {
	Price = price;
}


public long getQuantity() {
	return quantity;
}


public void setQuantity(long quantity) {
	this.quantity = quantity;
}


public String getSale() {
	return sale;
}


public void setSale(String sale) {
	this.sale = sale;
}


public long getProductid() {
	return productid;
}


public void setProductid(long productid) {
	this.productid = productid;
}


	

}