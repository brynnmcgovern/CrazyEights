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
  * This source file cotains my Simulation Class
  * The function of the class is to simulate a game of crazy eights, and
  * print out all the statistics from the games
  * It uses objects from the previous four classes to carry out the simulation
  */


public class simulation{

  /**
    * The number of games in the simulation
    */
  private int num_games;

  /**
    * An object game to access the game class
    */
  private game game = new game ();

  /**
    * The number of cards in a losing_hand
    */
  private int losing_cards;

  /**
    * The number of wins for player 1
    */
  private int player1_wins;

  /**
    * The number of wins for player 2
    */
  private int player2_wins;

  /**
    * The number of points for player 1
    */
  private int player1_points;

  /**
    * The number of points for player 2
    */
  private int player2_points;

  /**
    * The number of times the draw pile went empty
    */
  private int pile_empty;

  /**
    * The number of average cards in a losing hand
    */
  private int average_cards;

  /**
    * The average number of eights played per game
    */
  private int average_eights;

  /**
    * The number of eights played per game
    */
  private int number_eights;



  /**
    * constructor setting the number of games
    */
  public simulation(int m_games){
    this.num_games = m_games;
  }

  /**
    * simulate()
    * no return; plays through the games of crazy eights
    */
  public void simulate(){
    for(int i = 0; i <= num_games; ++i){
      game.play();
    }
  }

  /**
    * calculate()
    * no return; gets the statistics from the games
    */
  public void calculate(){
    player1_wins = game.returnPlayer1Wins();
    player2_wins = game.returnPlayer2Wins();
    losing_cards = game.returnLosingCards();
    player1_points = game.returnPlayer1Points();
    player2_points = game.returnPlayer2Points();
    pile_empty = game.returnEmptyStock();
    number_eights = game.returnNumberEights();

    average_eights = number_eights / num_games;
    average_cards = losing_cards / num_games;

  }

  /**
    * report()
    * returns String reporting the game statistics
    * @return string of game statistics
    */
  public String report(){
    String str = "Statistics for the games: " + "\n";
    str += "Number of games won by Player 1: " + player1_wins + "\n";
    str += "Number of games won by Player 2: " + player2_wins + "\n";
    str += "Number of points collected by Player 1: " + player1_points + "\n";
    str += "Number of points collected by Player 2: " + player2_points + "\n";
    str += "The average number of cards held by the losing player when the game ended: " + average_cards + "\n";
    str += "The number of times the stock became empty during the " + num_games + " games: " + pile_empty + "\n";
    str += "The average number of times an Eight was played: " + average_eights + "\n";
    return str;
  }

  public static void main(String[] args){
    simulation simulate = new simulation(100);
    simulate.simulate();
    simulate.calculate();
    System.out.print(simulate.report());
  }
}
