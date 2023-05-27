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
import ecr.web.app.client.services.ShiftService;
import ecr.web.app.server.dao.ShiftDAO;
import ecr.web.app.shared.dto.ShiftDTO;






/**
 * The server side implementation of the RPC service.
 */
@Service("ShiftService")
public class ShiftServiceImp extends RemoteServiceServlet implements ShiftService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(ShiftServiceImp.class);

	@Autowired
	private ShiftDAO _shiftDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(ShiftDTO _ShiftDTO) throws Exception {

		
		try {
			if (_ShiftDTO .getId_shift() == null) {
				_shiftDAO.persist(_ShiftDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(ShiftDTO _ShiftDTO) throws Exception {

		
		try {
			if (_ShiftDTO .getId_shift() != null) {
				_shiftDAO.merge(_ShiftDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_shiftDAO.remove(_shiftDAO.findById(id));
		
	}

	public ShiftDTO selectRow(long id) 
	{
		return _shiftDAO.findById(id);
	}

	public List<ShiftDTO> selectAllRows() {
		List<ShiftDTO> findAll = _shiftDAO.findAll();
		List<ShiftDTO> result = new ArrayList<ShiftDTO>();
		for (ShiftDTO  _ShiftDTO  : findAll) {
			result.add(new ShiftDTO(_ShiftDTO));
		}
		return result;
	}

	public List<ShiftDTO> getShiftbyCaisse(long id_caisse) {
		// TODO Auto-generated method stub
		return _shiftDAO.getShiftbyCaisse(id_caisse);
	}


 
}

