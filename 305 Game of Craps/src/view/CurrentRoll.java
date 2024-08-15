/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;
import javax.swing.*;
/**
 *
 * Represents a Panel with components used to display a CurrentRoll values for
 * CrapsModel.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class CurrentRoll extends JPanel {

    /** The Label to set a die 1. */
    private final JLabel myDiceLabel1;
    /** The Label to set a die 2. */
    private final JLabel myDiceLabel2;
    /** The Label to set a total */
    private final JLabel myTotalLabel;
    /** The Text Field value for a die 1. */
    private final JTextField myDiceField1;
    /** The Text Field value for a die 2. */
    private final JTextField myDiceField2;
    /** The Text Field value for a total of die 1 and die 2. */
    private final JTextField myTotalField;

    /**
     * Crates a constructor of a CurrentRoll to represent all the different components inside
     * a panel.
     */
    public CurrentRoll() {
        super(null);
        myDiceLabel1 = new JLabel("Die 1:");
        myDiceLabel2 = new JLabel("Die 2:");
        myTotalLabel = new JLabel("Total:");
        myDiceField1 = new JTextField();
        myDiceField2 = new JTextField();
        myTotalField = new JTextField();
        layoutComponents();

    }
    /**
     * The layout components for the GUI of this panel.
     */
    private void layoutComponents() {
        setBorder(BorderFactory.createTitledBorder("Current Roll"));
        setBounds(265,70,200,165);

        myDiceLabel1.setBounds(23,38,40,20);
        myDiceLabel2.setBounds(23,70,40,20);
        myTotalLabel.setBounds(23,102,40,20);
        myDiceField1.setBounds(70,38,100,20);
        myDiceField2.setBounds(70,70,100,20);
        myTotalField.setBounds(70,102,100,20);

        add(myDiceLabel1);
        add(myDiceLabel2);
        add(myTotalLabel);
        add(myDiceField1);
        add(myDiceField2);
        add(myTotalField);

        myDiceField1.setEditable(false);
        myDiceField2.setEditable(false);
        myTotalField.setEditable(false);



    }
    /**
     * Getter method to return input of the dice value.
     * @return myDiceField1 the value of dice value.
     */
    public JTextField getDiceField1(){
        return  myDiceField1;
    }
    /**
     * Getter method to return input of the dice value.
     * @return myDiceField2 the value of dice value.
     */
    public JTextField getDiceField2(){
        return  myDiceField2;
    }
    /**
     * Getter method to return input of total.
     * @return myTotalField the value of dice 1 and dice 2.
     */
    public JTextField getTotalField(){
        return  myTotalField;
    }
}
