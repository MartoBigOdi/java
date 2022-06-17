package excep.TDAS;

/*
 * Representa una persona, su nombre no puede ser null o estar vacio.
 * Su anio de nacimiento no puede ser menor a 1800 ni mayor que 2022
 */

public class Persona {
	
	private String nombre;
	private int anioNac;
	
	//Manejo la excepcion con un try, catch o agregar el throw Exception a la declaracion
	public Persona(String nombre, int anioNac) throws Exception {
		super();
		setNombre(nombre);
		setAnioNac(anioNac);
		
	}

	
	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", Nac = " + anioNac + "]";
	}
	
	
	
	private void setNombre(String nombre) throws Exception {
		if (nombre == null || nombre.isEmpty()) {
			throw new Exception("Nombre no puede ser vacio o null");
		}
		this.nombre = nombre;
	}
	
	
	private void setAnioNac(int anioNac) throws Exception {
		if (anioNac < 1800 || anioNac > 2022) {
			throw new Exception("Anio de Nacimiento invalido");
		}
		this.anioNac = anioNac;
	}

}
