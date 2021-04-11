/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main m = new Main();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    //    Object[] choice = {"Play Again", "Return"};

//int n = JOptionPane.showOptionDialog(null,
//    "Player1 has won the game",
//    "Message",
//    JOptionPane.DEFAULT_OPTION,
//    JOptionPane.QUESTION_MESSAGE,
//    null,
//    choice,
//    choice[0]);
//
//System.out.println("The users likes " + choice[n]);
//    }
//    String[] buttons = { "Yes", "Yes to all", "No", "Cancel"};    
//int returnValue = JOptionPane.showOptionDialog(null, "Narrative", "Narrative",
//        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);
//System.out.println(returnValue);
//    
}
}
