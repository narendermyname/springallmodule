/**
 * 
 */
package com.naren.util;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author nstanwar
 *
 */
public class EJBUtil {

	/**
	 * 
	 */
	public EJBUtil() {
		// TODO Auto-generated constructor stub
	}
	private static Context initialContext;
	 
    private static final String PKG_INTERFACES = "org.jboss.ejb.client.naming";
 
    public static Context getInitialContext() throws NamingException {
        if (initialContext == null) {
            Properties properties = new Properties();
            properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
 
            initialContext = new InitialContext(properties);
        }
        return initialContext;
    }

}
