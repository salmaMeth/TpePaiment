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
import ecr.web.app.client.services.UsersService;
import ecr.web.app.server.dao.ClientDAO;
import ecr.web.app.server.dao.UserDAO;
import ecr.web.app.shared.FieldVerifier;
import ecr.web.app.shared.dto.ClientDTO;
import ecr.web.app.shared.dto.UsersDTO;



/**
 * The server side implementation of the RPC service.
 */
@Service("ClientdefService")
public class ClientServiceImp extends RemoteServiceServlet implements ClientService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(ClientServiceImp.class);

	@Autowired
	private ClientDAO ClientdefDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(ClientDTO ObjdefDTO) throws Exception {

		
		try {
			if (ObjdefDTO .getId() == null) {
				ClientdefDAO.persist(ObjdefDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(ClientDTO ObjdefDTO) throws Exception {

		
		try {
			if (ObjdefDTO .getId() != null) {
				ClientdefDAO.merge(ObjdefDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			ClientdefDAO.remove(ClientdefDAO.findById(id));
		
	}

	public ClientDTO selectRow(long id) 
	{
		return ClientdefDAO.findById(id);
	}

	public List<ClientDTO> selectAllRows() {
		List<ClientDTO> findAll = ClientdefDAO.findAll();
		List<ClientDTO> result = new ArrayList<ClientDTO>();
		for (ClientDTO  ObjdefDTO  : findAll) {
			result.add(new ClientDTO(ObjdefDTO));
		}
		return result;
	}

	public ClientDTO getClientById(long idcard) {
		// TODO Auto-generated method stub
		return ClientdefDAO.getclient(idcard);
	}

	public List<ClientDTO> getClientBySalary(String continent) {
		// TODO Auto-generated method stub
		return ClientdefDAO.getClientBySalary(continent);
	}
 
}

