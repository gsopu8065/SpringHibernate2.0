package com.concretepage.dao;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.concretepage.persistence.User;
import org.springframework.transaction.annotation.Transactional;

public class PageDaoImpl  {


    private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {

        this.hibernateTemplate = hibernateTemplate;
	}


	public void saveUser(){
        User u1= new User(101,"tim");
        hibernateTemplate.save(u1);
    }
}   