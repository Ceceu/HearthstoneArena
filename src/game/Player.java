/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.List;

/**
 * This Class represent a Player
 * @author Celso
 */
public class Player {

    Deck deck; // a set of Cards
    List<Card> handCards; // cards in Player's hand
    Hero hero; // Hero's Player

    /**
     * 
     * @param hero - player's Hero
     * @param deckName - file name which contain the Deck's cards
     */
    public Player(Hero hero, String deckName) {
        this.deck=new Deck(deckName);
        this.hero=hero;
    }

    /**
     * Show Player's Deck
     */
    public void showDeck() {
        deck.showDeck();
    }
/**
 * Return Player's Deck
 * @return 
 */
    public Deck getDeck() {
        return deck;
    }

    void executeAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
