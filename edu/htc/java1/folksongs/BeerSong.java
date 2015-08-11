package edu.htc.java1.folksongs;

public class BeerSong {
	
	private static String title= "99 Bottles of Beer";

	public void writelyrics() {
		int count = 99;
		String word = "bottles";
		        
		while (count > 0) {
			System.out.println (count + " " + word + " of beer on the wall.");
		    System.out.println (count + " " + word + " of beer!");
		    System.out.println ("Take one down. Pass it around.");
		    count = count - 1;
		    
		    if (count == 1) {
		    	word = "bottle";
		    }
		    
		    if (count > 0) {
			System.out.println(count + " " + word + " of beer on the wall.");
		    }else{
			System.out.println("No More Bottles of Beer on the Wall.");
		    }
		    System.out.println();
		}	
	}
	
	public static String getTitle() {
		return title;
	}
}	

