/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;
import javax.swing.*;
/**
 *
 * Represents a Panel with components used to display a WinTotal values for
 * CrapsModel.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class WinTotal extends JPanel{

    /** The Label for a players win. */
    private final JLabel myPlayWinLabel;
    /** The Label for a house win. */
    private final JLabel myHouseWinLabel;
    /** The Text Field value for a players win. */
    private final JTextField myPlayWinField;
    /** The Text Field value for a house win. */
    private final JTextField myHouseWinField;

    /**
     * Crates a constructor of a WinTotal to represent all the different components inside
     * a panel.
     */
    public WinTotal() {
        super(null);
        myPlayWinLabel = new JLabel("Player Win Total:");
        myHouseWinLabel = new JLabel("House Win Total:");
        myPlayWinField = new JTextField();
        myHouseWinField = new JTextField();
        layoutComponents();

    }
    /**
     * The layout components for the GUI of this panel.
     */
    private void layoutComponents() {
        setBorder(BorderFactory.createTitledBorder("Win Totals"));
        setBounds(200,300,265,145);

        myPlayWinLabel.setBounds(25,40,150,20);
        myHouseWinLabel.setBounds(25,80,150,20);
        myPlayWinField.setBounds(130,40,110,22);
        myHouseWinField.setBounds(130,80,110,22);

        add(myPlayWinLabel);
        add(myHouseWinLabel);
        add(myPlayWinField);
        add(myHouseWinField);

        myPlayWinField.setEditable(false);
        myHouseWinField.setEditable(false);




    }
    /**
     * Getter method to return input of player win.
     * @return myPlayWinField the value of bet.
     */
    public JTextField getPlayWinField(){
        return  myPlayWinField;
    }
    /**
     * Getter method to return input of house win.
     * @return myHouseWinField the value of house win.
     */
    public JTextField getHouseWinField(){
        return myHouseWinField;
    }


}
