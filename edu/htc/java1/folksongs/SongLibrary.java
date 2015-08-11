package edu.htc.java1.folksongs;

public class SongLibrary {


	public static void main(String args[]) {
		BeerSong beerSong = new BeerSong();
		AntsGoMarching antsgoMarching= new AntsGoMarching();
		Bingo bingo= new Bingo();
		TwelveDaysChristmas twelvedays= new TwelveDaysChristmas();
		if (args.length != 1) {
			System.out.println("You must provide a Song Number:");
			System.out.println(" S1 - " + BeerSong.getTitle());
			System.out.println(" S2 - " + AntsGoMarching.getTitle());
			System.out.println(" S3 - " + Bingo.getTitle());
			System.out.println(" S4 - " + TwelveDaysChristmas.getTitle());
		
		}else{
			
			String selection = args[0];
			switch (selection) {
			case "S1": 
				beerSong.writelyrics();
				break;
			case "S2":
				antsgoMarching.writelyrics();
				break;
			case "S3":
				bingo.writelyrics();
				break;
			case "S4":
				twelvedays.writelyrics();
				break;
			default:
				System.out.println("You have selected an invalid song number.");
			}

		}
	}
	
}