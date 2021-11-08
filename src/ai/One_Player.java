package ai;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Queue;
import javax.swing.JFrame;


public class One_Player extends javax.swing.JFrame {

        //define a matrix  
        int[][] matrix = new int[3][3];
        
        
        //define flag for turn which :
        // true : Computer turn
        // false : Player turn
        boolean turn_flag = false  ; 
        
        
        //define a counter for putting first 6 balls
        int counter = 0 ;  
        
        
        
        int number_of_player_wins = 0 ;
        int number_of_pc_wins = 0 ;
        
        
        
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
        
     int flag_putting_balls = 0;   
     public void put_the_balls_for_player(javax.swing.JButton butt,int m[][],int row,int column){  
         if(m[row][column] != 0){
            JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
          }
          else if(m[row][column] == 0){
             flag_putting_balls = 1;
             m[row][column] = 2 ;
             butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
             turn_flag = true ;
             counter+=2;
          }   
        }
        

public int Evaluation(int [][]board){
    int result ; 
    int score_PC = 0;    
    //1 : PC
    //2 : Player
    
    //row row 
    for(int i = 0 ; i < 3 ; i++){
        if(board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1)
           score_PC += 100;
        else if((board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 0)||(board[i][0] == 1 && board[i][1] == 0 && board[i][2] == 0)||(board[i][0] == 0 && board[i][1] == 1 && board[i][2] == 1))
           score_PC += 10;
        else if((board[i][0] == 1 && board[i][1] == 0 && board[i][2] == 0)||(board[i][0] == 0 && board[i][1] == 1 && board[i][2] == 0)||(board[i][0] == 0 && board[i][1] == 0 && board[i][2] == 1))
           score_PC += 1;
        
        else if(board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2)
           score_PC -= 100;
        else if((board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 0)||(board[i][0] == 2 && board[i][1] == 0 && board[i][2] == 2)||(board[i][0] == 0 && board[i][1] == 2 && board[i][2] == 2))
           score_PC -= 10;
        else if((board[i][0] == 2 && board[i][1] == 0 && board[i][2] == 0)||(board[i][0] == 0 && board[i][1] == 2 && board[i][2] == 0)||(board[i][0] == 0 && board[i][1] == 0 && board[i][2] == 2))
           score_PC -= 1;
    }
    
    //column column 
    for(int i = 0 ; i < 3 ; i++){
        if(board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1)
           score_PC += 100;
        else if((board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 0)||(board[0][i] == 1 && board[1][i] == 0 && board[2][i] == 0)||(board[0][i] == 0 && board[1][i] == 1 && board[2][i] == 1))
           score_PC += 10;
        else if((board[0][i] == 1 && board[1][i] == 0 && board[2][i] == 0)||(board[0][i] == 0 && board[1][i] == 1 && board[2][i] == 0)||(board[0][i] == 0 && board[1][i] == 0 && board[2][i] == 1))
           score_PC += 1;
        
        else if(board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 2)
           score_PC -= 100;
        else if((board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 0)||(board[0][i] == 2 && board[1][i] == 0 && board[2][i] == 2)||(board[0][i] == 0 && board[1][i] == 2 && board[2][i] == 2))
           score_PC -= 10;
        else if((board[0][i] == 2 && board[1][i] == 0 && board[2][i] == 0)||(board[0][i] == 0 && board[1][i] == 2 && board[2][i] == 0)||(board[0][i] == 0 && board[1][i] == 0 && board[2][i] == 2))
           score_PC -= 1;
    }
    
    result = score_PC ;
    
    
    return result;   
    
}


 public ArrayList<int[][]> generate_available_moves(int mat[][],int i,int j,int flag){
     ArrayList<int[][]> available_moves = new ArrayList<int[][]>(); 
     
     
   //flag = 1 ,computer
   //flag = 2 ,player
   
         
     //check to move up
     if(i-1 >= 0){
     if(mat[i-1][j] != 0 && mat[i-1][j] == flag){
         int [][]buffer = new int[3][3];
         for(int r = 0 ; r < 3;r++){
             for(int c = 0 ; c < 3 ; c++){
                buffer[r][c] = mat[r][c]; 
             }
         }
         
         int tmp = buffer[i][j];
         buffer[i][j] = buffer[i-1][j];
         buffer[i-1][j] = tmp ;
         
         available_moves.add(buffer);
     }
     }
     
     if((i+1) <= 2){
     //check to move down
     if(mat[i+1][j] != 0 && mat[i+1][j] == flag){
         int [][]buffer = new int[3][3];
         for(int r = 0 ; r < 3 ; r++){
             for(int c = 0 ; c < 3 ; c++){
                buffer[r][c] = mat[r][c]; 
             }
         }
         
         int tmp = buffer[i][j];
         buffer[i][j] = buffer[i+1][j];
         buffer[i+1][j] = tmp;
         
         available_moves.add(buffer);
     }
     }
     
     if((j+1) <= 2){
     //check to move right
     if(mat[i][j+1] != 0 && mat[i][j+1] == flag){
         int [][]buffer = new int[3][3];
         for(int r = 0 ; r < 3 ; r++){
             for(int c = 0 ; c < 3 ; c++){
                buffer[r][c] = mat[r][c]; 
             }
         }
         
         int tmp = buffer[i][j];
         buffer[i][j] = buffer[i][j+1];
         buffer[i][j+1] = tmp;
         
         available_moves.add(buffer);
     }
     }
     
     if((j-1) >= 0){
     //check to move left
     if(mat[i][j-1] != 0 && mat[i][j-1] == flag){
         int [][]buffer = new int[3][3];
         for(int r = 0 ; r < 3 ; r++){
             for(int c = 0 ; c < 3 ; c++){
                buffer[r][c] = mat[r][c]; 
             }
         }
         
         int tmp = buffer[i][j];
         buffer[i][j] = buffer[i][j-1];
         buffer[i][j-1] = tmp;
         
         available_moves.add(buffer);
     }
     }
     
     
     
     return available_moves; 
 }
     
    
     
public ArrayList<int[][]>  Generate_Successors(int M[][],int F){
    
   ArrayList<int[][]> successors = new ArrayList<int[][]>(); 

           
   int count_free_space = 0 ;
    
   //count the free space
    for(int i = 0 ; i < 3 ; i++){
        for(int j = 0 ; j < 3 ; j++){
            if(M[i][j] == 0)
                count_free_space++;   
        }  
    }
    
    
    if(count_free_space > 3){
     
     //I'm in the putting balls state
        
     int occurance = 1;   
     
     for(int c = 0 ; c < count_free_space ; c++){
       int [][]buffer = new int[3][3];    
       int counter = 0;
       
       for(int i = 0 ; i < 3 ; i++){
          for(int j = 0 ; j < 3 ; j++){
                if(M[i][j] == 0){
                 counter++;
                 }
             
               if(counter == occurance && F == 1){
                    buffer[i][j] = 1 ;
                    counter = -20;
                }
               else if(counter == occurance && F == 2){
                   buffer[i][j] = 2 ;
                   counter = -20;
               }
               else{
                    buffer[i][j] = M[i][j] ; 
               }  
         }
     }
     successors.add(buffer);
     occurance++;
     }    
    }
 
    else{
       //I'm in the moving balls state

       //1 :This is pc turn 
       //2 : player turn   

       
       for(int i = 0 ; i < 3 ; i++){
          for(int j = 0 ; j < 3 ; j++){
                if(M[i][j] == 0){
                   for(int av[][]:generate_available_moves(M,i,j,F))
                     successors.add(av);
                 }
         }
     }
   }
     return successors;
}




 int [][] state;
  public int alphabeta(int m[][],int depth,int alpha,int beta,boolean maximizingPlayer){
      
      int v = 0 ;
      int F_T = 1;  // 1 : pc turn , 2 player turn
      if(depth == 0 || check_winning()){
          return Evaluation(m);
      }
      
      if(maximizingPlayer == true){
          v = -10000 ;
          for(int [][]i : Generate_Successors(m,F_T)){
          
          if(alphabeta(i,depth - 1 , alpha , beta , false) >= v){
            v = max(v,alphabeta(i,depth - 1 , alpha , beta , false));
            state = i;
          }
          alpha = max(alpha , v);
         
          if(beta <= alpha)
              break;
      }
      }
      

      else if(maximizingPlayer == false){
         v = 10000 ;
         for(int [][]i : Generate_Successors(m,F_T)){
         
          v = min(v,alphabeta(i,depth - 1 , alpha , beta , false));
          alpha = min(alpha , v);
         
          if(beta <= alpha)
              break;
          
      }
      }
      
      
     return v;
  }
  
   public void reset_game(){
        
        //reset all the positions to zero 
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                matrix[i][j] = 0 ;
                //state[i][j] = 0;
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
        jLabel4.setText(number_of_player_wins + "");
        jLabel5.setText(number_of_pc_wins + "");
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
         

        if(result == 1){
            
          String[] buttons = { "Play Again", "Return to main page", "Exit"};
          int choice = JOptionPane.showOptionDialog(null, "PC has won", "Message",JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[0]);
          
          if(choice == 0){
                  reset_game();
                  
                  number_of_pc_wins++;
                  set_the_result();
 
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
        
        else if(result == 2){
            
          String[] buttons = { "Play Again", "Return to main page", "Exit"};
          int choice = JOptionPane.showOptionDialog(null, "Player has won", "Message",JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[0]);
          
          if(choice == 0){
                  reset_game();
                  
                  number_of_player_wins++;
                  set_the_result();
 
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

  
 public void set_the_state(){
     
     for(int i = 0 ; i < 3 ; i++){
         for(int j = 0 ; j < 3 ; j++){
             matrix[i][j] = state[i][j];
         }
     }
     
     jButton1.setIcon(null);
     jButton2.setIcon(null);
     jButton3.setIcon(null);
     jButton4.setIcon(null);
     jButton5.setIcon(null);
     jButton6.setIcon(null);
     jButton7.setIcon(null);
     jButton8.setIcon(null);
     jButton9.setIcon(null);
        
     //1 : white , pc
     //2 : black ,player
    if(state[0][0] == 1)
         jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[0][0] == 2)
         jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
     
     
    if(state[0][1] == 1)
         jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[0][1] == 2)
         jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
          
    
    if(state[0][2] == 1)
         jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[0][2] == 2)
         jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               
    
    
    if(state[1][0] == 1)
         jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[1][0] == 2)
         jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                 
    
    if(state[1][1] == 1)
         jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[1][1] == 2)
         jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                
    
    if(state[1][2] == 1)
         jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[1][2] == 2)
         jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               
                           
    
    if(state[2][0] == 1)
         jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[2][0] == 2)
         jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                         
    
    if(state[2][1] == 1)
         jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[2][1] == 2)
         jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
               
    
    if(state[2][2] == 1)
         jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/White.jpg")));
    else if(state[2][2] == 2)
         jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
        
 }
   
   public boolean check_winning(){
        
        //first row
        if (matrix[0][0] == matrix[0][1] && matrix[0][0] == matrix[0][2] && matrix[0][0] !=0){
          return true;
        }
        
        //second row
        else if (matrix[1][0] == matrix[1][1] && matrix[1][0] == matrix[1][2] && matrix[1][0] !=0){
          return true; 
        }
        
        //third row
        else if (matrix[2][0] == matrix[2][1] && matrix[2][0] == matrix[2][2] && matrix[2][0] !=0){
          return true; 
        }
        
        //first column
        else if (matrix[0][0] == matrix[1][0] && matrix[0][0] == matrix[2][0] && matrix[0][0] !=0){
          return true;
        }
        //second column
        else if (matrix[0][1] == matrix[1][1] && matrix[0][1] == matrix[2][1] && matrix[0][1] !=0){
         return true;
        }
        //third column
        else if (matrix[0][2] == matrix[1][2] && matrix[0][2] == matrix[2][2] && matrix[0][2] !=0){
           return true;
        }
         return false;    
    }

 
   int max_depth = 0;
   public void set_the_difficulty(int diff){
       //Easy
       if(diff == 0)
           max_depth = 1 ;
       //Medium
       else if (diff == 1)
           max_depth = 3 ;
       //Hard
       else if (diff == 2)
           max_depth = 2;
       
   }
   public void play_Computer(){
         alphabeta(matrix,max_depth,-1000,1000,true);  
         set_the_state();   
   }
        
   
   
    public void print_matrix(int [][]m){
       for(int i = 0 ; i < 3 ; i++){
           for(int j = 0 ; j < 3; j++){
              System.out.print(m[i][j]+ " ") ; 
           }
           System.out.print("\n");
       }
   }
        
        
    public One_Player() {
        initComponents();
        initializations();
    }
    
    
      public One_Player(int difficulty) {
        initComponents();
        initializations();
        set_the_difficulty(difficulty);
   
    }
      
    
          public void move(javax.swing.JButton butt,int m[][],int row,int column){
                      butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai/Black.jpg")));
                      m[row][column] = 2;
                      taken = 0;
       }
    
          
    int taken = 0;
    //int color = 0 ;
    int position_old = -1;
    int position_new = -1;
    
    //taken = 1 , position_old = pos_old , position_new = pos_new 
    //, color = 1(White) or 2 (Black) 
    
    //Rules function
    
    int flag_for_moving = 0 ;
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
              flag_for_moving = 1;
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
    
   public void take_the_ball(javax.swing.JButton butt,int m[][],int row,int column,int pos_old){
        if(m[row][column] == 0){
            JOptionPane.showMessageDialog(null , "There is no ball here to move" , "Message" , JOptionPane.WARNING_MESSAGE);
        }
        else if(m[row][column] == 1){
            JOptionPane.showMessageDialog(null , "This is not your ball" , "Message" , JOptionPane.WARNING_MESSAGE);
          }
        else{
            taken = 1 ;
            //turn_flag = 3 - turn_flag;  // 1 : player 1 , white   // 2 : player 2 , black
            butt.setIcon(null);
            //color = m[row][column];
            position_old = pos_old;
            m[row][column] = 0;
        }
    }
    
    int flag_put_after_taken = 0;
    public void put_the_ball(int m[][],int row,int column,int pos_new){
         if(m[row][column] != 0)
             JOptionPane.showMessageDialog(null , "There is a ball here" , "Message" , JOptionPane.WARNING_MESSAGE);
         else{
             flag_put_after_taken = 1;
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Player :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("PC :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));

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
                .addGap(54, 54, 54)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   

        if (counter < 6){ 
            
          put_the_balls_for_player(jButton1,matrix,0,0);
          
        
           if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
               
            }
        
        }
        else{
             if(taken == 0){
                 take_the_ball(jButton1,matrix,0,0,1); 
             }
             else if (taken == 1){
                 put_the_ball(matrix,0,0,1);
                  
                  if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 1 ;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                  }
              
             }
             
             
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       
       if (counter < 6){
              
          put_the_balls_for_player(jButton2,matrix,1,0);
          
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
           }
         
          
          }     
          else{
             
             if(taken == 0){
                take_the_ball(jButton2,matrix,1,0,2); 
             }
             else if (taken == 1){
                put_the_ball(matrix,1,0,2);

                if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0 ;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                  }
             }

          }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (counter < 6){
            
          put_the_balls_for_player(jButton3,matrix,2,0);
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
            }
        } 
        else{
              if(taken == 0){
                  take_the_ball(jButton3,matrix,2,0,3); 

             }
             else if (taken == 1){
                  put_the_ball(matrix,2,0,3);
                  
                  if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0 ; 
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                  }
             } 
        }
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
        

        if (counter < 6){
            
          put_the_balls_for_player(jButton4,matrix,0,1);
          
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
            }
          
        } 
        else{
            
            if(taken == 0){
                take_the_ball(jButton4,matrix,0,1,4);
             }
             
             else if (taken == 1){
                put_the_ball(matrix,0,1,4);
                
                if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0 ;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                 }
             }
             
               
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
   

        if (counter < 6){
            
          put_the_balls_for_player(jButton5,matrix,1,1);
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
            }
          
        } 
        else{
            
            if(taken == 0){
                take_the_ball(jButton5,matrix,1,1,5);
             }
             else if (taken == 1){
                 put_the_ball(matrix,1,1,5);
                 
                 if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                  }
             }
             
          
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed



        if (counter < 6){
            
          put_the_balls_for_player(jButton6,matrix,2,1);
          
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
            }
          
        } 
        else{
            
             if(taken == 0){
                take_the_ball(jButton6,matrix,2,1,6);
             }
             
             else if (taken == 1){
                put_the_ball(matrix,2,1,6);
                
                if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0 ;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                  }
             }
             
             
               
        }
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
 

         if (counter < 6){
             
          put_the_balls_for_player(jButton7,matrix,0,2);
          
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
            }
          
        } 
         else{
             if(taken == 0){
               take_the_ball(jButton7,matrix,0,2,7);
             }
             else if (taken == 1){
               put_the_ball(matrix,0,2,7);
               
               if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0 ;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                  } 
             }
             
          
          
         }
      
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
    

        if (counter < 6){
          put_the_balls_for_player(jButton8,matrix,1,2);
          
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
            }
          
        } 
        else{
            if(taken == 0){
               take_the_ball(jButton8,matrix,1,2,8);  

             }
             else if (taken == 1){
               put_the_ball(matrix,1,2,8); 
               
               if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0 ;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
                }
             }
            
        
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       

        if (counter < 6){
          put_the_balls_for_player(jButton9,matrix,2,2);
          
          if(flag_putting_balls == 1){
               flag_putting_balls = 0;
               if(check_winning())
               check_win();
               
               else{
               play_Computer();
               check_win();
               }
            }
          
        } 
        else{
             if(taken == 0){
                take_the_ball(jButton9,matrix,2,2,9);
             }
             
             else if (taken == 1){
                put_the_ball(matrix,2,2,9);  
                
                if(flag_put_after_taken == 1 && flag_for_moving == 1){
                     flag_for_moving = 0 ;
                     flag_put_after_taken = 0;
                     play_Computer();
                     check_win();
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
