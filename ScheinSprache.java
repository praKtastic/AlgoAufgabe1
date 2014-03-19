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
		//erzeugt Scheinsprache mit n Wörtern (Satzzeichen mitgezählt)
		return null;
	}

	public int anzahlMoeglicherNachfolger(String wort)
	{
		//berechnet die Anzahl von möglichen Nachfolgern eines Wortes. Doppelt vorkommende Paare werden auch doppelt gezählt.
		return 0;
	}
	
	public String zufaelligerNachfolger(String wort)
	{
		//liefert zufällig einen der möglichen Nachfolger eines Wortes.
		return null;
	}
}
