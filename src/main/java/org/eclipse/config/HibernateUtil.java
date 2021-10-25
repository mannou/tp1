package org.eclipse.config;

import java.io.File;

import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static  SessionFactory sessionFactory; 
public static SessionFactory getSessionFactory() {

Configuration configuration = new Configuration().configure(new File("E:\\iset-cours\\soa\\2020\\tp3\\workspace10\\tp-jersey\\src\\main\\webapp\\WEB-INF\\hibernate.cfg.xml"));
return configuration.buildSessionFactory();

}
}
