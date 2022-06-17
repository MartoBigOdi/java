package ort.edu.ar.clases;

public class Empresa implements Detallable {

	private String nombre;
	private  Camion [] camiones;
	private ListaOrdenadaPaquetesPrecioMenor lista;
	
	public Empresa(String nombre, int cantCamiones) {
		this.nombre =nombre;
		this.camiones = new Camion [cantCamiones];
		lista = new ListaOrdenadaPaquetesPrecioMenor();
	}

	
	
	public void agregarCamion(String patente) {
		int posLibre = obtenerPosLibre();
		if(posLibre != -1) {
			camiones[posLibre] = new Camion(patente);
		} else {
			System.out.println("NO PUEDES AGREGAR MAS CAMIONES");
		}
	}
	
	

	//Devolvemos la posicion libre del array
	private int obtenerPosLibre() {
		int posLibre =0;
		//Esta condicion tiene que ir primero sino explota
		while( posLibre < camiones.length && camiones[posLibre] != null ) {
			posLibre ++;
		}
		//Condicional para verificar si es = a camiones.length, le pasmaos -1
		//sino le pasamos la posLibre que tiene la variable
		return posLibre == camiones.length ? -1 : posLibre;
	}


	
	//Agregamos paquete al camion
	public void agregarPaquete(Paquete paquete) {
		
		boolean agregado = false;
		int i = 0;
		//Mientras i sea menor que el length del array y agregado no sea true sigo
		while(i < camiones.length && !agregado) {
			//Valido que la posicion no sea null
			if(camiones[i] != null) {
				//try para manejar el error
				try { //Adentro del try proceso lo que necesito
					camiones[i].agregarPaquete(paquete);
					agregado = true;
					//Agregamos Paquete a la lista ordenada de menor a mayor precio
					lista.add(paquete);
				} catch (RuntimeException e) {
					//System.out.println("Hubo un error: " + e.getMessage());
				}
			}//Afuera del IF hago el i++
			i++;
		}
		if(!agregado) {
			System.out.println("TODOS LOS CAMIONES ESTAN LLENOS. NO PUEDE AGREGAR PAQUETES");
		}
		
	}

	
	//Mostramos los paquetes de la lista ordenada de menor a mayor
	public void verPaquetes() {
		System.out.println("Detalle de paquetes a enviar: ");
		for (Paquete paquete : lista) {
			System.out.println(paquete);
		}
		
	}
	
	
	public void camionMayorGanancias() {
		ListaCamionesPorValorMayorGananciaAMenor listaMayorGananciaAMenor = new ListaCamionesPorValorMayorGananciaAMenor();

		for (Camion camion : camiones) {
			if (camion != null) {
				listaMayorGananciaAMenor.add(camion);
			}
		}
		if (listaMayorGananciaAMenor.size() > 0) {
			System.out.println("El camion con mas ganacia fue: " + listaMayorGananciaAMenor.get(0).toString());
		}
	}
	
	
	@Override
	public void verDetalle() {
		verPaquetes();
		camionMayorGanancias();
		
	}

}
