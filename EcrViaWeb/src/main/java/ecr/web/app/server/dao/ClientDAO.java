package ecr.web.app.server.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;



import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.ClientDTO;
import ecr.web.app.shared.dto.UsersDTO;

@Repository("Obj_client")
public class ClientDAO extends AbstractDAOMethods<Long, ClientDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	public ClientDTO getclient(long cardid){
		String queryString = "select entity from  ClientDTO entity where entity.cardid=:cardid";
		TypedQuery<ClientDTO> query = getEntityManager().createQuery(queryString, ClientDTO.class);
		query.setParameter("cardid", cardid);
		return query.getSingleResult();
		
	}
	public List<ClientDTO> getClientBySalary(String continent) {
		// TODO Auto-generated method stub
		String queryString = "SELECT DISTINCT  entity  from ClientDTO entity ORDER BY entity.loyality DESC where entity.continent LIKE continent";
		TypedQuery<ClientDTO> query = getEntityManager().createQuery(queryString, ClientDTO.class);
		return query.getResultList();
	}

}
