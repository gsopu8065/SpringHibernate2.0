package com.concretepage;
import com.concretepage.dao.PageDaoImpl;
import com.concretepage.persistence.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class SpringDemo {

    public static void main(String... args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
            PageDaoImpl pd=(PageDaoImpl) context.getBean("pageDao");
            pd.saveUser();


    } 
}
 