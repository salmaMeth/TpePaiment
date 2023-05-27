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

import ecr.web.app.client.services.CashService;
import ecr.web.app.server.dao.CashDAO;
import ecr.web.app.shared.dto.CashDTO;
import ecr.web.app.shared.dto.RetournDataDTO;






/**
 * The server side implementation of the RPC service.
 */
@Service("CashService")
public class CashServiceImp extends RemoteServiceServlet implements CashService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(CashServiceImp.class);

	@Autowired
	private CashDAO _CashDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(CashDTO _CashDTO) throws Exception {

		
		try {
			if (_CashDTO .getId_cash() == null) {
				_CashDAO.persist(_CashDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(CashDTO _CashDTO) throws Exception {

		
		try {
			if (_CashDTO .getId_cash() != null) {
				_CashDAO.merge(_CashDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_CashDAO.remove(_CashDAO.findById(id));
		
	}

	public CashDTO selectRow(long id) 
	{
		return _CashDAO.findById(id);
	}

	public List<CashDTO> selectAllRows() {
		List<CashDTO> findAll = _CashDAO.findAll();
		List<CashDTO> result = new ArrayList<CashDTO>();
		for (CashDTO  _CashDTO  : findAll) {
			result.add(new CashDTO(_CashDTO));
		}
		return result;
	}

	public List<CashDTO> getCaissebycode(long code) throws Exception {
		// TODO Auto-generated method stub
		return _CashDAO.getCaissebycode(code);
	
	}

	public List<CashDTO> distinct() throws Exception {
		// TODO Auto-generated method stub
		return _CashDAO.distinct();
	}

	public  Long GetAvg(long id_caisse) throws Exception {
		// TODO Auto-generated method stub
		return _CashDAO.GetAvg(id_caisse);

	}


	public  List<?>  distinctCach() throws Exception {
		// TODO Auto-generated method stub
		return _CashDAO.distinctCach();

	}
	public List<CashDTO> distinctRegister() throws Exception {
		// TODO Auto-generated method stub
		return _CashDAO.distinctRegister();
	}
	
}

