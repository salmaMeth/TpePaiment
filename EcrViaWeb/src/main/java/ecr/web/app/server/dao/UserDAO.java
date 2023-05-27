package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.ProductsDTO;
import ecr.web.app.shared.dto.UsersDTO;

@Repository("Obj_User")
public class UserDAO extends AbstractDAOMethods<Long, UsersDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	public UsersDTO getuserbyloginpass(String login,String password){
		String queryString = "select entity from  UsersDTO entity where entity.login=:login and entity.password=:password";
		TypedQuery<UsersDTO> query = getEntityManager().createQuery(queryString, UsersDTO.class);
		query.setParameter("login", login);
		query.setParameter("password", password);
		return query.getSingleResult();
		
	}
	public void deleteuser(Long id){
	 String queryString = "DELETE  from  UsersDTO entity where entity.id=id";
		TypedQuery<UsersDTO> query = getEntityManager().createQuery(queryString, UsersDTO.class);
		query.setParameter("id",id);
		query.executeUpdate();
		
	}
	public UsersDTO selectRowbymail(String mail) {
		// TODO Auto-generated method stub
		String queryString = "select entity from  UsersDTO entity where entity.mail=:mail";
		TypedQuery<UsersDTO> query = getEntityManager().createQuery(queryString, UsersDTO.class);
		query.setParameter("mail", mail);
		return query.getSingleResult();
			}
}
