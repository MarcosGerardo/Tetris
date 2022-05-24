import java.awt.*;

class linea extends punto{
 private  int x2;
 private  int y2;
   
 public linea()
 {
  super();
    x2 = 20;
    y2 = 20;
    ponColor( Color.red );
 }
 
 public linea( int nx1, int ny1, int nx2, int ny2 )
 {
  super( nx1, ny1 );
    x2 = nx2;
    y2 = ny2;
    ponColor( Color.red );
 }
   
   public void inicializar(int nx, int ny, int nx2, int ny2 )
   {
    super.inicializar(nx,ny, dameColor() );
    x2 = nx2;
    y2 = ny2;
   }
   
  public int damex2()
     {
    return x2;
  }
  
  public int damey2()
  {
    return y2;
  }
  
     
   public void mueve(int npx, int npy, int npx2, int npy2 )
   {
    inicializar( npx, npy, npx2, npy2 );
   }
}



