/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import javax.swing.JOptionPane;
import java.util.Queue;

/**
 *
 * @author user
 */
public class One_Player extends javax.swing.JFrame {

        //define a matrix  
        int[][] matrix = new int[3][3];
        
        
        //define flag for turn which :
        // true : Computer turn
        // false : Player turn
        boolean turn_flag = false  ; 
        
        
        //define a counter for putting first 6 balls
        int counter = 0 ;  
        
        
        
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
        //1 represent that the position has white ball  (computer)
        //2 represent that the position has black ball  (player)

        //initilize all the positions to zero 
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                matrix[i][j] = 0 ;
            }
         }
    }
        
     
   public void put_the_balls_for_player(int pos){
       if(pos == 1){
           if(matrix[0][0] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[0][0] == 0){
               matrix[0][0] = 2 ;
               jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }  
       }
       else if (pos == 2){
           if(matrix[1][0] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[1][0] == 0){
               matrix[1][0] = 2 ;
               jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }           
       }
       else if (pos == 3){
           if(matrix[2][0] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[2][0] == 0){
               matrix[2][0] = 2 ;
               jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }              
       }
       else if (pos == 4){
           if(matrix[0][1] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[0][1] == 0){
               matrix[0][1] = 2 ;
               jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }            
       }
       else if (pos == 5){
           if(matrix[1][1] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[1][1] == 0){
               matrix[1][1] = 2 ;
               jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }           
       }
       else if (pos == 6){
           if(matrix[2][1] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[2][1] == 0){
               matrix[2][1] = 2 ;
               jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }           
       }
       else if (pos == 7){
            if(matrix[0][2] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[0][2] == 0){
               matrix[0][2] = 2 ;
               jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }          
       }
       else if (pos == 8){
            if(matrix[1][2] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[1][2] == 0){
               matrix[1][2] = 2 ;
               jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }          
       }
       else if (pos == 9){
           if(matrix[2][2] != 0){
               JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
           }
           else if(matrix[2][2] == 0){
               matrix[2][2] = 2 ;
               jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               turn_flag = true ;
           }           
       }
   }
   
public int Evaluation(){
    
    
    return 0;
    
}   
 
public void Generate_Successors(int M[][]){
    List<int[][]> q;
    
    
    
    
}
   
  public int alphabeta(int m[][],int depth,int a,int b,boolean maximizingPlayer){
      if(depth == 0){
          return Evaluation();
      }
      
      if(maximizingPlayer == true){
          int v = -1000;
         
          
          
          
          
      }
      
      
      
  } 
   
   
   
   
   public void put_the_balls_for_Computer(){
       
       
       
       
       
   }
        
    
        
        
    public One_Player() {
        initComponents();
        initializations();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 40));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 40, 40));

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, 40));

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 40, 40));

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 40, 40));

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 40));

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 40, 40));

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Background.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(1);
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(2);
      }        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(3);
      }
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(4);
      }        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(5);
      }    
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(6);
      }
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(7);
      }    
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(8);
      }    
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
      if(counter < 6 && turn_flag == true){
          
          
      }        
      else if (counter < 6 && turn_flag == false){
          put_the_balls_for_player(9);
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
            java.util.logging.Logger.getLogger(One_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(One_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(One_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(One_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new One_Player().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
