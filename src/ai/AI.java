
package ai;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AI {

    /**
     * @param args the command line arguments
     */
    
       
       public static void s(int m[][],int row,int column){
           m[row][column] = 1 ;
           
       } 
    public static void main(String[] args) {
        // TODO code application logic here
        Main_Page M_P = new Main_Page();
        M_P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        M_P.setLocationRelativeTo(null);
        M_P.setVisible(true);
   
}
}
