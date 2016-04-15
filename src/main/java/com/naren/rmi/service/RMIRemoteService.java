/**
 * 
 */
package com.naren.rmi.service;

import java.rmi.Remote;

/**
 * @author nstanwar
 *
 */
public interface RMIRemoteService extends Remote {
	
	public int add(int x,int y);
}
