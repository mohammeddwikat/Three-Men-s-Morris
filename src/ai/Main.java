/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author user
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    int counter = 0 ;
    int turn_flag = 1 ;  //1 : White turn    , 2 : Black turn
    String F = "";
    int count_white = 0 ;
    int count_Black = 0 ;
    //define a matrix  
    int[][] matrix = new int[3][3];
    int taken = 0;
    int color = 0 ;
    int position_old = -1;
    int position_new = -1;
    
    
    public int win(){
        
        //first row
        if (matrix[0][0] == matrix[0][1] && matrix[0][0] == matrix[0][2] && matrix[0][0] !=0){
          return matrix[0][0];
        }
        
        //second row
        else if (matrix[1][0] == matrix[1][1] && matrix[1][0] == matrix[1][2] && matrix[1][0] !=0){
          return matrix[1][0];  
        }
        
        //third row
        else if (matrix[2][0] == matrix[2][1] && matrix[2][0] == matrix[2][2] && matrix[2][0] !=0){
          return matrix[2][0];  
        }
        
        //first column
        else if (matrix[0][0] == matrix[1][0] && matrix[0][0] == matrix[2][0] && matrix[0][0] !=0){
          return matrix[0][0];  
        }
        //second column
        else if (matrix[0][1] == matrix[1][1] && matrix[0][1] == matrix[2][1] && matrix[0][1] !=0){
         return matrix[0][1];   
        }
        //third column
        else if (matrix[0][2] == matrix[1][2] && matrix[0][2] == matrix[2][2] && matrix[0][2] !=0){
           return matrix[0][2];
        }
         return 0 ;    
    }
    
    
    public void put_the_balls(int flag){
        
       if(counter % 2 == 0){
           F = "W";
       }
       else{
           F = "B";
       }
        

         if(flag == 1  && matrix[0][0] == 0){
             if(F == "W"){
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg"))); 
                matrix[0][0] = 1 ;
                counter++;
             }
             else if (F == "B"){
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg"))); 
                matrix[0][0] = 2 ;
                counter++;
             }
         }
         else if (flag == 2  && matrix[1][0] == 0){
             if(F == "W"){
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg"))); 
                matrix[1][0] = 1 ;
                counter++;
             }
             else if(F == "B"){
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg"))); 
                matrix[1][0] = 2 ;
                counter++;
             }
         }
          if(flag == 3  && matrix[2][0] == 0){
            if(F == "W"){
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                matrix[2][0] = 1 ;
                 counter++;
            }
            else if (F == "B"){
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                matrix[2][0] = 2 ;
                counter++;
            }
         }
         else if (flag == 4  && matrix[0][1] == 0){
            if(F == "W"){
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                matrix[0][1] = 1 ;
                counter++;
            }
            else if (F == "B"){
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                matrix[0][1] = 2 ;
                counter++;
            }
         }
           if(flag == 5  && matrix[1][1] == 0){
            if(F == "W"){
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                matrix[1][1] = 1 ;
                counter++;
            }
            else if (F == "B"){
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                matrix[1][1] = 2 ;
                counter++;
            }
         }
         else if (flag == 6  && matrix[2][1] == 0){
            if(F == "W"){
                jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                matrix[2][1] = 1 ;
                counter++;
            }
            else if (F == "B"){
                jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                matrix[2][1] = 2 ;
                counter++;
            }
         }
            if(flag == 7  && matrix[0][2] == 0){
            if(F == "W"){
                jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                matrix[0][2] = 1 ;
                counter++;
            }
            else if (F == "B"){
                jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                matrix[0][2] = 2 ;
                counter++;
            }
         }
         else if (flag == 8  && matrix[1][2] == 0){
            if(F == "W"){
                jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                matrix[1][2] = 1 ;
                counter++;
            }
            else if (F == "B"){
                jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                matrix[1][2] = 2 ;
                counter++;
            }
         }
         else if(flag == 9  && matrix[2][2] == 0){
            if(F == "W"){
                jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg"))); 
                matrix[2][2] = 1 ;
                counter++;
            }
            else if (F == "B"){
                jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                matrix[2][2] = 2 ;
                counter++;
         }
         }
           
            
       
   
    }
    
    //taken = 1 , position_old = pos_old , position_new = pos_new , color = 1(Black) or 2 (White) 
    
    //Rules function
    
    public void move_the_balls(){
        System.out.print(position_old + " " + position_new);
        if((position_old == 1 && position_new != 4) && (position_old == 1 && position_new != 2) && (position_old == 1 && position_new != 1)){
           JOptionPane.showMessageDialog(null , "You can't move to this position" , "Message" , JOptionPane.WARNING_MESSAGE); 
           
           //pos = -1
           //pos_new =-1
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
              if(position_new == 1){
                  if(color == 1){
                      jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[0][0] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[0][0] = 2;
                      taken = 0;
                  }
                  
              }
              if(position_new == 2){
                  if(color == 1){
                      jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[1][0] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[1][0] = 2;
                      taken = 0;
                  }
                  
              }
              if(position_new == 3){
                  if(color == 1){
                      jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[2][0] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[2][0] = 2;
                      taken = 0;
                  }
                  
              }
              if(position_new == 4){
                  if(color == 1){
                      jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[0][1] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[0][1] = 2;
                      taken = 0;
                  }
                  
              }
               if(position_new == 5){
                  if(color == 1){
                      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[1][1] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[1][1] = 2;
                      taken = 0;
                  }
                  
              }
              if(position_new == 6){
                  if(color == 1){
                      jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[2][1] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[2][1] = 2;
                      taken = 0;
                  }
                  
              }
              if(position_new == 7){
                  if(color == 1){
                      jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[0][2] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[0][2] = 2;
                      taken = 0;
                  }
                  
              }
              if(position_new == 8){
                  if(color == 1){
                      jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[1][2] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[1][2] = 2;
                      taken = 0;
                  }
                  
              }
              if(position_new == 9){
                  if(color == 1){
                      jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
                      matrix[2][2] = 1;
                      taken = 0;
                  }
                  else if(color == 2){
                      jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      matrix[2][2] = 2;
                      taken = 0;
                  }
                  
              }
              
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
        
        

        
       
        
        
//        int mat[][] = { {0, 0, 0},
//                        {0, 0, 0},
//                        {0, 0, 0} };
        


        //0 represent that the position is free
        //1 represent that the position has white ball
        //2 represent that the position has black ball

       
        
        //initilize all the positions to zero 
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                matrix[i][j] = 0 ;
            }
         }
        
        
        
    }
    
  

    public Main() {
        initComponents();
        initializations();
        
//          jButton5.setOpaque(false); // Must add
//          jButton5.setBounds(200, 200, 200, 20);
//          jButton5.setOpaque(false); // Must add
//          jButton5.setFocusable(false); // I'd like to set focusable false to the button.
//          jButton5.setBorderPainted(true); // I'd like to enable it.
//          jButton5.setBorder(null); // Border (No border for now)
//          jButton5.setBorder(new RoundedBorder(30)); //10 is the radius

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
          if(counter < 6){
           put_the_balls(5); 
           int x = win();  
           if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
             }
           else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
            }
          }
          else{
             
//            if(matrix[1][1] != turn_flag)
//                JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
              
             if(taken == 0 && matrix[1][1] != 0){
                 
                   if(matrix[1][1] != turn_flag){
                           JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                     }
                   else{      
                            taken = 1 ;
                            turn_flag = 3 - turn_flag;
                            jButton5.setIcon(null);
                            color = matrix[1][1];
                            position_old = 5;
                            matrix[1][1] = 0;
                   }
                   
             }
             else if (taken == 1){
                 if(matrix[1][1] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 5;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
//        if(counter %2 == 0 && counter <=5){
//         jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg"))); // NOI18N
//         counter++;
//        }else if(counter %2 == 1 && counter <=5) {
////        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg"))); // NOI18N
//          jButton5.setIcon(null);
//         counter++;
//        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   
        
     if(counter < 6){
        put_the_balls(7);
        int x = win();  
        if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
     }
      else{
             if(taken == 0 && matrix[0][2] != 0){
                 
                  if(matrix[0][2] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{          
                        taken = 1 ;
                        turn_flag = 3 - turn_flag;
                        jButton7.setIcon(null);
                        color = matrix[0][2];
                        position_old = 7;
                        matrix[0][2] = 0;
                    }
             }
             else if (taken == 1){
                 if(matrix[0][2] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 7;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
   
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        
     if(counter < 6){
       put_the_balls(8); 
       int x = win();  
       if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
       else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }  
     }
      else{
             if(taken == 0 && matrix[1][2] != 0){
                 
                   if(matrix[1][2] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                        taken = 1 ;
                        turn_flag = 3 - turn_flag;
                        jButton8.setIcon(null);
                        color = matrix[1][2];
                        position_old = 8;
                        matrix[1][2] = 0;
                      }
             }
             else if (taken == 1){
                 if(matrix[1][2] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 8;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if(counter < 6){
       put_the_balls(1);  
       int x = win();  
        if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
    }
     else{ 
             if(taken == 0 && matrix[0][0] != 0){
                 
                   if(matrix[0][0] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                        taken = 1 ;
                        turn_flag = 3 - turn_flag;
                        jButton1.setIcon(null);
                        color = matrix[0][0];
                        position_old = 1;
                        matrix[0][0] = 0;
                     }
             }
             else if (taken == 1){
                 if(matrix[0][0] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 1;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
    
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        
     if(counter < 6){
       put_the_balls(2); 
       int x = win();  
        if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
     }
      else{
             
             if(taken == 0 && matrix[1][0] != 0){
                   if(matrix[1][0] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                        taken = 1 ;
                        turn_flag = 3 - turn_flag; 
                        jButton2.setIcon(null);
                        color = matrix[1][0];
                        position_old = 2;
                        matrix[1][0] = 0;
                    }
             }
             else if (taken == 1){
                 if(matrix[1][0] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 2;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        
     if(counter < 6){
       put_the_balls(3);  
       int x = win();  
        if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
     }
      else{
             
             if(taken == 0 && matrix[2][0] != 0){
                 
                   if(matrix[2][0] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                        taken = 1 ;
                        turn_flag = 3 - turn_flag;
                        jButton3.setIcon(null);
                        color = matrix[2][0];
                        position_old = 3;
                        matrix[2][0] = 0;
                      }
             }
             else if (taken == 1){
                 if(matrix[2][0] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 3;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
     if(counter < 6){
       put_the_balls(4);      
       int x = win();  
       if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
       else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        } 
     }
      else{
             
             if(taken == 0 && matrix[0][1] != 0){
                 
                   if(matrix[0][1] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                        taken = 1 ;
                        turn_flag = 3 - turn_flag;
                        jButton4.setIcon(null);
                        color = matrix[0][1];
                        position_old = 4;
                        matrix[0][1] = 0;
                     }
             }
             
             else if (taken == 1){
                 if(matrix[0][1] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 4;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  
        
      if(counter < 6){
         put_the_balls(6); 
         int x = win();  
         if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
          }
         else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
         }
        }
       else{
             
             if(taken == 0 && matrix[2][1] != 0){
                 
                   if(matrix[2][1] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                        taken = 1 ;
                        turn_flag = 3 - turn_flag;
                        jButton6.setIcon(null);
                        color = matrix[2][1];
                        position_old = 6;
                        matrix[2][1] = 0;
                      }
             }
             
             else if (taken == 1){
                 if(matrix[2][1] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 6;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
             }
          }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   
        
     if(counter < 6){
       put_the_balls(9);
       int x = win();  
        if(x == 1){
            JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else if (x == 2){
            JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
     }
      else{
             
             if(taken == 0 && matrix[2][2] != 0){
                 
                   if(matrix[2][2] != turn_flag){
                        JOptionPane.showMessageDialog(null , "It's Not your turn" , "Message" , JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                       taken = 1 ;
                       turn_flag = 3 - turn_flag;
                       jButton9.setIcon(null);
                       color = matrix[2][2];
                       position_old = 9;
                       matrix[2][2] = 0;
                  }
             }
             
             else if (taken == 1){
                 if(matrix[2][2] != 0)
                     JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
                 else{
                 position_new = 9;
                 move_the_balls();
                 int y = win();  
                 if(y == 1){
                 JOptionPane.showMessageDialog(null , "Player1 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (y == 2){
                 JOptionPane.showMessageDialog(null , "Player2 won" , "Message" , JOptionPane.INFORMATION_MESSAGE);
                  }
                 }
                 
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
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

//   private static class RoundedBorder implements Border {
//
//    private int radius;
//
//
//    RoundedBorder(int radius) {
//        this.radius = radius;
//    }
//
//
//    public Insets getBorderInsets(Component c) {
//        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
//    }
//
//
//    public boolean isBorderOpaque() {
//        return true;
//    }
//
//
//    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
//    }
//}
//   
}
