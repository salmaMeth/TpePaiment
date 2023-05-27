package ecr.web.app.server.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.TerminalDTO;

@Repository("Obj_Terminal")
public class TerminalDAO extends  AbstractDAOMethods <Long, TerminalDTO>{
	
	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}


}
