package ecr.web.app.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ecr.web.app.shared.dto.ProductsDTO;



@RemoteServiceRelativePath("springGwtServices/Produit_defService")

public interface ProductsService extends RemoteService {
	  public void insertRow(ProductsDTO _Obj_defDTO) throws Exception;
	  public void updateRow(ProductsDTO _Obj_defDTO) throws Exception;
	  public void deleteRow(long id) throws Exception;
	  public ProductsDTO selectRow(long id);
	  public List<ProductsDTO> selectAllRows();
	  public List<ProductsDTO> getProduitByRayon(String rayonId);
	  public List<ProductsDTO> getProduitBydiscounts(String Iddicsount);

}
