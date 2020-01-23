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
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.genRandnum());
            c.setSuit(Card.SUITS[c.genRandsuit()]);    
            // Store each card object into the magicHand array
            magicHand[i] = c;
            // Print each magic hand to the screen.
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value from 1 to 13:");
        int value = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a suit (Diamonds, Clubs, Spades and Hearts:");
        String suit = sc.nextLine();
        boolean flag = false;
        for (int j = 0; j < magicHand.length; j++){
            if (magicHand[j].getValue() == value && 
                    magicHand[j].getSuit().equalsIgnoreCase(suit)){
                flag = true;
            }
        }
        if (flag) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
    }
    
}
