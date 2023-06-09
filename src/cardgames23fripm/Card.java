/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgames23fripm;

/**
 *
 * @author Ronak
 */
public class Card {
    private int value;
	private String suit;
        
        //create an array of possible suits
        public static final String[] SUITS=
        {"Hearts","Diamonds","Spades","Clubs"};
        
        public Card(int value, String suit) {
            this.value = value;
            this.suit = suit;
        }
                
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return this.suit;
	}

	
	public void setSuit(String suit) {
		this.suit = suit;
	}
}
