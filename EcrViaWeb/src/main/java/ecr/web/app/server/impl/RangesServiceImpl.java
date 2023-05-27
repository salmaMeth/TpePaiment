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

import ecr.web.app.client.services.RangesService;
import ecr.web.app.server.dao.RangesDAO;
import ecr.web.app.shared.dto.RangesDTO;



/**
 * The server side implementation of the RPC service.
 */
@Service("Rayon_defService")
public class RangesServiceImpl extends RemoteServiceServlet implements RangesService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(RangesServiceImpl.class);

	@Autowired
	private RangesDAO _Rayon_defDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(RangesDTO _Obj_defDTO) throws Exception {

		
		try {
			 
				_Rayon_defDAO.persist(_Obj_defDTO );
			
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(RangesDTO _Obj_defDTO) throws Exception {

		
		try {
			
				_Rayon_defDAO.merge(_Obj_defDTO);
			
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_Rayon_defDAO.remove(_Rayon_defDAO.findById(id));
		
	}

	public RangesDTO selectRow(long id) 
	{
		return _Rayon_defDAO.findById(id);
	}

	public List<RangesDTO> selectAllRows() {
		List<RangesDTO> findAll = _Rayon_defDAO.findAll();
		List<RangesDTO> result = new ArrayList<RangesDTO>();
		for (RangesDTO  _Obj_defDTO  : findAll) {
			result.add(new RangesDTO(_Obj_defDTO));
		}
		return result;
	}

 
}

