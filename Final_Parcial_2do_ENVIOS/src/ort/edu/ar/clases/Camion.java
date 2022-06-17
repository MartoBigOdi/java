package ort.edu.ar.clases;

import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class Camion {
	
	private static final int CAPACIDAD_MAX =3;
	private String patente;
	private Pila<Paquete> paquetes;
	

	public Camion(String patente) {
		this.patente = patente;
		this.paquetes = new PilaNodos<Paquete>(CAPACIDAD_MAX);
	}

	
	public void agregarPaquete(Paquete paquete) {
		paquetes.push(paquete);
	}

	
	public double verTotal() {

		Pila<Paquete> pilaAux = new PilaNodos<Paquete>();
		double total = 0;

		while (!paquetes.isEmpty()) {
			Paquete paquete = paquetes.pop();
			total +=paquete.getPrecio();
			pilaAux.push(paquete);
		}
		// Volvemos a la Pila original una vez hecho el proceso necesario.
		while (!pilaAux.isEmpty()) {
			paquetes.push(pilaAux.pop());
		}
		return total;
	}


	public String getPatente() {
		return patente;
	}

	@Override
	public String toString() {
		return "Ganancia: $" + verTotal() + " Patente: " + getPatente();
	}
	
	
	
	

}
