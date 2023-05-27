package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;

import ecr.web.app.shared.dto.DiscountsDTO;


@Repository("Obj_DISCOUNTS")
public class DicountDAO extends AbstractDAOMethods<Long, DiscountsDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
