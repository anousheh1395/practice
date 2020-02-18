/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        Card[] magicHand = new Card[7];
    
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           c.setValue(c. randomValue());
           c.setSuit(c.SUITS[c.randomSuit()]);

        }
        
        
        
        System.out.println("Please enter a v and s:");
        String s=scan.next();
       // System.out.println("Please enter a value:");
       //int v=scan.nextInt();
        Card c = new Card();
        
    if(s.equals(c.getSuit())){
        System.out.println("Not Approved!");
   }
   else
    {
         System.out.println("Approved!");
     }
}
    }
