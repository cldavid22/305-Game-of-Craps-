/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.KeyEvent;
//import java.io.File;
/**
 *
 * Represents a Panel with components used to display a RollDice values for
 * CrapsModel.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class RollDice extends JPanel {

    /** The Button to set an action when performed . */
    private final JButton myRollButton;
    /** The Button to set an action when performed . */
    private final JButton myPlayButton;
    /** The Label for a points. */
    private final JLabel myPointLabel;
    /** The Text Field value for points. */
    private final JTextField myPointFiled;

    //private File myFile;





    /**
     * Crates a constructor of a RollDice to represent all the different components inside
     * a panel.
     */
    public RollDice() {
        super(null);
        myRollButton = new JButton("Roll Dice");
        myPlayButton = new JButton("Play Again");
        myPointLabel = new JLabel("Point:");
        myPointFiled = new JTextField();
        layoutComponents();

    }
    /**
     * The layout components for the GUI of this panel.
     */
    private void layoutComponents() {
        setBorder(BorderFactory.createTitledBorder("Roll"));
        setBounds(20,70,200,165);

        myRollButton.setBounds(20,35,95,30);
        myPlayButton.setBounds(20,80,95,30);
        myPointLabel.setBounds(20,125,80,20);
        myPointFiled.setBounds(60,125,65,20);

        add(myRollButton);
        add(myPlayButton);
        add(myPointLabel);
        add(myPointFiled);

        myRollButton.setEnabled(false);
        myPlayButton.setEnabled(false);
        myPointFiled.setEditable(false);

        myRollButton.setMnemonic(KeyEvent.VK_F);
        myPlayButton.setMnemonic(KeyEvent.VK_G);



    }
   /* public void diceSound(String theMusic)  {
        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(theMusic));
            Clip myClip = AudioSystem.getClip();
            myClip.open(inputStream);
        } catch (Exception e) {

        }
    } */

    /**
     * Getter method to input an action to the button of rolling dice.
     * @return myRollButton the action when pressed.
     */
    public JButton getRollButton() {
        return myRollButton;
    }
    /**
     * Getter method to input an action to the button when playing again.
     * @return myPlayButton the action when pressed.
     */
    public JButton getPlayButton() {
        return myPlayButton;
    }

    /**
     * Getter method to return input of the dice value if not win/lose.
     * @return myPointField the value of dice value.
     */
    public JTextField getMyPointFiled() {
        return myPointFiled;}


}
