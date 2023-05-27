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

import ecr.web.app.client.services.OptionService;
import ecr.web.app.server.dao.OptionDAO;
import ecr.web.app.shared.dto.OptionDTO;

/**
 * The server side implementation of the RPC service.
 */
@Service("OptionService")
public class OptionServiceImpl extends RemoteServiceServlet implements  OptionService 
{
private static final long serialVersionUID = 1L;	
private static final Log LOG = LogFactory.getLog(OptionServiceImpl.class);

	@Autowired
	private OptionDAO optionDAO;


@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insertRow(OptionDTO optionDTO) throws Exception {

		
		try {
			if (optionDTO .getId() == null) {
				optionDAO.persist(optionDTO );
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateRow(OptionDTO optionDTO) throws Exception {

		
		try {
			if (optionDTO .getId() != null) {
				optionDAO.merge(optionDTO);
			}
		} catch (Exception e) {
			LOG.error(e);
			throw e;
		}
	}


		@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteRow(long id) throws Exception {
		
			optionDAO.remove(optionDAO.findById(id));
		
	}

	public OptionDTO selectRow(long id) 
	{
		return optionDAO.findById(id);
	}

	public List<OptionDTO> selectAllRows() {
		List<OptionDTO> findAll = optionDAO.findAll();
		List<OptionDTO> result = new ArrayList<OptionDTO>();
		for (OptionDTO  _Obj_defDTO  : findAll) {
			result.add(new OptionDTO(_Obj_defDTO));
		}
		return result;
	}

	public void deleteOption() throws Exception {
		optionDAO.deleteOption();
		
	}


	
 
}

