package Vehiculos;

public class Prueba extends Vehiculo  {

	public Prueba(byte numRuedas) {
		super(numRuedas);
		// TODO Auto-generated constructor stub
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motocicleta m1=new Motocicleta("azul");
		m1.verMoto();
		
		Vehiculo n1=new Vehiculo("verde");
		n1.verVehiculo();
		
		Camion b1=new Camion("rojo");
		b1.verCamion();
	}

}
