/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgames23fripm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ronak
 */
public class CardGameS23FriPM {
	public static void main(String[] args){
            Card[] hand = new Card[7];
            Random random = new Random();
            Scanner input = new Scanner(System.in);
            
            for(int i =0 ;i<hand.length;i++){
                int value = random.nextInt(13)+1;
                System.out.println(value);
                
                String suit =Card.SUITS[random.nextInt(4)];
                
                Card card =new Card(value,suit);
                hand[i]=card;                 
            }//end of for
            
            for(Card card:hand){
                System.out.println(card.getValue()+ " of   " +card.getSuit());
            }
            
            System.out.println("Please choose a suit for your lucky card :");
            
            for(int i=0;i<Card.SUITS.length;i++){
                System.out.println((i+1)+ ":" + Card.SUITS[i]) ;
                
            }
            int suit = input.nextInt();
            System.out.println("Enter a value(1 to 13)");
            int value=input.nextInt();
            
            Card userGuess = new Card(value,Card.SUITS[suit-1]);
            boolean match = false;
            for(Card card:hand){
                if(card.getValue()==userGuess.getValue() &&
                        (card.getSuit().equals(userGuess.getSuit())))
                {
                    match=true;
                    break;
                }
            }
            System.out.println("Did you guess it ?" +match);
        }// end of main
    
}
