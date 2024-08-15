/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package controller;
import model.CrapsModel;
import view.CrapsFrame;
import javax.swing.*;

/**
 *
 * Main method to add listens and to call a frame from
 * CrapsFrame.
 *
 * @author Christian David
 * @version 15 Dec 2022
 */
public class CrapsMain {

    /** Creates an instance field for CrapsModel.*/
    private final CrapsModel myCrapsModel;
    /** Creates an instance field for CrapsFrame.*/
    private final CrapsFrame myCrapsFrame;

    /**
     * Crates a constructor to call listeners and makes new instance fields.
     */
    public CrapsMain() {
        myCrapsFrame = new CrapsFrame();
        myCrapsModel = new CrapsModel(myCrapsFrame);
        addListeners();
    }

    /**
     * Main method to call the frame.
     * @param  theArgs command line arguments.
     */

    public static void main(final String[] theArgs) {
        JOptionPane.showMessageDialog(null, "Please set your bank amount before playing.");
        new CrapsMain();
    }


    /**
     * Creates many event listens to respond to the fields made in CrapsFrame.
     *
     */
    public void addListeners() {
        myCrapsFrame.getBank().getBankButton().addActionListener(e -> {
            try {
                myCrapsModel.setMyBankAmount
                        (Integer.parseInt(myCrapsFrame.getBank().getBankField().getText()));
            } catch (final NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Please Enter A Bank Amount!");
            }
        });
        myCrapsFrame.getRollDice().getRollButton().addActionListener(e -> {
            //myCrapsFrame.getRollDice().diceSound("Dice Roll Sound Effect 1.mp3");
            int results = myCrapsModel.rollDice();
            myCrapsFrame.getCurrentRoll().getTotalField().setText(String.valueOf(results));
            myCrapsFrame.getCurrentRoll().getDiceField1().setText(Integer.toString(myCrapsModel.getDie1()));
            myCrapsFrame.getCurrentRoll().getDiceField2().setText(Integer.toString(myCrapsModel.getDie2()));
            myCrapsModel.rollResults(results);
        });
        myCrapsFrame.getRollDice().getPlayButton().addActionListener(e -> myCrapsModel.playAgain());
        myCrapsFrame.getBet().getBetButton().addActionListener(e -> myCrapsModel.adjustBet(1));
        myCrapsFrame.getBet().getBetButton2().addActionListener(e -> myCrapsModel.adjustBet(5));
        myCrapsFrame.getBet().getBetButton3().addActionListener(e -> myCrapsModel.adjustBet(10));
        myCrapsFrame.getBet().getBetButton4().addActionListener(e -> myCrapsModel.adjustBet(50));
        myCrapsFrame.getBet().getBetButton5().addActionListener(e -> myCrapsModel.adjustBet(100));
        myCrapsFrame.getBet().getBetButton6().addActionListener(e -> myCrapsModel.adjustBet(500));

        myCrapsFrame.getMenu().getMyStartItem().addActionListener(e -> {
            if (myCrapsModel.getBankAmount() > 0) {
                myCrapsModel.enableButton();
            }
        });
        myCrapsFrame.getMenu().getMyResetItem().addActionListener(e-> myCrapsModel.reset());

    }

}
