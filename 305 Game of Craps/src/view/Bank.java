/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;
import javax.swing.*;
/**
 *
 * Represents a a Panel with components used to display a Bank values for
 * CrapsModel.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class Bank extends JPanel {

    /** The Text Field value for a bank. */
    private final JTextField myBankField;
    /** The Button to set a action when performed . */
    private final JButton myBankButton;
    /** The Label to set a dollar sign next to value. */
    private final JLabel myDollarSign;


    /**
     * Crates a constructor of a Bank to represent all the different components inside
     * a panel.
     */
    public Bank(){
        super(null);
        myDollarSign = new JLabel("$");
        myBankField = new JTextField();
        myBankButton = new JButton("Set Bank");
        layoutComponents();

    }

    /**
     * The layout components for the GUI of this panel.
     */
    private void layoutComponents() {
    setBorder(BorderFactory.createTitledBorder("Bank"));
    setBounds(500,25,140,120);

    myDollarSign.setBounds(35,45,20,10);
    myBankButton.setBounds(50,74,85,23);
    myBankField.setBounds(50,40,85,20);

    add(myBankButton);
    add(myBankField);
    add(myDollarSign);


    }

    /**
     * Getter method to return input from bank.
     * @return myBankField the value of bank.
     */
    public JTextField getBankField(){
        return myBankField;
    }
    /**
     * Getter method to input a action to the button of bank.
     * @return myBankButton the action when pressed.
     */
    public JButton getBankButton(){
        return myBankButton;
    }
}
