/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * This Class represent a Hero
 * @author Celso
 */
public class Hero {
    
    private String heroName;
    private Integer healthValue;
    private Integer attackValue;
    private HeroPower heroPower;

    public Hero(String heroName) {
        this.healthValue=30;
        this.attackValue=0;
        this.heroName=heroName;
    }
    
}
