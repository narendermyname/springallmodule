/**
 * 
 */
package com.naren.dto;

/**
 * @author nstanwar
 *
 */
public class TextEditor {

	/**
	 * 
	 */
	private String author;
	private int age;
	private SpellChecker spellCheckObj;
	public TextEditor(){}
	/**
	 * @param author
	 * @param age
	 */
	public TextEditor(String author ,int age,SpellChecker spellCheckObj) {
		this.author=author;
		this.age=age;
		this.spellCheckObj=spellCheckObj;
	}
	/**
	 * @param spellCheckObj the spellCheckObj to set
	 *//*
	public void setSpellCheckObj(SpellChecker spellCheckObj) {
		this.spellCheckObj = spellCheckObj;
	}*/

	public void checkSpell()
	{
		spellCheckObj.spellingCheck();
		System.out.println("Author "+author+" Age "+age);
	}
}
