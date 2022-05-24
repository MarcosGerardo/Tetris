/**
 * @(#)MyCanvasP.java
 *
 *
 * @author 
 * @version 1.00 2010/9/23
 */
import java.awt.*;

class MyCanvasP extends Canvas
{
   private punto p1;
   
    public MyCanvasP( )
   {
    this.setSize (400, 400);
    p1 = new punto( );
   }
   
   public MyCanvasP(int nx, int ny )
   {
    this.setSize ( 400, 400 );
    p1 = new punto( nx, ny );
   }
   
   void setColor( Color c)
   {
    p1.ponColor(c);   
    repaint();
   }
   
   public void moverderecha( int nx )
   {
    p1.mueve( p1.damex() + nx, p1.damey() );
    repaint();
   }
   
   public void moverizquierda( int nx )
   {
    p1.mueve( p1.damex() - nx, p1.damey() );
    repaint();
   }
   
   public void moverarriba( int nx )
   {
    p1.mueve( p1.damex(), p1.damey() - nx );
    repaint();
   }
   
   public void moverabajo( int nx )
   {
    p1.mueve( p1.damex(), p1.damey() + nx );
    repaint();
   }
   
   public void paint( Graphics g ) 
   {
      g.setColor( p1.dameColor() );
      g.drawLine( p1.damex(), p1.damey(), p1.damex() , p1.damey() );      
   }
}