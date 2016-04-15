/**
 * 
 */
package com.naren.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author narender
 *
 */
public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1948391342929114071L;
	
	private Long id;
	
	/**
	 * event name
	 */
	private String name;
	/**
	 * start time
	 */
	private String startTime;
	/**
	 * end time
	 */
	private Long timeZoneOffset;
	/**
	 * event duration in hours
	 */
	private String votingDuration;
	private String lastUpdateTime;
	private Location location;
	private List<Voter> voters;
	private List<Contestant> options;
	private String status;
	public Event() {
		// TODO Auto-generated constructor stub
	}

	
}
