package ar.edu.ort.tp1.final2.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public abstract class Buzo implements BuceoProfundo, Bitacorado<Buceo> {

	private static final String NOMBRE_INVALIDO = "Nombre invalido";
	private static final String NACIONALIDAD_INVALIDA = "Nacionalidad invalida";
	private static final String EDAD_INVALIDA = "Un buzo no puede ser menor de edad";
	private static final int MAYORIA_EDAD = 18;
	private String nombre;
	private String nacionalidad;
	private int edad;
	//Porque dicen de que voy a ir viendo los buceos del buzo en orden cronologico, el primero que entra es el
	//primero en salir
	private Cola <Buceo> bitacora;

	
	
	/**
	 * Constructor del buzo, los buzos deben tener al menos de 18 años.
	 * 
	 * @param nombre - No puede estar vacio ni ser nulo.
	 * @param nacionalidad - No puede estar vacio ni ser nulo.
	 * @param edad debe ser valida.
	 */
	public Buzo(String nombre, String nacionalidad, int edad) throws Exception {
		//TODO A completar
		setNombre(nombre);
		setNacionalidad(nacionalidad);
		bitacora = new ColaNodos<>();
		setEdad(edad);

	}

	
	private void setNombre(String nombre) throws Exception {
		if (nombre == null || nombre.isEmpty()) {
			throw new RuntimeException(NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}

	
	private void setNacionalidad(String nacionalidad) throws Exception {
		if (nacionalidad == null || nacionalidad.isEmpty()) {
			throw new RuntimeException(NACIONALIDAD_INVALIDA);
		}
		this.nacionalidad = nacionalidad;
	}

	
	private void setEdad(int edad) throws Exception {
		if (edad < MAYORIA_EDAD) {
			throw new RuntimeException(EDAD_INVALIDA);
		}
		this.edad = edad;
	}

	
	public String getNombre() {
		return nombre;
	}

	
	public String getNacionalidad() {
		return nacionalidad;
	}

	
	public int getEdad() {
		return edad;
	}

	
	@Override
	public String toString() {
		return "Buzo [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + "]";
	}

	
	@Override
	public int cantidadDeEventos() {
		int contador = 0;
		//Centinela
		Buceo buceo = null;
		//Lo agregamos a la Cola
		this.bitacora.add(buceo);
		//Creo el auxiliar para ir comparando Buceo
		Buceo buceoAux = bitacora.remove();
		
		while(buceoAux != buceo) {
			//Proceso lo que necesito
			contador++;
			bitacora.add(buceoAux);
			//Saco el aux de la Cola
			buceoAux = bitacora.remove();
		}
		return contador;
	}
	
	

	public abstract boolean habilitado(int metros);

	
	
	@Override
	public void agregarABitacora(Buceo buceo) {
		bitacora.add(buceo);
	}
	
	
}
