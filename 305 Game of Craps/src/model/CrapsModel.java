/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package model;
import view.CrapsFrame;
import javax.swing.*;
import java.io.File;

/**
 *
 * Represents the logic for the game to be used in Craps main to
 * make a GUI.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class CrapsModel {

    /** Creates an instance field for CrapsFrame.*/
    private final CrapsFrame myFrame;
    /** Creates an instance field for player wins.*/
    private int myPlayWins = 0;
    /** Creates an instance field for house wins.*/
    private int myHouseWins = 0;
    /** Creates an instance field for die 1 value.*/
    private int myDie1Value;
    /** Creates an instance field for die 2 value.*/
    private int myDie2Value;
    /** Creates an instance field for bet value.*/
    private int myBetAmount = 0;
    /** Creates an instance field for bank value.*/
    private int myBankAmount = 0;
    /** Creates an instance field for point value.*/
    private int myPointValue = 0;
    /** Creates an instance field for has rolled.*/
    private boolean myHasRolled = false;




    /**
     * Crates a constructor of a CrapsModel to make the logic and call from CrapsFrame.
     */
    public CrapsModel(final CrapsFrame theFrame) {
        myFrame = theFrame;
    }


    /**
     * Sets the bank amount from user input.
     * @param theBankAmount the value of bank.
     */
    public void setMyBankAmount(final int theBankAmount) {
        if (theBankAmount <= 0) {
            JOptionPane.showMessageDialog(null, "Please Enter A Bank Amount!");
        } else {
            myBankAmount = theBankAmount;
            myFrame.getBank().getBankButton().setEnabled(false);
            myFrame.getBank().getBankField().setEditable(false);
        }
    }
    /**
     * Rolls the dice and checks for values to see if.
     * a user has won or lost.
     *
     * @param theResultsOfDice shows the result of the dice total.
     */
    public void rollResults(int theResultsOfDice) {
        if (myBetAmount > myBankAmount) {
            JOptionPane.showMessageDialog(null, "Bet to high");
            setBet(0);
            myFrame.getBet().getBetField().setText("0");
            myFrame.getCurrentRoll().getDiceField1().setText("");
            myFrame.getCurrentRoll().getDiceField2().setText("");
            myFrame.getCurrentRoll().getTotalField().setText("");
        }
         else if (!myHasRolled) {
            myHasRolled = true;
            switch (theResultsOfDice) {
                case 7, 11 -> youWon();
                case 2, 3, 12 -> youLose();
                default -> {
                    myPointValue = theResultsOfDice;
                    againRoll();
                }
            }
        } else {
            if (myPointValue == theResultsOfDice) {
                youWon();
            } else if (theResultsOfDice == 7) {
                youLose();
            }

        }
    }

    /**
     * Sets the bet amount.
     * @param theBet the value of bank.
     */
    public void setBet(final int theBet) {
        myBetAmount = theBet;
    }
    /**
     * Adjust bet amount with new value.
     * @param theNewBet the value of bank.
     */
    public void adjustBet(final int theNewBet){
        setBet(myBetAmount + theNewBet);
        myFrame.getBet().getBetField().setText(String.valueOf(myBetAmount));
    }
    /**
     * Makes a roll dice method that makes new
     * dices objects and gets the total from them.
     */
    public int rollDice() {
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        die1.roll();
        die2.roll();
        myDie1Value = die1.getValue();
        myDie2Value = die2.getValue();
        return myDie1Value + myDie2Value;

    }

    /**
     * The results from a win if conditions are met and updates
     * fields accordingly.
     */
    public void youWon(){
        int confirmExit = JOptionPane.showConfirmDialog(null, "You Won, do you still want to play?",
                "Winner", JOptionPane.YES_NO_OPTION);
        if(confirmExit == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
        myPlayWins++;
        myFrame.getWinTotal().getPlayWinField().setText(Integer.toString(myPlayWins));
        myBankAmount += myBetAmount;
        myFrame.getBank().getBankField().setText(Integer.toString(myBankAmount));
        myFrame.getRollDice().getRollButton().setEnabled(false);
        myFrame.getRollDice().getPlayButton().setEnabled(true);
    }
    /**
     * The results from a lost if conditions are met and updates
     * fields accordingly.
     */
    public void youLose(){
        int confirmExit = JOptionPane.showConfirmDialog(null, "You Lost, do you still want to play?",
                "Loser", JOptionPane.YES_NO_OPTION);
        if(confirmExit == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
        myHouseWins++;
        myFrame.getWinTotal().getHouseWinField().setText(Integer.toString(myHouseWins));
        myBankAmount -= myBetAmount;
        myFrame.getBank().getBankField().setText(Integer.toString(myBankAmount));
        myFrame.getRollDice().getRollButton().setEnabled(false);
        myFrame.getRollDice().getPlayButton().setEnabled(true);
    }
    /**
     * Enables the play again button after the user either wins or lose.
     */
    public void playAgain(){
        myHasRolled = false;
        myPointValue = 0;
        myFrame.getRollDice().getPlayButton().setEnabled(false);
        myFrame.getRollDice().getRollButton().setEnabled(true);
        myFrame.getRollDice().getMyPointFiled().setText("0");
    }

    /**
     * If rolled on a condition where points dictate the game makes it where dice can be rolled again.
     */
    public void againRoll() {
        myFrame.getRollDice().getMyPointFiled().setText(Integer.toString(myPointValue));
    }

    /**
     * Enables all the buttons
     */
    public void enableButton() {
        myFrame.getRollDice().getRollButton().setEnabled(true);
        myFrame.getBet().getBetButton().setEnabled(true);
        myFrame.getBet().getBetButton2().setEnabled(true);
        myFrame.getBet().getBetButton3().setEnabled(true);
        myFrame.getBet().getBetButton4().setEnabled(true);
        myFrame.getBet().getBetButton5().setEnabled(true);
        myFrame.getBet().getBetButton6().setEnabled(true);
    }
    /**
     * Disables all the buttons
     */
    public void reset() {
        myFrame.getRollDice().getRollButton().setEnabled(false);
        myFrame.getBet().getBetButton().setEnabled(false);
        myFrame.getBet().getBetButton2().setEnabled(false);
        myFrame.getBet().getBetButton3().setEnabled(false);
        myFrame.getBet().getBetButton4().setEnabled(false);
        myFrame.getBet().getBetButton5().setEnabled(false);
        myFrame.getBet().getBetButton6().setEnabled(false);
        myFrame.getRollDice().getPlayButton().setEnabled(false);
        myFrame.getBank().getBankButton().setEnabled(true);
        myFrame.getBank().getBankField().setEditable(true);
        myFrame.getCurrentRoll().getDiceField1().setText("");
        myFrame.getCurrentRoll().getDiceField2().setText("");
        myFrame.getCurrentRoll().getTotalField().setText("");
        myFrame.getRollDice().getMyPointFiled().setText("");
        myFrame.getWinTotal().getPlayWinField().setText("");
        myFrame.getWinTotal().getHouseWinField().setText("");
        myFrame.getBet().getBetField().setText("");
        myFrame.getBank().getBankField().setText("");
        myPlayWins = 0;
        myHouseWins = 0;
        myDie1Value =0 ;
        myDie2Value = 0;
        myBetAmount = 0;
        myBankAmount = 0;
        myPointValue = 0;
        JOptionPane.showMessageDialog(null, "Please set your bank amount before playing.");
    }

    /**
     * Getter method to get value of die 1.
     * @return myDie1Value.
     */
    public int getDie1() {
        return myDie1Value;
    }
    /**
     * Getter method to get value of die 2.
     * @return myDie2Value.
     */
    public int getDie2() {
        return myDie2Value;
    }
    /**
     * Getter method to get value of bank amount.
     * @return myBankAmount.
     */
    public int getBankAmount() {
        return myBankAmount;
    }
}

