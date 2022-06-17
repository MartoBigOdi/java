/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.exceptions.EstacionamientoException;

/**
 * Representa una motocicleta a ser estacionada. el precio de los autos se
 * fracciona cada 5 minutos.
 */
public class Motocicleta extends Vehiculo {

	// TODO COMPLETAR

	/**
	 * Constructor de motocicleta
	 * 
	 * @param patente       patente de la motocicleta
	 * @param horaIngreso   hora del ingreso
	 * @param precioPorHora precio de la hora completa de las motocicletas
	 */
	public Motocicleta(String patente, Hora horaIngreso, float precioPorHora) {
//		TODO COMPLETAR
	}

	/**
	 * Valida que una patente sea válida para el tipo de vehiculo auto. debe tener
	 * formato de tres números y tres letas por ejemplo '182ABC'.
	 */
	public void validarPatente(String patente) throws EstacionamientoException {

		// TODO COMPLETAR
		// FORMA DE VERIFICAR QUE LA PATENTE TIENE EN FORMATO CORRECTO
//		patente.matches(TipoVehiculo.MOTOCICLETA.getRegex())

	}

	/**
	 * Calcula el importe de la estadia del auto, recibiendo la hora y minutos de
	 * salida. Debe redondearse a 5 minutos la cantidad de minutos de la estadía, si
	 * la duración da 12 minutos, se deben cobrar 15. si la duración da 7 minutos,
	 * se deben cobrar 10.
	 */

	@Override
	public float calcularImporte(Hora horaEgreso) throws IllegalArgumentException {
//TODO COMPLETAR
		float importe = 0;
		return importe;
	}

}
