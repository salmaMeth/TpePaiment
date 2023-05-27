package ecr.web.app.server.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ecr.web.app.client.services.ProductsService;
import ecr.web.app.server.dao.ProductsDAO;
import ecr.web.app.shared.dto.ProductsDTO;






/**
 * The server side implementation of the RPC service.
 */
@Service("Produit_defService")
public class ProductsServiceImpl extends RemoteServiceServlet implements ProductsService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(ProductsServiceImpl.class);

	@Autowired
	private ProductsDAO _Produit_defDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(ProductsDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO .getId_product() == null) {
				_Produit_defDAO.persist(_Obj_defDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(ProductsDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO .getId_product() != null) {
				_Produit_defDAO.merge(_Obj_defDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_Produit_defDAO.remove(_Produit_defDAO.findById(id));
		
	}

	public ProductsDTO selectRow(long id) 
	{
		return _Produit_defDAO.findById(id);
	}

	public List<ProductsDTO> selectAllRows() {
		List<ProductsDTO> findAll = _Produit_defDAO.findAll();
		List<ProductsDTO> result = new ArrayList<ProductsDTO>();
		for (ProductsDTO  _Obj_defDTO  : findAll) {
			result.add(new ProductsDTO(_Obj_defDTO));
		}
		return result;
	}

	public List<ProductsDTO> getProduitByRayon(String rayonId) {
		return _Produit_defDAO.getProduitByRayon(rayonId);
	}

	public List<ProductsDTO> getProduitBydiscounts(String Iddicsount) {
		// TODO Auto-generated method stub
		return _Produit_defDAO.getProduitBydiscount(Iddicsount);	}

 
}

