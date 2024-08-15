/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package model;
/**
 *
 * Creates a Die class to be used in
 * CrapsModel.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class Dice {

    /** Creates an instance field for a value.*/
    private int myValue;

    /**
     * Crates a constructor of a Die to instantiate a die value.
     *
     */
    public Dice() {
        myValue = 1;
    }
    /**
     * Creates a method to roll a die.
     *
     */
    public void roll(){
        myValue = (int)(Math.random()*6) + 1;
    }

    /**
     * Getter method to get value of dice.
     * @return myValue gets value of dice.
     */
    public int getValue(){
        return myValue;
    }

}
