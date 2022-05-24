import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class ejemplo3 extends JFrame implements KeyListener
{  
 // private MyCanvasP punto1;
 // private MyCanvasL linea1;
  private MyCanvasC figuraUno;
 
  public ejemplo3()
    { 
     setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   //  punto1 = new MyCanvasP( 20,20 );
   //  linea1 = new MyCanvasL( 50, 20, 80, 100 );
     figuraUno = new MyCanvasC( 10, 10, 50, 150 );
     
   //  punto1.setColor( Color.red );
   //  linea1.setColor( Color.blue );
     
     addKeyListener( this );
    }
    
  public void keyPressed( KeyEvent evento )
  {
  // System.out.println( evento.getKeyCode() );
   
   switch ( evento.getKeyCode() ) 
   {
    case 37: //System.out.println( "Tecla izquierda" );
        //    punto1.moverizquierda( 1 );            
         //   linea1.moverizquierda( 1 );
            figuraUno.moverizquierda( 1 );
         break;
    case 38://System.out.println( "Tecla arriba" );
           // punto1.moverarriba( 1 );
           // linea1.moverarriba( 1 );
         figuraUno.moverarriba();
         break;
    case 39://System.out.println( "Tecla derecha" );
      //      punto1.moverderecha( 1 );
      //      linea1.moverderecha( 1 );
            figuraUno.moverderecha( 1 );
         break;
    case 40://System.out.println( "Tecla abajo" );
       //     punto1.moverabajo( 1 );
       //     linea1.moverabajo( 1 );
            figuraUno.moverabajo( 1 );
         break;
   }
  }
  
  public void keyReleased( KeyEvent evento )
  {
  // System.out.println( evento.getKeyCode() );
  }
  
  public void keyTyped( KeyEvent evento )
  {
  // System.out.println( evento.getKeyChar() );
  }
 
    public static void main ( String[] args ) 
      {
       ejemplo3 e = new ejemplo3();  
       
       e.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       e.setSize( 800, 600);
       e.setBackground( Color.yellow );
       
   //    e.add( e.punto1);
   //    e.add( e.linea1);
    
       e.figuraUno.setColor( Color.BLACK );
       e.add( e.figuraUno);
       e.setVisible(true);
     //  e.muestraFrame();      
      }     
}

