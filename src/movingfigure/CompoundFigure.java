/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hassan
 */
public class CompoundFigure extends Figure {

  private List<Figure> figures;
 
   public CompoundFigure(){
    
   this.figures=new ArrayList<Figure>();
    
    }
   
   public void add(Figure f){
    figures.add(f);
    
}
    public void move(int dx,int dy){
         for(Figure g:figures){
             g.move(dx,dy);
            }

    }  
    @Override
    public  void draw(Graphics graphics)
{
  for(Figure g:figures)
  {
    g.draw(graphics);
}

}
}
