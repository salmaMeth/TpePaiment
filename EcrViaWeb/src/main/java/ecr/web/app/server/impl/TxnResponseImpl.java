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


import ecr.web.app.client.services.TxnResponseService;

import ecr.web.app.server.dao.TxnResponseDAO;
import ecr.web.app.shared.dto.TxnResponseDTO;






/**
 * The server side implementation of the RPC service.
 */
@Service("transactionout")

public class TxnResponseImpl extends RemoteServiceServlet implements TxnResponseService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(TxnResponseImpl.class);

	@Autowired
	private TxnResponseDAO _TxnResponsDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(TxnResponseDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO .getId() == null) {
				_TxnResponsDAO.persist(_Obj_defDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(TxnResponseDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO .getId() != null) {
				_TxnResponsDAO.merge(_Obj_defDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_TxnResponsDAO.remove(_TxnResponsDAO.findById(id));
		
	}

	public TxnResponseDTO selectRow(long id) 
	{
		return _TxnResponsDAO.findById(id);
	}

	public List<TxnResponseDTO> selectAllRows() {
		List<TxnResponseDTO> findAll = _TxnResponsDAO.findAll();
		List<TxnResponseDTO> result = new ArrayList<TxnResponseDTO>();
		for (TxnResponseDTO  _Obj_defDTO  : findAll) {
			result.add(new TxnResponseDTO(_Obj_defDTO));
		}
		return result;
	}

	

 
}

