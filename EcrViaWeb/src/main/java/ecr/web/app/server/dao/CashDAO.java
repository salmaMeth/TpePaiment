package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.CashDTO;
import ecr.web.app.shared.dto.RetournDataDTO;


@Repository("Obj_cash")
public class CashDAO extends AbstractDAOMethods<Long, CashDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	public List<CashDTO> getCaissebycode(long id_caisse){
		String queryString = "select   entity from  CashDTO entity where entity.id_caisse=:id_caisse";
		TypedQuery<CashDTO> query = getEntityManager().createQuery(queryString, CashDTO.class);
		query.setParameter("id_caisse", id_caisse);
		  return query.getResultList();
		}
	public List<CashDTO> distinct(){
		 Query queryString1 = getEntityManager().createQuery ("select DISTINCT(entity.id_caisse ) from CashDTO entity");
		 Number resultTsum = (Number) queryString1.getSingleResult ();

		String queryString ="select entity from CashDTO entity where entity.id_caisse="+resultTsum;
		TypedQuery<CashDTO> query = getEntityManager().createQuery(queryString, CashDTO.class);
		  return query.getResultList();
		}
	public   Long  GetAvg(long id_caisse) {
		// TODO Auto-generated method stub
		 Query q1 = getEntityManager().createQuery ("select  SUM(entity.amount) from  CashDTO entity");
		 Query q = getEntityManager().createQuery ("select sum(entity.amount)/"+(Long) q1.getSingleResult ()+"*100 from  CashDTO entity where entity.id_caisse=:id_caisse");
		    q.setParameter("id_caisse", id_caisse);
 
		return (Long) q.getSingleResult ();

	}
	public List<?> distinctCach(){
		 Query queryString = getEntityManager().createQuery ("select DISTINCT(entity.id_caisse ) from CashDTO entity");
		 
		 return  queryString.getResultList();

		}
	public List<CashDTO> distinctRegister(){
		String queryString ="select DISTINCT entity from CashDTO entity";
		TypedQuery<CashDTO> query = getEntityManager().createQuery(queryString, CashDTO.class);
		  return query.getResultList();
		}
}
