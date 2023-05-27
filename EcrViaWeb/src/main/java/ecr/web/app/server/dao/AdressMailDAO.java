package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.AdressMailDTO;


@Repository("Obj_AdressMail")
public class AdressMailDAO extends AbstractDAOMethods<Long, AdressMailDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	public List<AdressMailDTO> getMailbyId(long Id_Mail){
		String queryString = "select   entity from  AdressMailDTO entity where entity.Id_Mail=:Id_Mail";
		TypedQuery<AdressMailDTO> query = getEntityManager().createQuery(queryString, AdressMailDTO.class);
		query.setParameter("Id_Mail", Id_Mail);
		  return query.getResultList();
		}
}
