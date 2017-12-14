/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;

/**
 *
 * @author HASSAN
 */
public class PersonalBoard extends GameOfLifeBoard {

   
    private boolean[][] board;

    public PersonalBoard(int width, int height) {
        super(width, height);
        this.board =  this.getBoard();
    }

     

    @Override
    public void initiateRandomCells(double d) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAlive(int i, int i1) {
        
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
if(i>this.getWidth()|| i1>this.getHeight()){
    return false;
}else 

        return board[i][i1];
       
}

    @Override
    public void turnToLiving(int i, int i1) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(i<this.getWidth()|| i1<this.getHeight()){
    
            board[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
              if(i<this.getWidth()|| i1<this.getHeight()){
    
            board[i][i1] = false;
        }
         
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
