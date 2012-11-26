package de.fhswf.classes;

/**
 * Klasse zur Darstellung eines Fahrers
 * @author Dark
 */
public class Fahrer {
        /* Variablen mit Daten des Fahrers */
	private String _name;
	private String _fuehrerscheinklasse;
	private String _feuhrerscheinSeit;
	private String _fahrzeug1;
	private String _fahrzeug2;
	private String _fahrzeug3;
        
	public String getName()
	{
		return _name;
	}

	public void setName(String aName)
	{
		_name = aName;
	}
        
	public String getFuehrerscheinklasse()
	{
		return _fuehrerscheinklasse;
	}

	public void setFuehrerscheinklasse(String aFuehrerscheinklasse)
	{
		_fuehrerscheinklasse = aFuehrerscheinklasse;
	}
        
	public String getFeuhrerscheinSeit()
	{
		return _feuhrerscheinSeit;
	}

	public void setFeuhrerscheinSeit(String aFeuhrerscheinSeit)
	{
		_feuhrerscheinSeit = aFeuhrerscheinSeit;
	}
        
	public String getFahrzeug1()
	{
		return _fahrzeug1;
	}

	public void setFahrzeug1(String aFahrzeug1)
	{
		_fahrzeug1 = aFahrzeug1;
	}
        
	public String getFahrzeug2()
	{
		return _fahrzeug2;
	}

	public void setFahrzeug2(String aFahrzeug2)
	{
		_fahrzeug2 = aFahrzeug2;
	}
        
	public String getFahrzeug3()
	{
		return _fahrzeug3;
	}

	public void setFahrzeug3(String aFahrzeug3)
	{
		_fahrzeug3 = aFahrzeug3;
	}
         
        /* Constructor */
	public Fahrer(String aName, String aFuehrerscheinklasse, String aFeuhrerscheinSeit, String aFahrzeug1, String aFahrzeug2, String aFahrzeug3)
	{
		_name = aName;
		_fuehrerscheinklasse = aFuehrerscheinklasse;
		_feuhrerscheinSeit = aFeuhrerscheinSeit;
		_fahrzeug1 = aFahrzeug1;
		_fahrzeug2 = aFahrzeug2;
		_fahrzeug3 = aFahrzeug3;
	}
}
