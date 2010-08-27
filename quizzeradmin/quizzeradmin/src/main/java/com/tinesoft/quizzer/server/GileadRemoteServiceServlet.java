package com.tinesoft.quizzer.server;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.sf.gilead.core.PersistentBeanManager;
import net.sf.gilead.core.hibernate.HibernateUtil;
import net.sf.gilead.core.serialization.GwtProxySerialization;
import net.sf.gilead.core.store.stateless.StatelessProxyStore;
import net.sf.gilead.gwt.PersistentRemoteService;

/**
 * <p>
 * This class serves as base class for all GWT services that need Gilead support
 * to facilitate the data persistence with all the frameworks managed by Gilead
 * ( like Hibernate for example).
 * </p>
 * 
 * @author kondo tine
 * 
 */
public class GileadRemoteServiceServlet extends PersistentRemoteService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GileadRemoteServiceServlet() {
		//creating gilead hibernate util
		HibernateUtil gileadHibernateUtil = new HibernateUtil();

		//creating hibernate session factory
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		//setting gilead hibernate util session factory
		gileadHibernateUtil.setSessionFactory(sessionFactory);

		PersistentBeanManager persistentBeanManager = new PersistentBeanManager();
		persistentBeanManager.setPersistenceUtil(gileadHibernateUtil);
		StatelessProxyStore proxyStore = new StatelessProxyStore();
		proxyStore.setProxySerializer(new GwtProxySerialization());
		persistentBeanManager.setProxyStore(proxyStore);

		setBeanManager(persistentBeanManager);

	}

}
