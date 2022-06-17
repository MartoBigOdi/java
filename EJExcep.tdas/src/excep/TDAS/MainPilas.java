package excep.TDAS;
/*
 * Agregamos la dependencia de las TDAS
 */

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class MainPilas {

	public static void main(String[] args) {

		Pila <String> miPila = new PilaNodos<>();

		//Instanciamos con limite 2
		Pila <String> miPilaConLimite = new PilaNodos<>(2);

		//Muestra una Exception de RunTime porque la Pila esta vacia. Se tiene que tratar con try y catch.
		try {
			String s = miPila.pop();
			System.out.println(s);

		} catch (RuntimeException e) {
			System.out.println("Error al cargar el elemento: " + e.getMessage());
		}

		//Agregamos elementos a la pila, se podria manejar con try y catch tambien
		miPila.push("Marto");
		miPila.push("Pablo");
		miPila.push("Cali");

		//Agregamos elementos a la pila con limite
		miPilaConLimite.push("Tini");
		miPilaConLimite.push("Guada");

		try {
			miPilaConLimite.push("Greta");
		} catch(RuntimeException e) {
			System.out.println("Error al cargar el elemento: " + e.getMessage());
		}


		//Muestra direccion en la memoria
		System.out.println("Como se ve la pila en un syso: "+miPila);

		//Saca el ultimo elemento que agregamos
		String s = miPila.pop();
		System.out.println(s);

		System.out.println("Mostramos 'Pablo' porque el pop anterior borro de la Pila a 'Cali'");

		//Muestra el ultimo que agregamos
		String s2 = miPila.peek();
		System.out.println(s2);

		//Saca el ultimo elemento
		String s3 = miPila.pop();
		System.out.println(s3);

		//Probamos si esta vacia
		System.out.println("La pila esta vacia: " + miPila.isEmpty());

		/* Probamos si esta llena, pero esto siempre da "false"
		 *  Porque no le indicamos limite al momento de crear la Pila.
		 *  Pila <String> miPila = new PilaNodos<>(NO LE INDICAMOS LIMITE); 
		 */
		System.out.println("La pila esta llena: " + miPila.isFull());

		/*
		 * Da True porque le indicamos el limite y le agregamos los valores previo a 
		 * corroborar
		 */
		System.out.println("La pila esta llena: " + miPilaConLimite.isFull());


		String s4 = miPila.pop();
		System.out.println(s4);

		//Probamos si esta vacia
		System.out.println("La pila esta vacia: " + miPila.isEmpty());
		
		
		System.out.println("--------------- Mostramos miPilaConLimite.peek() Muestra ultimo elemento agregado -----------------------");
		//Muestra el ultimo elemento sin sacarlo
		String s5 = miPilaConLimite.peek();
		System.out.println(s5);


		System.out.println("--------------- Mostramos con contador de elementos la PILA -----------------------");
		mostrarCantElementosPila(miPilaConLimite);
		
		
		System.out.println("--------------- Mostramos elementos de la PILA en orden cronologico, original -----------------------");
		mostrarElementosPilaOrdenCronologico(miPilaConLimite);
		
		
		System.out.println("--------------- Mostramos elementos de la PILA en orden inverso, al reves -----------------------");
		mostrarElementosPilaOrdenALReves(miPilaConLimite);


		System.out.println("--------------- Busqueda de un elemento en la PILA -----------------------");
		//Busqueda de un elemento devolvemos un boolean
		System.out.println(estaElemento(miPilaConLimite, "Guada"));
		
		
		
		System.out.println("--------------- Mostramos con contador de elementos la PILA -----------------------");
		mostrarCantElementosPila(miPilaConLimite);
	}


	
	//Buscamos, devolvemos un boolean y devolvemos la PILa original
	private static boolean estaElemento(Pila<String> miPilaConLimite, String buscado) {
		
		boolean esta = false;
		Pila <String> pilaAux = new PilaNodos<>();
		
		while(!miPilaConLimite.isEmpty() && !esta) {
			String s = miPilaConLimite.pop();	
			//Proceso busqueda
			esta = s == buscado; //Si son iguales me queda TRUE sino FALSE
			pilaAux.push(s);
		}
		
		while(!pilaAux.isEmpty()) {
			String s = pilaAux.pop();	
			miPilaConLimite.push(s);
		}
		
		return esta;
	}
	


	//Metodo para mostrar la cantidad de elementos.
	//Sirve para el jercicio 1 del TP
	public static void mostrarCantElementosPila(Pila <String> pila) {
		//Tenemos una Pila AUX para guardar lo elementos temporalmente	
		Pila <String> pilaAux = new PilaNodos<>();
		int cont = 0;

		//Vaciamos la pila original y pasamos a PilaAux
		while(!pila.isEmpty()) {
			String s = pila.pop();
			//Proceso lo que necesito
			//System.out.println(s); //Aca mostramos por orden al revez. ESTO LO PIDEN EN EL PARCIAL
			cont ++;
			pilaAux.push(s);
		}
		//Volvemos a la Pila original una vez hecho el proceso necesario.
		while(!pilaAux.isEmpty()) {
			//String s = pilaAux.pop();
			//pila.push(s);
			//System.out.println(s); //Aca mostramos por orden original / cronologico. ESTO LO PIDEN EN EL PARCIAL
			pila.push(pilaAux.pop());
		}

		System.out.println("Cantidad de elementos: " + cont);
	}

	
	//Mostramos en orden de ingreso, cronologico.
	//O al reves si lo piden
	public static void mostrarElementosPilaOrdenCronologico(Pila <String> pila) {
		//Tenemos una Pila AUX para guardar lo elementos temporalmente	
		Pila <String> pilaAux = new PilaNodos<>();

		//Vaciamos la pila original y pasamoa a PilaAux
		while(!pila.isEmpty()) {
			String s = pila.pop();
			//Proceso lo que necesito
			//System.out.println(s); //Aca mostramos por orden al revez. ESTO LO PIDEN EN EL PARCIAL
			pilaAux.push(s);
		}
		//Volvemos a la Pila original una vez hecho el proceso necesario.
		while(!pilaAux.isEmpty()) {
			String s = pilaAux.pop();
			pila.push(s);
			System.out.println(s); //Aca mostramos por orden original / cronologico. ESTO LO PIDEN EN EL PARCIAL
		}

	}
	
	
	
	//Mostramos en orden inverso al original.
		public static void mostrarElementosPilaOrdenALReves(Pila <String> pila) {
			//Tenemos una Pila AUX para guardar lo elementos temporalmente	
			Pila <String> pilaAux = new PilaNodos<>();

			//Vaciamos la pila original y pasamoa a PilaAux
			while(!pila.isEmpty()) {
				String s = pila.pop();
				//Proceso lo que necesito
				System.out.println(s); //Aca mostramos por orden al revez. ESTO LO PIDEN EN EL PARCIAL
				pilaAux.push(s);
			}
			//Volvemos a la Pila original una vez hecho el proceso necesario.
			while(!pilaAux.isEmpty()) {
				String s = pilaAux.pop();
				pila.push(s);
				//System.out.println(s); //Aca mostramos por orden original / cronologico. ESTO LO PIDEN EN EL PARCIAL
			}

		}
		
		
		



}
