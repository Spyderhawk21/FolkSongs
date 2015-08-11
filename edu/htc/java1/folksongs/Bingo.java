package edu.htc.java1.folksongs;

public class Bingo {
	
	private static String title= "B-I-N-G-O";	

	String[] bingo ={"B", "I", "N", "G", "O"};
	String[] stars= { "*****", "****", "***", "**", "*"};
	String newDog= "BINGO";
	
	
	public void writelyrics() {
		
		StringBuilder bingone= new StringBuilder();
		
		for ( int verse= 0 ; verse<6; verse++) {
			String line1= "There was a Farmer who had a Dog and" + newDog + "was his Name-o.\n";
			String line2= "and Bingo was his Name-o.\n\n";
			bingone.append(line1);
			
		
			for (int repeat= 0; repeat < 3; repeat++) {
			
				for (int bingnum= 0; bingnum < 5; bingnum++) {
				bingone.append(bingo[bingnum]);

				}
			bingone.append("\n");
			}	
		bingone.append(line2);
		}
		System.out.println (bingone.toString());
		

	}		
	public static String getTitle() {
		return title;
	}
}
