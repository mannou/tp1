package org.eclipse.resource;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import org.eclipse.config.HibernateUtil;
import org.eclipse.dao.PersonneDao;
import org.eclipse.model.Personne;
import org.hibernate.Session;

@Path("personnes")
public class PersonneResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Personne> getPersonnes() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		PersonneDao personneDao = new PersonneDao(session);
		return personneDao.findAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Personne getPersonne(@PathParam(value = "id") int num) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		PersonneDao personneDao = new PersonneDao(session);
		return personneDao.findById(num);
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Personne addPersonne(Personne p) {
		Integer key=0;
		Session session = HibernateUtil.getSessionFactory().openSession();
		PersonneDao personneDao = new PersonneDao(session);
		try {
			key = personneDao.save(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.setNum(key);
	return p;
	}

}