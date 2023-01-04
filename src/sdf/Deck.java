package sdf;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Cards> deck;

    public Deck(){
        this.deck = new LinkedList<>();
        for (int i = 0; i < Constants.SUIT.length; i++) {
            String suit = Constants.SUIT[i];
            for (int j = 0; j < Constants.VALUES.length; j++) {
                Integer value = Constants.VALUES[j];
                String name =Constants.NAMES[j];
                Cards card = new Cards(suit, name, value);
                deck.add(card);

            }
        }
        
    }

    public void shuffle(){

        Random rand = new SecureRandom();

        for (int curr = 0; curr < deck.size(); curr++) {

            int toSwap = rand.nextInt(deck.size());

            Cards c = deck.get(curr);
            Cards d=  deck.get(toSwap);
            deck.set(curr, d);
            deck.set(toSwap,c);
            
        }
  

    }

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }
    
}
