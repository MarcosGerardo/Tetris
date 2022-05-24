/**
 * @(#)MyCanvasL.java
 *
 *
 * @author 
 * @version 1.00 2010/9/23
 */
import java.awt.*;

class MyCanvasL extends Canvas
{
   private linea l1;
   
   public MyCanvasL()
   {
    this.setSize (400, 400);
    l1 = new linea();
   }
   
   public MyCanvasL( int nx1, int ny1, int nx2, int ny2 )
   {
    this.setSize ( 400, 400 );
    l1 = new linea( nx1, ny1, nx2, ny2 );
   }
   
   public void setColor( Color c)
   {
    l1.ponColor(c);   
    repaint();
   }

   public void moverizquierda( int nx )
   {
    l1.mueve( l1.damex() - nx, l1.damey(), l1.damex2() - nx, l1.damey2() );
    repaint();
   }

   public void moverderecha( int nx )
   {
    l1.mueve( l1.damex() + nx, l1.damey(), (l1.damex2() + nx ), l1.damey2() );
    repaint();
   }
   
   public void moverarriba( int nx )
   {
    l1.mueve( l1.damex(), l1.damey() - nx, l1.damex2(), l1.damey2() - nx );
    repaint();
   }
   
   public void moverabajo( int nx )
   {
    l1.inicializar( l1.damex(), l1.damey() + nx, l1.damex2(), l1.damey2() + nx );
    repaint();
   }
     
   public void paint( Graphics g ) 
   {
      g.setColor( l1.dameColor() );
      g.drawLine( l1.damex(), l1.damey(), l1.damex2(), l1.damey2() );      
   }
}
