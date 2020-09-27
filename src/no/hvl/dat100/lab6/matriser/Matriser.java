package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for (int x : rad) {
				System.out.println(x + " "); 
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = (" "); 
		for (int[] row : matrise) {
			streng += ("\n"); 
			for (int x : row) {
				streng += (x + " ");
			}
		}
		return streng; 
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
	int nyMatrise[][] = new int [matrise.length][matrise[0].length]; 
	
	for (int i = 0; i < nyMatrise.length; i++) {
		
		for (int j = 0; j < nyMatrise[i].length; j++) {
			
			nyMatrise[i][j] = matrise[i][j] * tall; 
			
		}
	}
	return nyMatrise; 		
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

	if (a == b) {
		return true; 
		}
	else {
		return false; 
	}
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
