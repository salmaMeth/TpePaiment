package ecr.web.app.server.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ecr.web.app.client.services.UsersService;
import ecr.web.app.server.dao.UserDAO;
import ecr.web.app.shared.FieldVerifier;
import ecr.web.app.shared.dto.TerminalDTO;
import ecr.web.app.shared.dto.UsersDTO;



/**
 * The server side implementation of the RPC service.
 */
@Service("User_defService")
public class UsersIServiceImp extends RemoteServiceServlet implements UsersService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(UsersIServiceImp.class);

	@Autowired
	private UserDAO _User_defDAO;
	

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(UsersDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO .getId() == null) {
				_User_defDAO.persist(_Obj_defDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(UsersDTO _Obj_defDTO) throws Exception {

		
		try {
			if (_Obj_defDTO .getId() != null) {
				_User_defDAO.merge(_Obj_defDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
			_User_defDAO.remove(_User_defDAO.findById(id));
		
	}

	public UsersDTO selectRow(long id) 
	{
		return _User_defDAO.findById(id);
	}

	public List<UsersDTO> selectAllRows() {
		List<UsersDTO> findAll = _User_defDAO.findAll();
		List<UsersDTO> result = new ArrayList<UsersDTO>();
		for (UsersDTO  _Obj_defDTO  : findAll) {
			result.add(new UsersDTO(_Obj_defDTO));
		}
		return result;
	}

	public UsersDTO getUserByIDPASS(String login, String password) {
		// TODO Auto-generated method stub
		return _User_defDAO.getuserbyloginpass(login, password);
	}

	public void deleteuser(Long id) {
		// TODO Auto-generated method stub
		_User_defDAO.deleteuser(id);
	}

	public UsersDTO selectRowbymail(String mail) throws Exception {
		// TODO Auto-generated method stub
		return _User_defDAO.selectRowbymail(mail);
	}
	
 
}

