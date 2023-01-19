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
  * This source file cotains my Card Class
  * The function of the class is to create a card from constructors
  * It pulls from String arrays that hold the values for a card's suit and rank
  */

import java.util.Random;

public class card{

  private String card_suit;
  private String card_value;


  private String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  private String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};

  /**
    * Default constructor setting the card suit to null and card value to null
    */
  public card(){
    card_suit = "null";
    card_value = "null";
  }

  /**
    * constructor setting the card value and card suit
    */
  public card(int suit, int rank){

    this.card_value = values[rank];
    this.card_suit = suits[suit];
  }

  /**
    * getValue()
    * @return String representing a card's value
    */
  public String getValue(){
    return card_value;
  }

  /**
    * getSuit()
    * @return String representing a card's suit
    */
  public String getSuit(){
    return card_suit;
  }

  /**
    * returnCard()
    * @param integer for card suit and integer for card rank
    * @return none
    */

  public void returnCard(int suit, int rank){
    card card = new card(suit, rank);
    String rank_word = card.getValue();
    String suit_word = card.getSuit();
    System.out.println(suit_word + " " + rank_word);
  }

  

}
