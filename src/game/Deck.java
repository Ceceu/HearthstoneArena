/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class represnt a Deck - a set of Cards;
 * @author Celso
 */
public class Deck {

    List<Card> cards;

    /**
     * Main constructor
     *
     * @param deckName - file which contains the card
     */
    public Deck(String deckName) {

        // read json string from file
        String jsonCards = jsonToString(deckName);

        // deserializing
        Gson gson = new Gson();
        Type deckType = new TypeToken<LinkedList<Card>>() {
        }.getType();
        this.cards = gson.fromJson(jsonCards, deckType);
    }
    
    /**
     * Another constructor
     * @param cards - a set of cards
     */
    public Deck (List<Card> cards) {
        this.cards=cards;
        
    }
    
    /**
     * Show a Deck
     */
    public void showDeck(){
        cards.stream().forEach((card) -> {
            card.showCard();
        });
  
    }
    
    

    /**
     * Read a file which contain deck's cards in json form
     *
     * @param deckName
     * @return jsonCards - a json String
     */
    private String jsonToString(String deckName) {
        StringBuilder jsonCards = new StringBuilder();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(deckName));
            String jsonCard = reader.readLine();
            while (jsonCard != null) {
                jsonCards.append(jsonCard);
                jsonCard = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jsonCards.toString();
    }
}
