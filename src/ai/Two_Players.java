
package ai;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class Two_Players extends javax.swing.JFrame {


    
    int counter = 0 ;
    int turn_flag = 1 ;  //1 : White turn    , 2 : Black turn
    String F = "";

    
    //define a matrix  
    int[][] matrix = new int[3][3];
    
    int taken = 0;
    int color = 0 ;
    int position_old = -1;
    int position_new = -1;
    
    int number_of_player1_wins = 0 ;
    int number_of_player2_wins = 0 ;
    
    
    
    public void reset_game(){
        
        //reset all the positions to zero 
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                matrix[i][j] = 0 ;
            }
         }
        
        //reset the counter
        counter = 0 ;
        
        //remove all the icons from the buttons
        jButton1.setIcon(null);
        jButton2.setIcon(null);
        jButton3.setIcon(null);
        jButton4.setIcon(null);
        jButton5.setIcon(null);
        jButton6.setIcon(null);
        jButton7.setIcon(null);
        jButton8.setIcon(null);
        jButton9.setIcon(null);
        
    }
    
    public void set_the_result(){
        jLabel4.setText(number_of_player1_wins + "");
        jLabel5.setText(number_of_player2_wins + "");
    }
    
    
    public void check_win(){
        
        int result = 0;
        
        //first row
        if (matrix[0][0] == matrix[0][1] && matrix[0][0] == matrix[0][2] && matrix[0][0] !=0){
          result = matrix[0][0];
        }
        
        //second row
        else if (matrix[1][0] == matrix[1][1] && matrix[1][0] == matrix[1][2] && matrix[1][0] !=0){
          result = matrix[1][0];  
        }
        
        //third row
        else if (matrix[2][0] == matrix[2][1] && matrix[2][0] == matrix[2][2] && matrix[2][0] !=0){
          result =  matrix[2][0];  
        }
        
        //first column
        else if (matrix[0][0] == matrix[1][0] && matrix[0][0] == matrix[2][0] && matrix[0][0] !=0){
          result =  matrix[0][0];  
        }
        //second column
        else if (matrix[0][1] == matrix[1][1] && matrix[0][1] == matrix[2][1] && matrix[0][1] !=0){
         result = matrix[0][1];   
        }
        //third column
        else if (matrix[0][2] == matrix[1][2] && matrix[0][2] == matrix[2][2] && matrix[0][2] !=0){
           result =  matrix[0][2];
        }
            
          
        if(result != 0){
            
          String[] buttons = { "Play Again", "Return to main page", "Exit"};
          int choice = JOptionPane.showOptionDialog(null, "Player "+ result + " has won", "Message",JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[0]);
          
          if(choice == 0){
                  reset_game();
                  
                  if(result == 1){
                     number_of_player1_wins++;
                     set_the_result();
                  }
                  else if(result == 2){
                     number_of_player2_wins++;
                     set_the_result();
                  }
          }
          else if(choice == 1){
              this.dispose();
              Choose_Number_Of_Players n = new Choose_Number_Of_Players();
              n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              n.setLocationRelativeTo(null);
              n.setVisible(true);
          }
          
          else if(choice == 2)
              System.exit(0);
             }  
    }
    
    
         int value = 0;
         public void put_the_balls(javax.swing.JButton butt,int m[][],int row,int column){  
         if(counter % 2 == 0){
           F = "White";
           value = 1;
           
         }
         else{
           F = "Black";
           value = 2;
           }
                    
         if(m[row][column] != 0){
            JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
          }
          else if(m[row][column] == 0){
             m[row][column] = value ;
             butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/"+ F + ".jpg")));
             counter++;
          }   
        }
         
       public void move(javax.swing.JButton butt,int m[][],int row,int column){
                  if(color == 1){
                      butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      m[row][column] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[row][column] = 2;
                      taken = 0;
                  }
       }
    
    //taken = 1 , position_old = pos_old , position_new = pos_new , color = 1(White) or 2 (Black) 
    
    //Rules function
    
    public void move_the_balls(){
        
        if((position_old == 1 && position_new != 4) && (position_old == 1 && position_new != 2) && (position_old == 1 && position_new != 1)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        }
        
        else if((position_old == 2 && position_new != 1) && (position_old == 2 && position_new != 5) && (position_old == 2 && position_new != 3) && (position_old == 2 && position_new != 2)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        }
        
        else if((position_old == 3 && position_new != 2) && (position_old == 3 && position_new != 6) && (position_old == 3 && position_new != 3)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        } 
        
        else if((position_old == 4 && position_new != 1) && (position_old == 4 && position_new != 5) && (position_old == 4 && position_new != 7) && (position_old == 4 && position_new != 4)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        } 
        
         else if((position_old == 5 && position_new != 4) && (position_old == 5 && position_new != 2) && (position_old == 5 && position_new != 6) && (position_old == 5 && position_new != 8) && (position_old == 5 && position_new != 5)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        }
        
         else if((position_old == 6 && position_new != 3) && (position_old == 6 && position_new != 5) && (position_old == 6 && position_new != 9) && (position_old == 6 && position_new != 6)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        }
        
         else if((position_old == 7 && position_new != 4) && (position_old == 7 && position_new != 8) && (position_old == 7 && position_new != 7)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        }
        
          else if((position_old == 8 && position_new != 7) && (position_old == 8 && position_new != 5) && (position_old == 8 && position_new != 9) && (position_old == 8 && position_new != 8)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        }
        
          else if((position_old == 9 && position_new != 6) && (position_old == 9 && position_new != 8) && (position_old == 9 && position_new != 9)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
        }
        
          else{
              if(position_new == 1)
                 move(jButton1,matrix,0,0);
              
              else if(position_new == 2)
                 move(jButton2,matrix,1,0);
                               
              else if(position_new == 3)
                 move(jButton3,matrix,2,0);
                                
              else if(position_new == 4)
                 move(jButton4,matrix,0,1);
                  
              else if(position_new == 5)
                 move(jButton5,matrix,1,1);
                            
              else if(position_new == 6)
                 move(jButton6,matrix,2,1);
                               
              else if(position_new == 7)
                 move(jButton7,matrix,0,2);                 
              
              else if(position_new == 8)
                 move(jButton8,matrix,1,2);   
              
              else if(position_new == 9)
                 move(jButton9,matrix,2,2);
 
          }
    }
    
    
    public void initializations(){
        
        //make all the buttons with no border
        jButton1.setContentAreaFilled(false); // No fill
        jButton2.setContentAreaFilled(false); // No fill
        jButton3.setContentAreaFilled(false); // No fill
        jButton4.setContentAreaFilled(false); // No fill
        jButton5.setContentAreaFilled(false); // No fill   
        jButton6.setContentAreaFilled(false); // No fill
        jButton7.setContentAreaFilled(false); // No fill
        jButton8.setContentAreaFilled(false); // No fill
        jButton9.setContentAreaFilled(false); // No fill
        


        //0 represent that the position is free
        //1 represent that the position has white ball
        //2 represent that the position has black ball

        
        //initilize all the positions to zero 
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                matrix[i][j] = 0 ;
            }
         }
        
        
        //set the scores of 2 players
        jLabel4.setText(number_of_player1_wins + "");
        jLabel5.setText(number_of_player2_wins + "");
        
        
        
    }
    
  

    public Two_Players() {
        initComponents();
        initializations();
    }
    
    
    public void take_the_ball(javax.swing.JButton butt,int m[][],int row,int column,int pos_old){
        if(m[row][column] == 0){
            JOptionPane.showMessageDialog(null , "There is no ball here to move" , "Message" , JOptionPane.WARNING_MESSAGE);
        }
        else if(m[row][column] != turn_flag){
            JOptionPane.showMessageDialog(null , "It's not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
          }
        else{
            taken = 1 ;
            turn_flag = 3 - turn_flag;  // 1 : player 1 , white   // 2 : player 2 , black
            butt.setIcon(null);
            color = m[row][column];
            position_old = pos_old;
            m[row][column] = 0;
        }
    }
    
    public void put_the_ball(int m[][],int row,int column,int pos_new){
         if(m[row][column] != 0 || pos_new == position_old)
             JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
         else{
             position_new = pos_new;
             move_the_balls();
             check_win(); 
      }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 40));

        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 40, 40));

        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, 40));

        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 40, 40));

        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 40, 40));

        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 40));

        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 40, 40));

        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Background.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Player 1 :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Player 2 :");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
          if(counter < 6){
           put_the_balls(jButton5,matrix,1,1); 
           check_win();  
          }
          
          else{
                    
             if(taken == 0){
                take_the_ball(jButton5,matrix,1,1,5);
             }
             else if (taken == 1){
                 put_the_ball(matrix,1,1,5);
             }
             
             
          }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   
        
     if(counter < 6){
        put_the_balls(jButton7,matrix,0,2);
        check_win();  
 
     }
      else{
         
             if(taken == 0){
               take_the_ball(jButton7,matrix,0,2,7);
             }
             else if (taken == 1){
               put_the_ball(matrix,0,2,7);
             }
             
             
          }
   
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        
     if(counter < 6){
       put_the_balls(jButton8,matrix,1,2); 
       check_win();  
    
     }
      else{
             if(taken == 0){
               take_the_ball(jButton8,matrix,1,2,8);  

             }
             else if (taken == 1){
               put_the_ball(matrix,1,2,8); 
             }
             
             
          }
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if(counter < 6){
       put_the_balls(jButton1,matrix,0,0);  
       check_win();  

    }
     else{ 
             if(taken == 0){
                 take_the_ball(jButton1,matrix,0,0,1); 
             }
             else if (taken == 1){
                 put_the_ball(matrix,0,0,1);
             }
             
             
          }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        
     if(counter < 6){
       put_the_balls(jButton2,matrix,1,0); 
       check_win();  

     }
      else{
             
             if(taken == 0){
                take_the_ball(jButton2,matrix,1,0,2); 
             }
             else if (taken == 1){
                put_the_ball(matrix,1,0,2);
             }
             
             
          }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        
     if(counter < 6){
       put_the_balls(jButton3,matrix,2,0);  
       check_win();  

     }
      else{
             
             if(taken == 0){
                  take_the_ball(jButton3,matrix,2,0,3); 

             }
             else if (taken == 1){
                  put_the_ball(matrix,2,0,3);
                 
             }
          }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
     if(counter < 6){
       put_the_balls(jButton4,matrix,0,1);      
       check_win();  

     }
      else{
             
             if(taken == 0){
                take_the_ball(jButton4,matrix,0,1,4);
             }
             
             else if (taken == 1){
                put_the_ball(matrix,0,1,4);
             }
             
          }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  
        
      if(counter < 6){
         put_the_balls(jButton6,matrix,2,1);
         check_win();  

        }
       else{
             
             if(taken == 0){
                take_the_ball(jButton6,matrix,2,1,6);
             }
             
             else if (taken == 1){
                put_the_ball(matrix,2,1,6);
             }
             
             
          }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   
        
     if(counter < 6){
      put_the_balls(jButton9,matrix,2,2);
      check_win();  

     }
      else{
             
             if(taken == 0){
                take_the_ball(jButton9,matrix,2,2,9);
             }
             
             else if (taken == 1){
                put_the_ball(matrix,2,2,9);  
             }
             
             
          }
     
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Two_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Two_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Two_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Two_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Two_Players().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
