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

import ecr.web.app.client.services.ClientService;
import ecr.web.app.client.services.ProviderService;
import ecr.web.app.client.services.UsersService;
import ecr.web.app.server.dao.ProviderDAO;
import ecr.web.app.server.dao.UserDAO;
import ecr.web.app.shared.FieldVerifier;
import ecr.web.app.shared.dto.ProviderDTO;
import ecr.web.app.shared.dto.UsersDTO;



/**
 * The server side implementation of the RPC service.
 */
@Service("providerdefService")
public class ProviderServiceImp extends RemoteServiceServlet implements ProviderService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(ProviderServiceImp.class);

	@Autowired
	private ProviderDAO providerDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(ProviderDTO ObjdefDTO) throws Exception {

		
		try {
			if (ObjdefDTO .getId() == null) {
				providerDAO.persist(ObjdefDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(ProviderDTO ObjdefDTO) throws Exception {

		
		try {
			if (ObjdefDTO .getId() != null) {
				providerDAO.merge(ObjdefDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			providerDAO.remove(providerDAO.findById(id));
		
	}

	public ProviderDTO selectRow(long id) 
	{
		return providerDAO.findById(id);
	}

	public List<ProviderDTO> selectAllRows() {
		List<ProviderDTO> findAll = providerDAO.findAll();
		List<ProviderDTO> result = new ArrayList<ProviderDTO>();
		for (ProviderDTO  ObjdefDTO  : findAll) {
			result.add(new ProviderDTO(ObjdefDTO));
		}
		return result;
	}

	
 
}

