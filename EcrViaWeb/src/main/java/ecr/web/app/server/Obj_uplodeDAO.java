package ecr.web.app.server;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ecr.web.app.shared.dto.uplodeDTO;



@Repository("Obj_uplode")
public class Obj_uplodeDAO extends AbstractDAOMethods<Long,uplodeDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	}