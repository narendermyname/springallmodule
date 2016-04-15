/**
 * 
 */
package com.naren.dto;

/**
 * @author nstanwar
 *
 */
public class SpellChecker {

	/**
	 * 
	 */
	private String language;
	private String grammer;
	public SpellChecker() {
		// TODO Auto-generated constructor stub
	}

	public void setLanguage(String language)
	{
		this.language=language;
	}
	
	public void setGrammer(String grammer)
	{
		this.grammer=grammer;
	}
	public void spellingCheck(){
		System.out.println("SpellingCheck L "+language+" G "+grammer);
	}
}
