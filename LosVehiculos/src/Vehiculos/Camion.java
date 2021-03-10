package Vehiculos;

public class Camion extends Vehiculo {

	private byte numeroEjes;

	public Camion (String string) 
	{
		super (string);
	}

	public Camion (String color, byte numRuedas) 
	{
		super (color, numRuedas);
	}

	public Camion (String color, byte numRuedas, short cilin) 
	{
		super(color, numRuedas, cilin);
	}

	public Camion (String color, byte numRuedas, short cilin, short poten) 
	{
		super(color,numRuedas,cilin,poten);
	}

	public Camion (String col, byte numRuedas, byte numEjes, short cilin, short poten) 
	{
		super (col, numRuedas, cilin, poten);
		this.numeroEjes = numEjes;
	}
	
	

	public byte setNumeroEjes ( )
	{
		return numeroEjes;
	}

	public void getNumeroEjes (byte numEjes) 
	{
		this.numeroEjes = numEjes;
	}
	
	 protected void verCamion() {
			System.out.println("El vehiculo es de color "+getColor());
			System.out.println("Tiene "+getNumRuedas()+" numero de ruedas");
			System.out.println("Con una cilindrada de"+getCilindrada());
			System.out.println("Y una potencia de"+getPotencia());
			//System.out.println("Tiene "+getnumeroPlazas+" numero de plazas");
		}
}

