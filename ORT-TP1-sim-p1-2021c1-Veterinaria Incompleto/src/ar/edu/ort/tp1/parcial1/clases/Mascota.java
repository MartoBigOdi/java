package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenía mucha hambre, pero gracias";

	private static final int CIEN = 100;
	private String nombre;
	private Estado estado;
	private boolean vacuna;
	private double peso;


	public Mascota (String nombre, Estado estado, boolean vacuna, double peso) {
		this.nombre = nombre;
		this.estado = estado;
		this.vacuna = vacuna;
		this.peso = peso;
	}
	// TODO Completar

	// TODO Completar
	/**
	 * Alimenta a las mascotas de forma general. Si su estado es hambiento estará
	 * feliz y dara las gracias ya que tenía hambre Si su estado es feliz, se
	 * enfermará e indicará que comio demasiado. si estaba enfermo, dara las gracias, pero seguirá enfermo.
	 * además actualizará el peso sumando al actual la multiplicación entre la cantidad de comida recibida y un multiplicador.
	 * Finalmente indicará su estado
	 * 
	 * @param comida
	 * @param multiplicador
	 */
	
	//Protected porque solo nos interesa que lo llamen los hijos, no un clase ajena a Mascota.
	protected void comer(double comida, double multiplicador) {
		if(this.estado == Estado.HAMBRIENTO) {
			estado = Estado.FELIZ;
			System.out.println(this.getNombre() + MSG_COM_HAMBRIENTO);
		} else if (this.estado == Estado.FELIZ) {
			estado = Estado.ENFERMO;
			System.out.println(this.getNombre() + MSG_COM_FELIZ);
		} else if (this.estado == Estado.ENFERMO) {
			System.out.println(this.getNombre() + MSG_COM_ENFERMO);
		}
		
		peso += comida * multiplicador; //Actualizamos el peso.
		
		System.out.println("El estado de " + this.nombre + ": " + "es " + this.estado.getDescripcion());
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	public boolean estaVacunado() {
		// TODO Auto-generated method stub
		return this.vacuna;
	}

	public void vacunar() {
		// TODO Auto-generated method stub
		this.vacuna = true;
		
	}
	
	public boolean esTuNombre(String nombreMascota) {
		return this.getNombre().equals(nombreMascota);
	}


}
