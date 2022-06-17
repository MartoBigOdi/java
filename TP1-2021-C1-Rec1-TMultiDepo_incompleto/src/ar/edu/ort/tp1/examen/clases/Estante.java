package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Estante implements Depositante<Producto, Integer> {

	private Pila<Producto> productos;

	public Estante(int profundidadEstanteria) {
		this.productos = new PilaNodos<Producto>(profundidadEstanteria);
	}

	/**
	 * Agrega un elemento al estante siempre y cuando haya lugar, sino, deberá emitir la excepción que corresponda..
	 */
	@Override
	public void depositar(Producto elemento) {
		this.productos.push(elemento);
	}

	/**
	 * Retira el producto de la estantería por su id
	 */
	@Override
	public Producto retirarPorId(Integer id) {
		Producto productoEncontrado = null;
		Producto productoConsultado = null;

		Pila<Producto> pilaAuxiliar = new PilaNodos<>();

		while (!this.productos.isEmpty() && productoEncontrado == null) {
			productoConsultado = this.productos.pop();
			if (productoConsultado.getId() == id) {
				productoEncontrado = productoConsultado;
			} else {
				pilaAuxiliar.push(productoConsultado);
			}
		}

		while (!pilaAuxiliar.isEmpty()) {
			this.productos.push(pilaAuxiliar.pop());
		}

		return productoEncontrado;
	}

}
