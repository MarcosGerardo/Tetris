/**
 * @(#)figura.java
 *
 *
 * @author 
 * @version 1.00 2010/9/22
 */


public abstract  class figura {
	
	protected int numeroFigura;
	protected cuadros c1, c2, c3, c4;
    protected int difx, dify;

    public figura() {
    	c1 = new cuadros();
    	c2 = new cuadros();
    	c3 = new cuadros();
    	c4 = new cuadros();
    }
    
    public figura(int nx1, int ny1, int nx2, int ny2 )
    {
    	c1 = new cuadros( nx1, ny1, nx2, ny2 );
    	c2 = new cuadros( nx1, ny1, nx2, ny2 );
    	c3 = new cuadros( nx1, ny1, nx2, ny2 );
    	c4 = new cuadros( nx1, ny1, nx2, ny2 );
    }
    
    public void ponFigura( int nf )
    {
    	numeroFigura = nf;
    }
    
    public int dameFigura()
    {
    	return numeroFigura;
    }
    
    public abstract void inicializar( int nx1, int ny1, int nx2, int ny2 );
   
    public abstract void moverizquierda( int np );
    
    public abstract void moverderecha( int np );
    
    public abstract void moverabajo( int np );
    
    //public abstract void rotar();
        
    public void ponDifx( int nl )
    {
    	difx = nl;
    }
    
    public int dameDifx()
    {
    	return difx;
    }   
    
    public void ponDify( int nl )
    {
    	dify = nl;
    }
    
    public int dameDify()
    {
    	return dify;
    }
}
