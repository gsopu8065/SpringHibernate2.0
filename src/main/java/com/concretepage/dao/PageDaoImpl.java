package com.concretepage.dao;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.concretepage.persistence.User;
public class PageDaoImpl implements PageDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void persist(){
        User u1= new User(1,"Ankita");
        hibernateTemplate.save(u1);
        
        User u2= new User(2,"Renu");
        hibernateTemplate.save(u2);  
    }
}   