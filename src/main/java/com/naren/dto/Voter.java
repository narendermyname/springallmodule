/**
 * 
 */
package com.naren.dto;

import java.io.Serializable;

/**
 * @author narender
 *
 */
public class Voter implements Serializable {

	/**
	 * 
	 */
	private long id;
	private String enrolmentTime;
	private String voteRecordedTime;
	private User user;
	private Contestant votedForOption;
	public Voter() {
		// TODO Auto-generated constructor stub
	}

}
