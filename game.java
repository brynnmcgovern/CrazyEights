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
  * This source file cotains my Game Class
  * The function of the class is to carry out a game of crazy eights, and
  * record all the statistics from a game
  * It uses objects from the previous three classes to carry out the game
  */

import java.util.LinkedList;


public class game{


  private deck deck;
  private player player1;
  private player player2;
  private int player1_wins;
  private int player2_wins;
  private int player1_points;
  private int player2_points;
  private int losing_cards;
  private int pile_empty;
  private int number_eights;


  /**
    * Default constructor setting the deck size to 52 and initializing two new player objects
    *initializes the variable number_eights to collect the returned total of both players used eights
    */
  public game(){
    deck = new deck(52);


    player1 = new player(1);
    player2 = new player(2);


    number_eights += player1.returnNumberEights();
    number_eights += player2.returnNumberEights();



  }

  /**
    * play()
    * no return
    * plays through the rules of crazy eights and keeps track of the statistics
    */
  public void play(){
    while((player1.handSize() > 0) && (player2.handSize() > 0)){
      player1.takeTurn();
      player2.takeTurn();
    }
      if((player1.handSize() == 0) || (player2.handSize() == 0) || (deck.getDeckSize() == 0)){

        if(player1.handSize() == 0){
          player1_wins += 1;
          player2_points = player2.findCard();
          losing_cards += player2.handSize();

        }
        if(player2.handSize() == 0){
          player2_wins += 1;
          player1_points = player1.findCard();
          losing_cards += player1.handSize();

        }
        if(deck.getDeckSize() == 0){
          player1_points = player1.findCard();
          player2_points = player2.findCard();
          pile_empty += 1;

        }
      }

  }

  /**
    * returnLosingCards()
    * returns integer of the losing cards in each hand
    * @return number of losing cards
    */
  public int returnLosingCards(){
    return losing_cards;
  }

  /**
    * returnPlayer1Points()
    * returns number of points for player 1
    * @return integer of player points
    */
  public int returnPlayer1Points(){
    return player1_points;
  }

  /**
    * returnPlayer2Points()
    * returns number of points for player 2
    * @return integer of player points
    */
  public int returnPlayer2Points(){
    return player2_points;
  }

  /**
    * returnPlayer1Wins()
    * returns number of wins for player 1
    * @return integer of player wins
    */
  public int returnPlayer1Wins(){
    return player1_wins;
  }

  /**
    * returnPlayer2Wins()
    * returns number of wins for player 2
    * @return integer of player wins
    */
  public int returnPlayer2Wins(){
    return player2_wins;
  }

  /**
    * returnEmptyStock()
    * @return number of times the stock went empty
    */
  public int returnEmptyStock(){
    return pile_empty;
  }

  /**
    * returnNumberEights()
    * @return number of times an eight was played
    */
  public int returnNumberEights(){
    return number_eights;
  }

  
}
