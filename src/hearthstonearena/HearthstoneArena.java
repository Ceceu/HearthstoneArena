/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearthstonearena;

import game.Game;
import game.Hero;
import game.Player;

/**
 *
 * @author Celso
 */
public class HearthstoneArena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("This is HearthStone Simulator");
        
        Hero hero1 = new Hero("Hero1");
        Hero hero2 = new Hero("Hero2");
        
        String player1Deck = "decks/player1Deck.json";
        String player2Deck = "decks/player2Deck.json";
        
        Player player1 = new Player (hero1,player1Deck);
        Player player2 = new Player (hero2,player2Deck);
        
        
        
        Game game = new Game(player1,player2);
        game.getPlayer1().getDeck().showDeck();

    }
    
}
