package com.concretepage;
import com.concretepage.persistence.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.concretepage.dao.PageDao;
public class SpringDemo {
    public static void main(String... args) {
            /*ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
            PageDao pd=(PageDao) context.getBean("pageDao");
            pd.persist();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");

        //step2: create session
        Session session = sessionFactory.openSession();

        //step3: create transaction
        Transaction transaction = session.beginTransaction();

        //step4: update operation
        User user = new User();
        user.setId(1);
        user.setName("jack");

        session.save(user);

        //step5: commit transaction
        transaction.commit();

        //step6: close session and sessionFactory
        session.close();
        sessionFactory.close();

    } 
}
 