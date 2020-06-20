package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static Configuration cfg;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				sessionFactory = cfg.buildSessionFactory();

			} catch (Exception e) {
				e.printStackTrace();
				if (sessionFactory != null) {
					sessionFactory.close();
				}

			}
		}
		return sessionFactory;

	}

}
