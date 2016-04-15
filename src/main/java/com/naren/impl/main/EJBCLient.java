/**
 * 
 */
package com.naren.impl.main;

import javax.naming.Context;
import javax.naming.NamingException;

import com.naren.ejb.RunEJBBean;
import com.naren.ejb.RunEJBRemote;
import com.naren.util.EJBUtil;

/**
 * @author nstanwar
 *
 */
public class EJBCLient {

	public static void main(String[] args) {
        RunEJBRemote bean = doLookup();
        System.out.println(bean.sayHello()); // 4. Call business logic
    }
 
    private static RunEJBRemote doLookup() {
        Context context = null;
        RunEJBRemote bean = null;
        try {
            // 1. Obtaining Context
            context = EJBUtil.getInitialContext();
            // 2. Generate JNDI Lookup name
            String lookupName = "java:global/nstejb/RunEJBBean!com.naren.ejb.RunEJBRemote";//getLookupName();
            // 3. Lookup and cast
            bean = (RunEJBRemote) context.lookup(lookupName);
 
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return bean;
    }
 
    private static String getLookupName() {
/*
The app name is the EAR name of the deployed EJB without .ear suffix.
Since we haven't deployed the application as a .ear,
the app name for us will be an empty string
*/
        String appName = "";
 
        /* The module name is the JAR name of the deployed EJB
        without the .jar suffix.
        */
        String moduleName = "nstejb";
 
/*AS7 allows each deployment to have an (optional) distinct name.
This can be an empty string if distinct name is not specified.
*/
        String distinctName = "";
 
        // The EJB bean implementation class name
        String beanName = RunEJBBean.class.getSimpleName();
 
        // Fully qualified remote interface name
        final String interfaceName = RunEJBRemote.class.getName();
 
        // Create a look up string name
        String name = "ejb:" + appName + "/" + moduleName + "/" +
            distinctName    + "/" + beanName + "!" + interfaceName;
 
        return name;
    }
}
