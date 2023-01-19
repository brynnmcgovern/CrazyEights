/**
  * Brynn McGovern
  * 2370579
  * bmcgovern@chapman.edu
  * CPSC 231-04
  * MP3: Crazy Eights
  *
  * @author Brynn McGovern
  * @version 1.0
  *
  * This source file cotains my Deck Class
  * The function of the class is to create a deck using objects from the card class
  * It uses method deal to create a deck of cards
  */

import java.util.Random;
import java.util.LinkedList;

public class deck{

  Random rand = new Random();
  public LinkedList <card> deck_cards = new LinkedList<card>();
  private int size;


  public int getSize(){
    return size;
  }

  public int getDeckSize(){
    return deck_cards.size();

  }

  public card getIndex(int num){
    return deck_cards.get(num);
  }

  public void removeIndex(int num){
    deck_cards.remove(num);
  }

  /**
    * constructor setting the size of the deck, and adding cards to the deck
    */
  public deck(int m_num){
    this.size = m_num;
    deck_cards = new LinkedList <card> ();

      for(int i = 0; i < 4; ++i){
        for(int j = 0; j < 13; ++j){
          card card = new card(i, j);
          deck_cards.add(card);
        }
      }
    }

    /**
      * deal()
      * @return card from deck
      */
  public card deal(){


    int num;
    card card = new card();

    //for(int i = 0; i < 52; ++i){
      num = rand.nextInt(52);
      deck_cards.remove(num);
      card = deck_cards.get(num);
    //}
    return card;


  }
  


}
