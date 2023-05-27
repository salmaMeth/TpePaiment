package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;

import ecr.web.app.shared.dto.TVADTO;


@Repository("Obj_TVA")
public class TVADAO extends AbstractDAOMethods<Long, TVADTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
