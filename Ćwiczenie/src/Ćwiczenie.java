
public class Æwiczenie {
	
	public static void main(String[] args) {
	
		
	int deficytMydla = 1;	//Kostki
	int deficytSzamponu = 200;	//Mililitry
	int deficytProszku = 3;		//Kilogramy
	
	int zadanaIloscMydla = 5; 	//Kostki
	int zadanaIloscSzamponu = 500;	 //Mililitry
	int zadanaIloscProszku = 4;	 //Kilogramy
	
	boolean holidays = false; 
	
	if(holidays)
	{
		int iloscszamponu = zadanaIloscSzamponu - deficytSzamponu;
		zadanaIloscSzamponu = zadanaIloscSzamponu / 2;
		deficytSzamponu = zadanaIloscSzamponu - iloscszamponu;
		
		int iloscmydla = zadanaIloscMydla - deficytMydla;
		zadanaIloscMydla = zadanaIloscMydla / 2;
		deficytMydla = zadanaIloscMydla - iloscmydla;
	}
	
	if(deficytProszku == 0) 
	{
		System.out.println("Posiadasz " + zadanaIloscProszku + " kilogramy proszku.");
	}
	else 
	{
		int ilosc = zadanaIloscProszku - deficytProszku;
		System.out.println("Posiadasz " + ilosc + " kilogramy proszku.");
	}
	
	
	if(deficytMydla == 0) 
	{
		System.out.println("Posiadasz " + zadanaIloscMydla + " kostki myd³a.");
	}
	else 
	{
		int ilosc = zadanaIloscMydla - deficytMydla;
		System.out.println("Posiadasz " + ilosc + " kostki myd³a.");
		
	}
	
	if(deficytSzamponu == 0) 
	{
		System.out.println("Posiadasz " + zadanaIloscSzamponu + " mililitrów szamponu.");
	}
	else 
	{
		int ilosc = zadanaIloscSzamponu - deficytSzamponu;
		System.out.println("Posiadasz " + ilosc + " mililitrów szamponu.");
		
	}

}}
