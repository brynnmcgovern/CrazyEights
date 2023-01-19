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
  * This source file cotains my player Class
  * The function of the class is to create a hand for a player, and holds a method
  * for a single turn for a player
  */

import java.util.Random;
import java.util.LinkedList;

public class player{

  private int player_ID;
  private deck deck_cards = new deck (52);

  public LinkedList <card> hand = new LinkedList<card> ();
  Random rand = new Random();
  private card top_card;
  private card eight_spades;
  private card eight_clubs;
  private card eight_hearts;
  private card eight_diamonds;
  private int total_points;
  private int number_eights;






  /**
    * constructor initializing the player id and initializing the player's hand
    * initializes the eights cards and the top card
    */
  public player(int id){
    this.player_ID = id;

    for(int i = 0; i < 5; ++i){
      int num = rand.nextInt(51);


      card card = deck_cards.getIndex(num);
      hand.add(card);
    }
      eight_spades = new card(0, 7);
      eight_diamonds = new card(1, 7);
      eight_hearts = new card (2, 7);
      eight_clubs = new card (3, 7);
      top_card = deck_cards.getIndex(0);
      deck_cards.removeIndex(0);

  }

  /**
    * getID()
    * @return integer representing player's ID
    */
  public int getID(){

    return player_ID;
  }

  /**
    * findCard()
    * @return integer representing the total points earned by a player
    */
  public int findCard(){
    for(int i = 0; i < hand.size(); ++i){
      card card = hand.get(i);
      if(card.getValue() == "8"){
        total_points+= 50;
      }
      else if(card.getValue() == "King" || card.getValue() == "Queen" || card.getValue() == "Jack"){
        total_points += 10;
      }
      else if(card.getValue() == "Ace"){
        total_points += 1;
      }
      else {
        int num = Integer.valueOf(card.getValue());
        total_points += num;
      }
    }
    return total_points;

  }


  /**
    * newSuit()
    * @return card suit that is randomly chosen after an eight is played
    */
  public card newSuit(){

    number_eights += 1;
    if(top_card == eight_clubs){
      for(int i = 0; i < 4; ++i){
        card new_card = new card(i, 7);
        top_card = new_card;

      }
      return top_card;
      /** return new suit */
      //this will take returned card from first method
    }
    else if(top_card == eight_diamonds){
      for(int i = 0; i < 4; ++i){
        card new_card = new card(i, 7);
        top_card = new_card;

      }
      return top_card;
      /** return new suit */
      //this will take returned card from first method
    }
    else if(top_card == eight_hearts){
      for(int i = 0; i < 4; ++i){
        card new_card = new card(i, 7);
        top_card = new_card;

      }
      return top_card;
      /** return new suit */
      //this will take returned card from first method
    }
    else if(top_card == eight_spades){
      for(int i = 0; i < 4; ++i){
        card new_card = new card(i, 7);
        top_card = new_card;

      }
      return top_card;
      /** return new suit */
      //this will take returned card from first method
    }
    else{
      return null;
    }


  }

  /**
    * takeTurn()
    * @return card that is now the top card to play off of
    */
  public card takeTurn(){
    int deck_size = deck_cards.getDeckSize();
    for(int i = 0; i < hand.size(); ++i){
      card card = hand.get(i);
      if((card.getSuit() == top_card.getSuit()) || (card.getValue() == top_card.getValue())) {
        hand.remove(i);
        top_card = card;
        break;
      }


      if((card.getSuit() != top_card.getSuit()) && (card.getValue() != top_card.getValue())){
        for(int j = 0; j < deck_cards.getDeckSize(); ++j){

          int num = rand.nextInt(deck_cards.getDeckSize());
          card new_card = deck_cards.getIndex(num);
          deck_cards.removeIndex(num);

          if((new_card.getSuit() == top_card.getSuit()) && (new_card.getValue() == top_card.getValue()) || (j == 0)) {

            top_card = new_card;

            break;
          }


        }
      }
    }
  return top_card;
  }

  /**
    * returnNumberEights()
    * @return integer representing the number of eights
    */
  public int returnNumberEights(){
    return number_eights;
  }

  /**
    * returnHand()
    * @return LinkedList of the player's hand
    */
  public LinkedList <card> returnHand(){
      return hand;
  }

  /**
    * handSize()
    * @return integer of the hand's size
    */
  public int handSize(){
    return hand.size();
  }

  /**
    * deckSize()
    * @return integer representing the draw pile's size
    */
  public int deckSize(){
    return deck_cards.getDeckSize();
  }



}
