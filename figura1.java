/**
 *
 * @(#)figura1.java
 *
 *
 * @author 
 * @version 1.00 2010/9/22
 */

/*
 *La figura 1 es 00
 *               00
 *               00
 *               00
 */

public class figura1 extends figura {

    public figura1( int nx1, int ny1, int nx2, int ny2 ) 
    {
     super( nx1, ny1, nx2, ny2 );
     super.ponDifx( nx2 );
     super.ponDify( ny2 / 4 );
     super.numeroFigura = 1;
     inicializar( nx1, ny2, nx2, ny2 );
    }
    
    public void inicializar( int nx1, int ny1, int ancho, int altura )
    {
    	ponDifx( ancho );
    	ponDify( altura / 4 );
    	
    	c1.inicializar( nx1, ny1                 , ancho, dameDify() );
    	c2.inicializar( nx1, ny1 + dameDify()    , ancho, dameDify() );
    	c3.inicializar( nx1, ny1 + dameDify() * 2, ancho, dameDify() );
    	c4.inicializar( nx1, ny1 + dameDify() * 3, ancho, dameDify() );
    }
    
    public void moverizquierda( int np )
    {
    	c1.inicializar( c1.damex() - np, c1.damey(), c1.damex2(), c1.damey2() );
    	c2.inicializar( c2.damex() - np, c2.damey(), c2.damex2(), c2.damey2() );
    	c3.inicializar( c3.damex() - np, c3.damey(), c3.damex2(), c3.damey2() );
    	c4.inicializar( c4.damex() - np, c4.damey(), c4.damex2(), c4.damey2() );
    }
    
    public void moverderecha( int np )
    {
        c1.inicializar( c1.damex() + np, c1.damey(), c1.damex2(), c1.damey2() );
    	c2.inicializar( c2.damex() + np, c2.damey(), c2.damex2(), c2.damey2() );
    	c3.inicializar( c3.damex() + np, c3.damey(), c3.damex2(), c3.damey2() );
    	c4.inicializar( c4.damex() + np, c4.damey(), c4.damex2(), c4.damey2() );
    }
    
    public void moverabajo( int np )
    {
    	c1.inicializar( c1.damex(), c1.damey() + np, c1.damex2(), c1.damey2() );
    	c2.inicializar( c2.damex(), c2.damey() + np, c2.damex2(), c2.damey2() );
    	c3.inicializar( c3.damex(), c3.damey() + np, c3.damex2(), c3.damey2() );
    	c4.inicializar( c4.damex(), c4.damey() + np, c4.damex2(), c4.damey2() );
    }
    
    public void rotar()
    {
    }
}