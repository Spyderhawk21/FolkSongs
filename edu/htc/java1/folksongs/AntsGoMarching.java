package edu.htc.java1.folksongs;

public class AntsGoMarching {
   
    private static String title= "The Ants Go Marching";
       
        String[] verses= {"The little one stops to suck his thumb ", "The little one stops to tie his shoe ", "The little one stops to climb a tree ", "The little one stops to shut the door "};
        String[] antnum= {"1 by 1, ","2 by 2, ","3 by 3, ","4 by 4, "};
        
       
    public void writelyrics() {
   
        StringBuilder adverse= new StringBuilder ();

        for (int round = 0; round<4; round++) {
        	String line= "The ants go marching " + antnum[round] + "Hurrah! Hurrah!\n";
            String line2= "The ants go marching " + antnum[round] + verses[round] + "\nand they all went marching down to the ground to get out of the rain.\nBoom! Boom! Boom!\n\n";
            
            adverse.append(line).append(line).append(line2);
        }
        System.out.println(adverse.toString());
    }
    public static String getTitle() {
        return title;   
   
    }
}