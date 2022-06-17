package ar.edu.ort.tp1.tp6Ej1;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;
import ar.edu.ort.tp1.tp6Ej1.clases.FabricanteDePelotas;
import ar.edu.ort.tp1.tp6Ej1.clases.PelotaDeTenis;
import ar.edu.ort.tp1.tp6Ej1.clases.TuboPelotasDeTenis;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Obtener un tubo de pelotas de tenis del Fabricante
		TuboPelotasDeTenis tuboDePelotas = FabricanteDePelotas.fabricarTubo();

		// Sacar una pelota del tubo, usara una vez y volverla la guardar.
		PelotaDeTenis pelota = tuboDePelotas.extraer();
		pelota.usar();
		tuboDePelotas.guardar(pelota);
		
		// Desarrollar el metodo nombrado a continuacion.
		// Debe quedar tal como estaba al recibirlo.
		listarContenidoTubo(tuboDePelotas);
	}

	
	//Listamos los elementos de la pila y los dejamos como estaban originalmente
	private static void listarContenidoTubo(TuboPelotasDeTenis tuboDePelotas) {
		// TODO completar
		TuboPelotasDeTenis tuboDePelotasAux = new TuboPelotasDeTenis(5);
		int cont = 0;
		
		while(!tuboDePelotas.estaVacio()) {
			PelotaDeTenis s = tuboDePelotas.extraer();
			//Proceso lo que necesito
			cont ++;
			System.out.println(s);
			tuboDePelotasAux.guardar(s);
		}
		
		while(!tuboDePelotasAux.estaVacio()) {
			
			tuboDePelotas.guardar(tuboDePelotasAux.extraer());
		}
		
		
	}

}
