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
import ecr.web.app.client.services.TVAService;
import ecr.web.app.server.dao.CashDAO;
import ecr.web.app.server.dao.TVADAO;
import ecr.web.app.shared.dto.TVADTO;






/**
 * The server side implementation of the RPC service.
 */
@Service("TVAService")
public class TVAServiceImpl extends RemoteServiceServlet implements TVAService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(TVAServiceImpl.class);

	@Autowired
	private TVADAO TVADAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(TVADTO _TVADTO) throws Exception {

		
		try {
			if (_TVADTO.getId_tva() == null) {
				TVADAO.persist(_TVADTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(TVADTO _TVADTO) throws Exception {

		
		try {
			if (_TVADTO .getId_tva() != null) {
				TVADAO.merge(_TVADTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			TVADAO.remove(TVADAO.findById(id));
		
	}

	public TVADTO selectRow(long id) 
	{
		return TVADAO.findById(id);
	}

	public List<TVADTO> selectAllRows() {
		List<TVADTO> findAll = TVADAO.findAll();
		List<TVADTO> result = new ArrayList<TVADTO>();
		for (TVADTO  _TVADTO  : findAll) {
			result.add(new TVADTO(_TVADTO));
		}
		return result;
	}




 
}

