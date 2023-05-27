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

import ecr.web.app.client.services.AdressMailService;
import ecr.web.app.server.dao.AdressMailDAO;
import ecr.web.app.shared.dto.AdressMailDTO;






/**
 * The server side implementation of the RPC service.
 */
@Service("AdressMailService")
public class AdressMailServiceImp extends RemoteServiceServlet implements AdressMailService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(AdressMailServiceImp.class);

	@Autowired
	private AdressMailDAO _AdressMailDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(AdressMailDTO _AdressMailDTO) throws Exception {

		
		try {
			if (_AdressMailDTO .getId()== null) {
				_AdressMailDAO.persist(_AdressMailDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(AdressMailDTO _AdressMailDTO) throws Exception {

		
		try {
			if (_AdressMailDTO .getId() != null) {
				_AdressMailDAO.merge(_AdressMailDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_AdressMailDAO.remove(_AdressMailDAO.findById(id));
		
	}

	public AdressMailDTO selectRow(long id) 
	{
		return _AdressMailDAO.findById(id);
	}

	public List<AdressMailDTO> selectAllRows() {
		List<AdressMailDTO> findAll = _AdressMailDAO.findAll();
		List<AdressMailDTO> result = new ArrayList<AdressMailDTO>();
		for (AdressMailDTO  _AdressMailDTO  : findAll) {
			result.add(new AdressMailDTO(_AdressMailDTO));
		}
		return result;
	}

	public List<AdressMailDTO> getCaissebycode(long idmail) throws Exception {
		// TODO Auto-generated method stub
		return _AdressMailDAO.getMailbyId(idmail);
	
	}


 
}

