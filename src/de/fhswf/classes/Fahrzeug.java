/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fhswf.classes;

/**
 * Klasse zur Darstellung eines Fahrzeugs
 * @author Dark
 */
public class Fahrzeug {
        /* Variablen mit Daten des Fahrzeugs */
	private String _kennzeichen;
	private String _erstzulassung;
        
	public String getKennzeichen()
	{
		return _kennzeichen;
	}

	public void setKennzeichen(String aKennzeichen)
	{
		_kennzeichen = aKennzeichen;
	}
        
	public String getErstzulassung()
	{
		return _erstzulassung;
	}

	public void setErstzulassung(String aErstzulassung)
	{
		_erstzulassung = aErstzulassung;
	}
         
        /* Constructor */
	public Fahrzeug(String aKennzeichen, String aErstzulassung)
	{
		_kennzeichen = aKennzeichen;
		_erstzulassung = aErstzulassung;
	}
}
