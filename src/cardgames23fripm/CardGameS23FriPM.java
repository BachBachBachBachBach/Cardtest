/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgames23fripm;

import java.util.Random;
import java.util.Scanner;

import cardgames23fripm.Card.Value;
import cardgames23fripm.Card.Suit;
import cardgames23fripm.CardHandGenerator;


public class CardGameS23FriPM {
	public static void main(String[] args){
            
            Scanner input = new Scanner(System.in);
            
            Card[] hand = CardHandGenerator.generateHand(7);
            
            
            for(Card card:hand){
                System.out.println(card.getValue()+ " of   " +card.getSuit());
            }
            
            System.out.println("Please choose a suit for your lucky card :");
            
            for(int i=0;i<Card.Suit.values().length;i++){
                System.out.println((i+1)+ ":" + Suit.values()[i]) ;
                
            }
            int suitIndex = input.nextInt();
            System.out.println("Enter a value(1 to 13)");
            int valueIndex=input.nextInt();
            
            Card userGuess = new Card(Value.values()[valueIndex],Suit.values()[suitIndex]);
            boolean match = false;
            for(Card card:hand){
                if(card.getValue()==userGuess.getValue() &&
                        (card.getSuit().equals(userGuess.getSuit())))
                {
                    match=true;
                    break;
                }
            }
            System.out.println("Did you guess it?" +match);
        }// end of main
    
}
