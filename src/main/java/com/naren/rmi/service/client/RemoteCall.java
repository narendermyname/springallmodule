/**
 * 
 */
package com.naren.rmi.service.client;

import com.naren.rmi.service.RMIRemoteService;

/**
 * @author nstanwar
 *
 */
public class RemoteCall {

	/**
	 * 
	 */
	RMIRemoteService remoteService;
	
	public void setRemoteService(RMIRemoteService remoteService)
	{
		this.remoteService=remoteService;
	}
	
	public RemoteCall() {
		// TODO Auto-generated constructor stub
	}

}
