package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		int[] tabell1 = { 1, 4, 6 };
		
		for (int i = 0; i > tabell1.length; i++) {
			
			System.out.println(tabell1[i]); 
			
			}
	
	}

	// b)
	public static String tilStreng(int[] tabell) {

	String streng = "[";
	
	for (int i = 0; i < tabell.length; i++) {
		
		if (i != tabell.length-1) {
			
			streng += (tabell[i] + ",");
			
		} else {
			streng += (tabell[i]); 
		}
	
	}
	streng += ("]");
	
	return streng; 
		
	}

	// c)
	//public static int summer(int[] tabell) {

		//for (int i:tabell) {
			//System.out.println(i)
			
		//	String[] tabell = {1,4,6}; 
		//	for (String i: tabell)
			//	System.out.println(i); 
			
	


	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
