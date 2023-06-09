package cardgames23fripm;
import java.util.Random;
import cardgames23fripm.Card.Value;
import cardgames23fripm.Card.Suit;
public class CardHandGenerator {

	/**
	 * 
	 * @param numCards
	 */
	public static Card[] generateHand(int numCards) {
		// TODO - implement CardHandGenerator.generateHand
		Card[] hand = new Card[numCards];
                Random random = new Random();
                for(int i =0 ;i<hand.length;i++){
                    Value value = Value.values() [random.nextInt(13)];
                    System.out.println(value);

                    Suit suit =Suit.values()[random.nextInt(4)];

                    Card card =new Card(value,suit);
                    hand[i]=card;
                }
                return hand;
                
        }
}
                
