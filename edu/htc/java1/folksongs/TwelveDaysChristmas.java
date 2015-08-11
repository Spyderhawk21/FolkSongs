package edu.htc.java1.folksongs;

	public class TwelveDaysChristmas {

		private static String title= "The Twelve Stages of Randomness";
		
			String[] days = {"first ", "second ", "third ", "fourth ", "fifth ", "sixth ", "seventh ", "eighth ", "ninth ", "tenth ", "eleventh ", "twelfth "};
			String[] gifts= {"A Power Ranger Fighting a Monster Named Suzy\n", "Two Ninja Turtle Dolls", "Three Elderly 'Friends' ", "Four Calling Telemarketers", "Five Golden Girls (The Later Years)", "Six Sloths A Slothing", "Seven Seas For A Sailing", "Eight Maids in Manhattan", "Nine Brazilians Azonto-ing", "Ten Lords of Time", "Eleven Flautists Fluting", "Twelve Random Items"};

		public void writelyrics() {
			
			StringBuilder line = new StringBuilder ();
			
			for (int change = 0; change<12; change++) {
				String lyrics1= "For the " + days[change] + "stage of Randomness my true love gave to me" + "\n" + gifts[change] + "\n";
				line.append(lyrics1);
				if (change >= 1) {
					gifts[0] = "And A Partridge in a Pear Tree\n";
				}
				for (int newchange = change -1; newchange >= 0; newchange--) {
					String lyrics2= gifts[newchange] + "\n";
					line.append(lyrics2);
			}
					
		}	

			System.out.println(line.toString());
		}	
		public static String getTitle() {
			return title;

	}
}

