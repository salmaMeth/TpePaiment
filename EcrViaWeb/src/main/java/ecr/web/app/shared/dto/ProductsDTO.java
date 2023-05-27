package ecr.web.app.shared.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUCTS")
public class ProductsDTO implements Serializable {
	

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
	@Column(name = "ID_PRODUCT")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_product;
	
	@Id
	@Column(name = "BARCODE")
	private long barcode;
	
	@Column(name = "CODE")
	private String code;
	
	
	@Column(name = "DESCREPTION")
	private String descreption;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE_SALE")
	private String sale;
	@Column(name = "PRICE_BUY")
	private String buy;
	@Column(name = "ID_TVA")
	private String id_tva;
	@Column(name = "Qt_STOCK")
	private String qt_stock;
	@Column(name = "LOYALITY")
	private long loyality;
	@Column(name = "ID_DISCOUNT")
	private String id_discount;
	@Column(name = "STATE")
	private String state;
	@Column(name = "ID_PROVIDER")
	private String  ID_provider ;

	//@ManyToOne
    @Column(name="CODE_RANGE")
    private String code_range;
    @Column(name="CODE_provider")
    private String code_proviser;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "Price")
	private long Price;
	@Column(name = "Quantity")
	private long quantity;
	
	
	public ProductsDTO(ProductsDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
		this.id_product = _Obj_defDTO.getId_product();
		this.code =" PRO"+_Obj_defDTO.getId_product();
		this.descreption=_Obj_defDTO.getDescreption();
		this.sale=_Obj_defDTO.getSale();
		this.buy=_Obj_defDTO.getBuy();
		this.name = _Obj_defDTO.getName();
		this.code_range=_Obj_defDTO.get_range();
		this.id_discount = _Obj_defDTO.getId_discount();
		this.loyality= _Obj_defDTO.getLoyality();
		this.id_tva = _Obj_defDTO.getId_tva();
		this.qt_stock= _Obj_defDTO.getQt_stock();
		this.state=_Obj_defDTO.state;
		this.ID_provider=_Obj_defDTO.getID_provider();
		this.barcode=_Obj_defDTO.getBarcode();
		this.image=_Obj_defDTO.getImage();
		}

	
public ProductsDTO(){}


public Long getId_product() {
	return id_product;
}


public void setId_product(Long id_product) {
	this.id_product = id_product;
}


public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
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







public String getQt_stock() {
	return qt_stock;
}


public void setQt_stock(String qt_stock) {
	this.qt_stock = qt_stock;
}


public long getLoyality() {
	return loyality;
}


public void setLoyality(long loyality) {
	this.loyality = loyality;
}





public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getID_provider() {
	return ID_provider;
}


public void setID_provider(String iD_provider) {
	ID_provider = iD_provider;
}


public String get_range() {
	return code_range;
}


public void set_range(String _range) {
	this.code_range = _range;
}


public String getId_tva() {
	return id_tva;
}


public void setId_tva(String id_tva) {
	this.id_tva = id_tva;
}


public String getId_discount() {
	return id_discount;
}


public void setId_discount(String id_discount) {
	this.id_discount = id_discount;
}


public String getSale() {
	return sale;
}


public void setSale(String sale) {
	this.sale = sale;
}


public String getBuy() {
	return buy;
}


public void setBuy(String buy) {
	this.buy = buy;
}





public long getBarcode() {
	return barcode;
}


public void setBarcode(long barcode) {
	this.barcode = barcode;
}


public String getImage() {
	return image;
}


public void setImage(String image) {
	this.image = image;
}


@Override
public String toString() {
	return "ProductsDTO [id_product=" + id_product + ", barcode=" + barcode
			+ ", code=" + code + ", descreption=" + descreption + ", name="
			+ name + ", sale=" + sale + ", buy=" + buy + ", id_tva=" + id_tva
			+ ", qt_stock=" + qt_stock + ", loyality=" + loyality
			+ ", id_discount=" + id_discount + ", state=" + state
			+ ", ID_provider=" + ID_provider + ", code_range=" + code_range
			+ ", image=" + image + "]";
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



	

}
