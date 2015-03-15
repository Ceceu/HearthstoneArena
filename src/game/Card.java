/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.List;

/**
 * This Class represent a Card
 * @author Celso
 */
public class Card {

    private String name;
    private Integer manaCost;
    private Integer attackValue;
    private Integer healthValue;
    private List<Mechanics> mechanics;

    /**
     * show a Card
     */
    public void showCard() {
        System.out.println("\nname: " + name);
        System.out.println("manaCost: " + manaCost);
        System.out.println("attackValue: " + attackValue);
        System.out.println("healthValue: " + healthValue);
        System.out.println("mechanics: " + mechanics);
    }

}
