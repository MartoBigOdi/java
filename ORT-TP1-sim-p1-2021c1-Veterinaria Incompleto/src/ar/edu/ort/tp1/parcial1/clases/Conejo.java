package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	//TODO Completar

	public Conejo(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, estado, vacuna, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer(double comida) {
		// TODO Auto-generated method stub
		super.comer(comida, MULT_ALIMENTACION);
		
	}

	@Override
	public void defecar() {
		// TODO Auto-generated method stub
		System.out.println("Ya fui al bano recoje mis pequenas cosas");
		actualizarPeso(PORC_DESC_PESO);
	}
	
}
