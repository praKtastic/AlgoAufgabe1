package de.ostfalia.algodat.ss14;

public class ScheinSprache
{
	/*Erstellen Sie eine Klasse mit Namen de.ostfalia.algodat.ss14.ScheinSprache,
	die im Konstruktor einen Dateinamen (String) als Argument bekommt. Diese Klasse soll im
	Konstruktor die Datenstruktur erstellen. Weitere Hilfsklassen sind erlaubt und sollten im
	selben Paket liege*/
	
	private String dateiname;
	
	public ScheinSprache (String name)
	{
		dateiname = name;
	}
	
	public String erzeuge(int n)
	{
		//erzeugt Scheinsprache mit n W�rtern (Satzzeichen mitgez�hlt)
		return null;
	}

	public int anzahlMoeglicherNachfolger(String wort)
	{
		//berechnet die Anzahl von m�glichen Nachfolgern eines Wortes. Doppelt vorkommende Paare werden auch doppelt gez�hlt.
		return 0;
	}
	
	public String zufaelligerNachfolger(String wort)
	{
		//liefert zuf�llig einen der m�glichen Nachfolger eines Wortes.
		return null;
	}
}
