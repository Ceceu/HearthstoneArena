/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Celso
 */
public class Game {

    private Queue<Player> turn;
    private List<Card> tableCardsPlayer1;
    private List<Card> tableCardsPlayer2;
    private Boolean gameIsActive;
    // others atributes

    /**
     * Main Constructor
     *
     * @param player1 - a Player
     * @param player2 - another Player
     */
    public Game(Player player1, Player player2) {
        turn = new LinkedList<Player>();
        turn.add(player1);
        turn.add(player2);
        gameIsActive=true;

    }

    /**
     * Return currentPlayer
     *
     * @return Player
     */
    public Player getCurrentPlayer() {
        return turn.peek();
    }

  
    public void play() {
        // define who goes first
        orderToPlay();
        Player player;
        
        // ... do something more
        
        while (gameIsActive){
           player = turn.peek();
           player.executeAction();
           // updated gameIsActive variable
           
           
        }
    }

    /**
     * define which player goes first
     */
    private void orderToPlay() {
        Random r = new Random();
        Double coin = r.nextDouble();
        if (coin > 0.5){
          turn.add(turn.poll());
        }
    }

}
