package excep.TDAS;

public class ExcepPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Ejemplo Nombre vacio y anio de nacimiento por debajo de 1800
			Persona p = new Persona("", 100);
			System.out.println(p);
		} catch (Exception e) {					// e.getMessage() nos trae el mensaje de error que creamos con el Throw
			System.out.println("Hubo un error: " + e.getMessage());
		}

		try {
			// Ejejmplo valido de Persona
			Persona p2 = new Persona("Marto", 1987);
			System.out.println(p2);
		} catch (Exception e) {					// e.getMessage() nos trae el mensaje de error que creamos con el Throw
			System.out.println("Hubo un error: " + e.getMessage());
		}

		try {
			// Ejejmplo valido de Persona
			Persona p3 = new Persona("Camila", 2024);
			System.out.println(p3);
		} catch (Exception e) {					// e.getMessage() nos trae el mensaje de error que creamos con el Throw
			System.out.println("Hubo un error: " + e.getMessage());

		} finally {
			//Ejemplo cuando usamos una DB aca la cerramos
		}
		
	}

}
