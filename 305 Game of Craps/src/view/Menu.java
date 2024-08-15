/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;

import java.awt.Event;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
/**
 *
 * Represents  a Menu with components used to display a MenuItems for
 * CrapsFrame.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class Menu extends JMenuBar {

    /** The Menu makes a tab for game menu. */
    private final JMenu myGameMenu;
    /** The Menu makes a tab for help menu. */
    private final JMenu myHelpMenu;
    /** The Menu Item makes an option for Start. */
    private final JMenuItem myStartItem;
    /** The Menu Item makes an option for Reset. */
    private final JMenuItem myResetItem;
    /** The Menu Item makes an option for Exit. */
    private final JMenuItem myExitItem;
    /** The Menu Item makes an option for About. */
    private final JMenuItem myAboutItem;
    /** The Menu Item makes an option for Rules. */
    private final JMenuItem myRulesItem;
    /** The Menu Item makes an option for Shortcut. */
    private final JMenuItem myShortcutsItem;





    /**
     * Crates a constructor of a Menu to represent all the different components inside
     * a MenuBar.
     */
    public Menu() {
        myGameMenu = new JMenu("Game");
        myHelpMenu = new JMenu("Help");
        myStartItem = new JMenuItem("Start");
        myResetItem = new JMenuItem("Reset");
        myExitItem = new JMenuItem("Exit");
        myAboutItem = new JMenuItem("About");
        myRulesItem = new JMenuItem("Rules");
        myShortcutsItem = new JMenuItem("Shortcut");

        layoutComponent();
    }

    /**
     * The layout components for the GUI of this Menu.
     */
    public void layoutComponent(){
        add(myGameMenu);
        add(myHelpMenu);
        myGameMenu.add(myStartItem);
        myGameMenu.add(myResetItem);
        myGameMenu.add(myExitItem);
        myHelpMenu.add(myAboutItem);
        myHelpMenu.add(myRulesItem);
        myHelpMenu.add(myShortcutsItem);

        myExitItem.setMnemonic(KeyEvent.VK_E);
        KeyStroke myExitKey = KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.SHIFT_MASK);
        myExitItem.setAccelerator(myExitKey);

        myAboutItem.setMnemonic(KeyEvent.VK_A);
        KeyStroke myAboutKey = KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.SHIFT_MASK);
        myAboutItem.setAccelerator(myAboutKey);

        myRulesItem.setMnemonic(KeyEvent.VK_R);
        KeyStroke myRuleKey = KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.SHIFT_MASK);
        myRulesItem.setAccelerator(myRuleKey);

        myShortcutsItem.setMnemonic(KeyEvent.VK_S);
        KeyStroke myShortCutKey = KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.SHIFT_MASK);
        myShortcutsItem.setAccelerator(myShortCutKey);

        myStartItem.setMnemonic(KeyEvent.VK_X);
        KeyStroke myStartItemKey = KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.SHIFT_MASK);
        myStartItem.setAccelerator(myStartItemKey);

        myResetItem.setMnemonic(KeyEvent.VK_Z);
        KeyStroke myResetItemKey = KeyStroke.getKeyStroke(KeyEvent.VK_Z,InputEvent.SHIFT_MASK);
        myResetItem.setAccelerator(myResetItemKey);

        /* Adds actions listen to opens a pane to exit program.*/
        myExitItem.addActionListener(e->{
            int confirmExit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
                    "Confirm Exit", JOptionPane.YES_NO_OPTION);
            if(confirmExit == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

        });
        /* Adds actions listen to opens a panel to represent a message.*/
        myAboutItem.addActionListener(e ->
            JOptionPane.showMessageDialog(null, """
                    Christian David
                    Version: 8 Update: 341 of Java
                    This is a simple GUI of the game craps."""));
        /* Adds actions listen to opens a panel to represent a message.*/
        myRulesItem.addActionListener(e ->
            JOptionPane.showMessageDialog(null, """
                    The rules of the Game of craps are as follows:

                    A player rolls two dice where each die has six faces in the usual way (values 1 through 6).
                    After the dice have come to rest the sum of the two upward faces is calculated.
                    The first roll/throw
                    If the sum is 7 or 11 on the first throw the roller/player wins.
                    If the sum is 2, 3 or 12 the roller/player loses, that is the house wins.
                    If the sum is 4, 5, 6, 8, 9, or 10, that sum becomes the roller/player's 'point'.
                    Continue rolling given the player's point
                    Now the player must roll the 'point' total before rolling a 7 in order to win.
                    If they roll a 7 before rolling the point value they got on the first roll the roller/player loses (the 'house' wins)."""));

        /* Adds actions listen to opens a panel to represent a message.*/
        myShortcutsItem.addActionListener(e ->
            JOptionPane.showMessageDialog(null, """
                    Shift + A = About Menu
                    Shift + R = Rules Menu
                    Shift + S = Shortcut Menu
                    Shift + E = Exit Program
                    Shift + Z = Reset Program
                    Shift + X = Start Program
                    Alt + F = Roll
                    Alt G = Play Again
                    """));
    }

    /**
     * Getter method to get the components of starter item.
     * @return myStartItem.
     */
    public JMenuItem getMyStartItem() {
        return myStartItem;
    }
    /**
     * Getter method to get the components of starter item.
     * @return myResetItem.
     */
    public JMenuItem getMyResetItem() {
        return myResetItem;
    }

}
