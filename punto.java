import java.awt.*;

class punto extends coordenada{
 private  Color color;
   
 public punto()
 {
  super();
    //System.out.println("Constructor punto.");
    color = Color.blue;
 }

 public punto( int nx, int ny )
 {
  super( nx, ny );
    //System.out.println("Constructor punto.");
    color = Color.blue;
 }  
   public void inicializar(int nx, int ny, Color nc )
   {
    super.inicializar(nx,ny);
    color = nc;
   }
   
   public Color dameColor()
   {
    return color;
   }
   
   public void  ponColor(Color c)
   {
    color = c;
   }
   
   public void muestra()
   {
   // System.out.println("Dibuja un punto en [" + super.damex() + "," + super.damey() + "].");
     
   }
   
   public  void oculta(  )
   {
    //System.out.println("Oculta un punto.");
    
   }
   
   public void mueve(int npx, int npy )
   {
     inicializar( npx, npy, color );

   }
}



