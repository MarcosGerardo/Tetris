
/**
 * @(#)MyCanvasC.java
 *
 *
 * @author 
 * @version 1.00 2010/9/23
 */

import java.awt.*;

import java.util.Random;
class MyCanvasC extends Canvas
{
   private figura1 f1;
   private figura2 f2;
   private figura3 f3;
   private figura4 f4;
   private figura5 f5;
   private figura6 f6;
   private figura7 f7;
     private figura8 f8;
   private figura9 f9;
   private figura10 f10;
   private figura11 f11;
   private figura12 f12;
   private figura13 f13;
   private figura14 f14;
     private figura15 f15;
   private figura16 f16;
   private figura17 f17;
   private figura18 f18;
   private figura19 f19;
   
 
   
   private figura f[];
   int numero;
   //private figura  t;
   //private figura run ;

   public MyCanvasC( int nx1, int ny1, int nx2, int ny2 )
   {
     //  int num;
    //Random rnd = new Random();
   //num=rnd.nextInt(19);
      
       this.setSize ( 300, 400 );
    f1 = new figura1( nx1, ny1, nx2, ny2 );
    f2 = new figura2( nx1, ny1, nx2, ny2 );
    f3 = new figura3( nx1, ny1, nx2, ny2 );
    f4 = new figura4( nx1, ny1, nx2, ny2 );
    f5 = new figura5( nx1, ny1, nx2, ny2 );
    f6 = new figura6( nx1, ny1, nx2, ny2 );
    f7 = new figura7( nx1, ny1, nx2, ny2 );
    f8 = new figura8( nx1, ny1, nx2, ny2 );
    f9 = new figura9( nx1, ny1, nx2, ny2 );
    f10 = new figura10( nx1, ny1, nx2, ny2 );
    f11 = new figura11( nx1, ny1, nx2, ny2 );
    f12 = new figura12( nx1, ny1, nx2, ny2 );
    f13 = new figura13( nx1, ny1, nx2, ny2 );
    f14 = new figura14( nx1, ny1, nx2, ny2 );
    f15 = new figura15( nx1, ny1, nx2, ny2 );
    f16 = new figura16( nx1, ny1, nx2, ny2 );
    f17 = new figura17( nx1, ny1, nx2, ny2 );
    f18 = new figura18( nx1, ny1, nx2, ny2 );
    f19 = new figura19( nx1, ny1, nx2, ny2 );
 //String t[]={"f1","f2","f3","f4","f5","f6","f7","f8","f9","f10","f11","f12","f13","f14","f15","f16","f17","f18","f19"};
switch(numero=(int)(Math.random()*19+1)){
    
    
    case 1:
    f[0]=f1;
    break;
    case 2:
    f[0]=f2;
    break;
    case 3:
    f[0]=f3;
    break;
    case 4:
    f[0]=f4;
    break;
    case 5:
    f[0]=f5;
    break;
    case 6:
    f[0]=f6;
    break;
    case 7:
    f[0]=f7;
    break;
    case 8:
    f[0]=f8;
    break;
    case 9:
    f[0]=f9;
    break;
    case 10:
    f[0]=f10;
    break;
    case 11:
    f[0]=f11;
    break;
    case 12:
    f[0]=f12;
    break;
    case 13:
    f[0]=f13;
    break;
    case 14:
    f[0]=f14;
    break;
    case 15:
    f[0]=f15;
    break;
    case 16:
    f[0]=f16;
    break;
    case 17:
    f[0]=f17;
    break;
    case 18:
    f[0]=f18;
    break;
    case 19:
    f[0]=f9;
    break;
    
    
    
    
    
    
    
    
    
}
    f = new figura[1];
    f[0] = numero;
   }
   
   void setColor( Color c)
   {
    f[0].c1.ponColor(c);
    f[0].c2.ponColor(c);
    f[0].c3.ponColor(c);
    f[0].c4.ponColor(c);
    repaint();
   }
   
   public void moverizquierda( int nx )
   {
    f[0].moverizquierda( nx );
    repaint();
   }

   public void moverderecha( int nx )
   {
    f[0].moverderecha( nx );
    repaint();
   }
   
   public void moverarriba( )
   {
    int nl, nuevax1, nuevay1;
    
    if ( f[0] instanceof figura1 )
    {
        nl = f1.dameDifx();
        
        f1 = (figura1) f[0];       
        
        f2.inicializar( f1.c1.damex(), f1.c1.damey(), nl * 4, nl  );
             
        f[0] = f2;
    
    
    }      
    else
     if ( f[0] instanceof figura2 )
     {
            nl = f2.dameDify();
            
      f2 = (figura2) f[0];
      
         f1.inicializar( f2.c1.damex(), f2.c1.damey(), nl, nl * 4 );
      
      f[0] = f11;    
     }
     else
         if ( f[0] instanceof figura4 )
         {
               nuevax1 = f4.dameDifx();
               nuevay1 = f4.dameDify();
            
         f4 = (figura4) f[0];
      
            f7.inicializar( f4.c2.damex(), f4.c1.damey(), nuevax1 * 2, nuevay1 * 3 );
      
         f[0] = f7;    
         }
         else
             if ( f[0] instanceof figura7 )
             {
                 nuevax1 = f7.dameDifx();
                 nuevay1 = f7.dameDify();
            
           f7 = (figura7) f[0];
      
              f6.inicializar( f7.c2.damex(), f7.c1.damey(), nuevax1 * 3, nuevay1 * 2 );
      
           f[0] = f6;    
             }
             else
                 if ( f[0] instanceof figura6 )
                 {
                       nuevax1 = f6.dameDifx();
                       nuevay1 = f6.dameDify();
            
                 f6 = (figura6) f[0];
                 
                 f5.inicializar( f6.c1.damex(), f6.c1.damey(), nuevax1 * 2, nuevay1 * 3 );                                  
      
                 f[0] = f5;    
                  }
                  else
                      if ( f[0] instanceof figura5 )
                      {
                          nuevax1 = f5.dameDifx();
                          nuevay1 = f5.dameDify();
            
                    f5 = (figura5) f[0];
      
                       f4.inicializar( f5.c1.damex(), f5.c1.damey(), nuevax1 * 3, nuevay1 * 2 );
      
                    f[0] = f4;    
                      }
                      //**********************
                      //
                     else
          
              if ( f[0] instanceof figura8 )
         {
               nuevax1 = f8.dameDifx();
               nuevay1 = f8.dameDify();
            
         f8 = (figura8) f[0];
      
            f11.inicializar( f8.c2.damex(), f8.c1.damey(), nuevax1 * 3, nuevay1 * 2 );
      
         f[0] = f11;    
         }
          else
          
              if ( f[0] instanceof figura11 )
         {
               nuevax1 = f11.dameDifx();
               nuevay1 = f11.dameDify();
            
         f11 = (figura11) f[0];
      
            f10.inicializar( f11.c2.damex(), f11.c1.damey(), nuevax1 * 2, nuevay1 * 3 );
      
         f[0] = f10;    
         }
          else
          
              if ( f[0] instanceof figura10 )
         {
               nuevax1 = f10.dameDifx();
               nuevay1 = f10.dameDify();
            
         f10 = (figura10) f[0];
      
            f9.inicializar( f10.c2.damex(), f10.c1.damey(), nuevax1 * 3, nuevay1 * 2 );
      
         f[0] = f9;    
         }
          else
          
              if ( f[0] instanceof figura9 )
         {
               nuevax1 = f9.dameDifx();
               nuevay1 = f9.dameDify();
            
         f9 = (figura9) f[0];
      
            f8.inicializar( f9.c2.damex(), f9.c1.damey(), nuevax1 * 2, nuevay1 * 3 );
      
         f[0] = f8;    
         }
         //////////
         
  
         
             
       
    
    repaint();
   }
   
   public void moverabajo( int nx )
   {
    f[0].moverabajo( nx );
    repaint();
   }
   
   public void paint( Graphics g ) 
   {
      g.setColor( f[0].c1.dameColor() );
      
      g.drawRect( f[0].c1.damex(), f[0].c1.damey(), f[0].c1.damex2(), f[0].c1.damey2() );      
      g.drawRect( f[0].c2.damex(), f[0].c2.damey(), f[0].c2.damex2(), f[0].c2.damey2() );
      g.drawRect( f[0].c3.damex(), f[0].c3.damey(), f[0].c3.damex2(), f[0].c3.damey2() );
      g.drawRect( f[0].c4.damex(), f[0].c4.damey(), f[0].c4.damex2(), f[0].c4.damey2() );
   }
}