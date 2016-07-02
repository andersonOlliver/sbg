package br.com.bb.intranet.supermt.governo.sbg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("bigBasePU");
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}