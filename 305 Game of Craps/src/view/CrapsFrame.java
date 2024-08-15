/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;
import javax.swing.*;
import java.awt.*;

/**
 *
 * Represents the framework for all the panels to be placed onto a frame to
 * make a GUI.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class CrapsFrame extends JFrame {


    /** Creates an instance field for bank.*/
    private Bank myBank;
    /** Creates an instance field for bet.*/
    private Bet myBet;
    /** Creates an instance field for current roll.*/
    private CurrentRoll myCurrentRoll;
    /** Creates an instance field for win total.*/
    private WinTotal myWinTotal;
    /** Creates an instance field for roll dice.*/
    private RollDice myRollDice;
    /** Creates an instance field for meni.*/
    private Menu myMenu;

    /**
     * Crates a constructor of a CrapsFrame to make a frame.
     */
    public CrapsFrame() {
        super("The Game of Craps");
        createAndShowGUI();
    }

    /**
     * The layout components for the GUI to make a frame and add panels on to it.
     */
    public void createAndShowGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(700, 500);
        setResizable(false);

        myBank = new Bank();
        add(myBank);
        myBet = new Bet();
        add(myBet);
        myCurrentRoll = new CurrentRoll();
        add(myCurrentRoll);
        myRollDice = new RollDice();
        add(myRollDice);
        myWinTotal = new WinTotal();
        add(myWinTotal);
        myMenu = new Menu();
        setJMenuBar(myMenu);
        setVisible(true);

    }


    /**
     * Getter method to get components from the bank class.
     * @return myBank gets components from bank.
     */
    public Bank getBank() {
        return myBank;
    }
    /**
     * Getter method to get components from the bet class.
     * @return myBet gets components from bet.
     */
    public Bet getBet() {
        return myBet;
    }
    /**
     * Getter method to get components from the current roll class
     * @return myCurrentRoll gets components from current roll
     */
    public CurrentRoll getCurrentRoll() {
        return myCurrentRoll;
    }
    /**
     * Getter method to get components from the win total class
     * @return myWinTotal gets components from win total
     */
    public WinTotal getWinTotal() {
        return myWinTotal;
    }
    /**
     * Getter method to get components from the roll dice class
     * @return myRollDice gets components from roll dice
     */
    public RollDice getRollDice() {
        return myRollDice;
    }
    /**
     * Getter method to get components from menu class.
     * @return myMenu gets components from menu.
     */
    public Menu getMenu() {
        return myMenu;
    }

}
