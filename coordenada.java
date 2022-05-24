class coordenada{
	public 
		int x1, y1;
	
		public coordenada()
	    {
			x1 = 10;
			y1 = 10;
		}
		
		public coordenada( int nx, int ny )
		{
			x1 = nx;
			y1 = ny;
			//System.out.println("Constructor coordenada.");
		}
		
		public void inicializar( int nx, int ny )
		{
			x1 = nx;
			y1 = ny;
		}
		
		public int damex()
	    {
		  return x1;
		}
		
		public int damey()
		{
		  return y1;
		}
}