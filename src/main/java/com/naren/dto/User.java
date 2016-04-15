/**
 * 
 */
package com.naren.dto;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author narender
 *
 */
@Entity
@Table(name="APP_USER" ,schema="nstanwar")
public class User implements Serializable {

	/**
	 * 
	 */
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	private byte[] portrait;
	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the firstName
	 */
	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	@Id @Column(name="EMAIL")
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	@Column(name="USER_PASSWORD")
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the portrait
	 */
	public byte[] getPortrait() {
		return portrait;
	}
	/**
	 * @param portrait the portrait to set
	 */
	public void setPortrait(byte[] portrait) {
		this.portrait = portrait;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", portrait="
				+ Arrays.toString(portrait) + "]";
	}
	
	
}
