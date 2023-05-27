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

import ecr.web.app.client.services.DiscountService;
import ecr.web.app.server.dao.DicountDAO;
import ecr.web.app.shared.dto.DiscountsDTO;







/**
 * The server side implementation of the RPC service.
 */
@Service("DiscountsService")
public class DiscountServiceImpl extends RemoteServiceServlet implements DiscountService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(DiscountServiceImpl.class);

	@Autowired
	private DicountDAO discountdao;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(DiscountsDTO _DiscountsDTO) throws Exception {

		
		try {
			if (_DiscountsDTO.getId_discount() == null) {
				discountdao.persist(_DiscountsDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(DiscountsDTO _DiscountsDTO) throws Exception {

		
		try {
			if (_DiscountsDTO .getId_discount() != null) {
				discountdao.merge(_DiscountsDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			discountdao.remove(discountdao.findById(id));
		
	}

	public DiscountsDTO selectRow(long id) 
	{
		return discountdao.findById(id);
	}

	public List<DiscountsDTO> selectAllRows() {
		List<DiscountsDTO> findAll = discountdao.findAll();
		List<DiscountsDTO> result = new ArrayList<DiscountsDTO>();
		for (DiscountsDTO  _DiscountsDTO  : findAll) {
			result.add(new DiscountsDTO(_DiscountsDTO));
		}
		return result;
	}




 
}

