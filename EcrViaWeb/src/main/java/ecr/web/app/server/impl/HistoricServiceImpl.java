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

import ecr.web.app.client.services.HistoricService;
import ecr.web.app.client.services.ProductsService;
import ecr.web.app.server.dao.HistoricDAO;
import ecr.web.app.server.dao.ProductsDAO;
import ecr.web.app.shared.dto.HistoricDTO;
import ecr.web.app.shared.dto.ProductsDTO;






/**
 * The server side implementation of the RPC service.
 */
@Service("HistoricService")
public class HistoricServiceImpl extends RemoteServiceServlet implements HistoricService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(HistoricServiceImpl.class);

	@Autowired
	private HistoricDAO _HistoricDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(HistoricDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO .getId() == null) {
				_HistoricDAO.persist(_Obj_defDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(HistoricDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO.getId() != null) {
				_HistoricDAO.merge(_Obj_defDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_HistoricDAO.remove(_HistoricDAO.findById(id));
		
	}

	public HistoricDTO selectRow(long id) 
	{
		return _HistoricDAO.findById(id);
	}

	public List<HistoricDTO> selectAllRows() {
		List<HistoricDTO> findAll = _HistoricDAO.findAll();
		List<HistoricDTO> result = new ArrayList<HistoricDTO>();
		for (HistoricDTO  _Obj_defDTO  : findAll) {
			result.add(new HistoricDTO(_Obj_defDTO));
		}
		return result;
	}

	public List<HistoricDTO> getProdByTran(long tranId) {
		return _HistoricDAO.getProByTran(tranId);
	}

	public List<HistoricDTO> getProByRange(String code_range) {
		// TODO Auto-generated method stub
		return _HistoricDAO.getProByRange(code_range);
	}


	

 
}
