package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {

	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;

	public Gato(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, estado, vacuna, peso);
		
	}

	@Override
	public void comer(double comida) {
		// TODO Auto-generated method stub
		super.comer(comida, MULT_ALIMENTACION);
		
	}

	@Override
	public void defecar() {
		// TODO Auto-generated method stub
		System.out.println("Ya fui al bano recoje mis cosas humano");
		actualizarPeso(PORC_DESC_PESO);
	}
	
}
