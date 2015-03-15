/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.List;

/**
 *
 * @author Celso
 */
public class Game {

    private Player player1;
    private Player player2;
    private List<Card> tableCardsPlayer1;
    private List<Card> tableCardsPlayer2;
    // others atributes

    /**
     * Main Constructor
     *
     * @param player1 - a Player
     * @param player2 - another Player
     */
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * Return player 1
     *
     * @return Player player1
     */
    public Player getPlayer1() {
        return player1;
    }

    /**
     * Return player 2
     *
     * @return Player player2
     */
    public Player getPlayer2() {
        return player2;
    }

}
