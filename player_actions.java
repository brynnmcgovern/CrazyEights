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
  * This source file cotains the interface for the player actions
  */

import java.util.ArrayList;

public interface player_actions {

    void takeCardFromTopOfDeck(ArrayList deck);

    card playCard(int cardChoice);

    card computerAi(String newSuit, card topCard);

    String computerSelectNewSuit();
}
