/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;
import javax.swing.*;
/**
 *
 * Represents a Panel with components used to display a Bet s for
 * CrapsModel.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class Bet extends JPanel{

    /** The Text Field value for a bet. */
    private final JTextField myBetField;
    /** The Label for a dollar sign next to value. */
    private final JLabel myDollarSign;
    /** The Button to set an action when performed. */
    private final JButton myBetButton;
    /** The Button to set an action when performed. */
    private final JButton myBetButton2;
    /** The Button to set an action when performed. */
    private final JButton myBetButton3;
    /** The Button to set an action when performed. */
    private final JButton myBetButton4;
    /** The Button to set an action when performed. */
    private final JButton myBetButton5;
    /** The Button to set an action when performed. */
    private final JButton myBetButton6;

    /**
     * Crates a constructor of a Bet to represent all the different components inside
     * a panel.
     */
    public Bet() {
        super(null);
        myBetField = new JTextField();
        myDollarSign = new JLabel("$");
        myBetButton = new JButton("+$1");
        myBetButton2 = new JButton("+$5");
        myBetButton3 = new JButton("+$10");
        myBetButton4 = new JButton("+$50");
        myBetButton5 = new JButton("+$100");
        myBetButton6 = new JButton("+$500");

        layoutComponents();
    }
    /**
     * The layout components for the GUI of this panel.
     */
    public void layoutComponents() {
        setBorder(BorderFactory.createTitledBorder("Bet"));
        setBounds(500,175,140,270);

        myBetField.setBounds(45,40,90,20);
        myDollarSign.setBounds(30,45,20,10);
        myBetButton.setBounds(45,73,70,25);
        myBetButton2.setBounds(45,103,70,25);
        myBetButton3.setBounds(45,133,70,25);
        myBetButton4.setBounds(45,163,70,25);
        myBetButton5.setBounds(45,193,70,25);
        myBetButton6.setBounds(45,223,70,25);


        add(myBetField);
        add(myDollarSign);
        add(myBetButton);
        add(myBetButton2);
        add(myBetButton3);
        add(myBetButton4);
        add(myBetButton5);
        add(myBetButton6);

        myBetField.setEditable(false);
        myBetButton.setEnabled(false);
        myBetButton2.setEnabled(false);
        myBetButton3.setEnabled(false);
        myBetButton4.setEnabled(false);
        myBetButton5.setEnabled(false);
        myBetButton6.setEnabled(false);



    }
    /**
     * Getter method to return input of a bet.
     * @return myBetField the value of bet.
     */
    public JTextField getBetField() {
        return myBetField;
    }
    /**
     * Getter method to input an action to the button of bet.
     * @return myBetButton the action when pressed.
     */
    public JButton getBetButton(){
        return myBetButton;
    }
    /**
     * Getter method to input an action to the button of bet.
     * @return myBetButton2 the action when pressed.
     */
    public JButton getBetButton2(){
        return myBetButton2;
    }
    /**
     * Getter method to input an action to the button of bet.
     * @return myBetButton3 the action when pressed.
     */
    public JButton getBetButton3(){
        return myBetButton3;
    }
    /**
     * Getter method to input an action to the button of bet.
     * @return myBetButton4 the action when pressed.
     */
    public JButton getBetButton4(){
        return myBetButton4;
    }    /**
     * Getter method to input an action to the button of bet.
     * @return myBetButton5 the action when pressed.
     */
    public JButton getBetButton5(){
        return myBetButton5;
    }
    /**
     * Getter method to input an action to the button of bet.
     * @return myBetButton6 the action when pressed.
     */
    public JButton getBetButton6(){
        return myBetButton6;
    }

}
