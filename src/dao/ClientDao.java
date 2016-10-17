package dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import persistance.Client;

public class ClientDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public void ajouter(Client client)
	{ getHibernateTemplate().save(client); }
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<Client> findClients()
	{ return getHibernateTemplate().find("from Client"); }
	
	public void supprimer(Client client)
	{ getHibernateTemplate().delete(client);
		
	}
	public void modifier(Client client)
	{ getHibernateTemplate().update(client);
		
	}
	

}
