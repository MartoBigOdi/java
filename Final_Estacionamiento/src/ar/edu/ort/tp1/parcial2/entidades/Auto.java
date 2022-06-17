/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.exceptions.EstacionamientoException;

/**
 * Representa un auto a ser estacionado. El precio de los autos se fracciona
 * cada 10 minutos.
 */
public class Auto extends Vehiculo {

//		TODO COMPLETAR
	/**
	 * Constructor de auto
	 * 
	 * @param patente       patente del auto
	 * @param horaIngreso   hora del ingreso
	 * @param precioPorHora precio de la hora completa de los autos
	 */
	public Auto(String patente, Hora hora, float precioPorHora) {
		// TODO: COMPLETAR
	}

	/**
	 * Valida que una patente sea válida para el tipo de vehiculo auto. debe tener
	 * formato de tres letras y tres números por ejemplo 'DSA182' o dos letras tres
	 * numeros y dos letras ejemplo 'AB123CD'
	 */
	@Override
	public void validarPatente(String patente) throws EstacionamientoException {

		// TODO COMPLETAR
		// FORMA DE VERIFICAR QUE LA PATENTE TIENE EN FORMATO CORRECTO
//		patente.matches(TipoVehiculo.AUTO.getRegex())

	}

	/**
	 * Calcula el importe de la estadia del auto, recibiendo el horario de salida.
	 * Debe redondearse a 10 minutos la cantidad de minutos de la estadía, si la
	 * duración da 7 minutos, se deben cobrar 10.
	 */
	@Override
	public float calcularImporte(Hora hora) throws EstacionamientoException {
//TODO COMPLETAR

		float importe = 0;
		return importe;
	}

}
