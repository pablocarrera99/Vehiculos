package Vehiculos;

public class Vehiculo {

		private String color;
		private byte numeroRuedas;
		private short cilindrada;
		private short potencia;

		public Vehiculo (String col)
		{
			this.color = col;
		}

		public Vehiculo (byte numRuedas)
		{
			this.numeroRuedas = numRuedas;
		}

		public Vehiculo (short cilin) 
		{
			this.cilindrada = cilin;
		}

		public Vehiculo (String col, byte numRuedas) 
		{
			this.color = col;
			this.numeroRuedas = numRuedas; 
		}

		public Vehiculo (String col, byte numRuedas, short cilin) 
		{
			this.color = col;
			this.numeroRuedas = numRuedas;
			this.cilindrada = cilin;
		} 

		public Vehiculo (String col, byte numRuedas, short cilin, short pot)
		{
			this.color = col;
			this.numeroRuedas = numRuedas;
			this.cilindrada = cilin;
			this.potencia = pot;
		}


		public String getColor ( ) 
		{
			return color;
		}
		
		public byte getNumRuedas ( ) 
		{
			return numeroRuedas;
		} 
		
		 public short getCilindrada ( )
		 {
			 return cilindrada;
		 }

		 public short getPotencia ( ) 
		 {
			 return potencia;
		 }

		 public void setColor (String col) 
		 {
			 this.color = col;
		 } 
		 public void setNumeroRuedas (byte numRuedas) 
		 {
			 this.numeroRuedas = numRuedas;
		 } 
		 
		 protected void verVehiculo() {
				System.out.println("El vehiculo es de color "+getColor());
				System.out.println("Tiene "+getNumRuedas()+" numero de ruedas");
				System.out.println("Con una cilindrada de"+getCilindrada());
				System.out.println("Y una potencia de"+getPotencia());
				//System.out.println("Tiene "+getnumeroPlazas+" numero de plazas");
			}
			
}


