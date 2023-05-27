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
import ecr.web.app.client.services.TerminalService;
import ecr.web.app.server.dao.TerminalDAO;
import ecr.web.app.shared.dto.TerminalDTO;




/**
 * The server side implementation of the RPC service.
 */
@Service("TerminalService")
public class TerminalServiceImp extends RemoteServiceServlet implements TerminalService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(TerminalServiceImp.class);

	@Autowired
	private TerminalDAO  _TerminalDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(TerminalDTO _TerminalDTO) throws Exception {

		
		try {
			 
				_TerminalDAO.persist(_TerminalDTO );
			
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(TerminalDTO _TerminalDTO) throws Exception {

		
		try {
			
				_TerminalDAO.merge(_TerminalDTO);
			
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			_TerminalDAO.remove(_TerminalDAO.findById(id));
		
	}

	public TerminalDTO selectRow(long id) 
	{
		return _TerminalDAO.findById(id);
	}

	public List<TerminalDTO> selectAllRows() {
		List<TerminalDTO> findAll = _TerminalDAO.findAll();
		List<TerminalDTO> result = new ArrayList<TerminalDTO>();
		for (TerminalDTO  _TerminalDTO  : findAll) {
			result.add(new TerminalDTO(_TerminalDTO));
		}
		return result;
	}

 
}
