/**
 * 
 */
package com.naren.rmi.service.impl;

import com.naren.rmi.service.RMIRemoteService;

/**
 * @author nstanwar
 *
 */
public class RMIRemoteServiceImpl implements RMIRemoteService {

	/**
	 * 
	 */
	public RMIRemoteServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.naren.rmi.service.RMIRemoteService#add(int x,int y)
	 */
	public int add(int x,int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

}
