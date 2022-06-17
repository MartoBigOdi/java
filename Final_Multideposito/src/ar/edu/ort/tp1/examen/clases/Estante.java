package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Estante implements Depositante<Producto, Integer> {

	
	//TODO Completar
	private Pila <Producto> productos;

	public Estante(int profundidadEstanteria) {
		
		//Le pasamos el limite de la Pila que es la "profundidad" en este caso.
		this.productos = new PilaNodos<>(profundidadEstanteria);
	}

	
	
	@Override
	public void depositar(Producto elemento){
			productos.push(elemento);
			
	}

	
	
	@Override
	public Producto retirarPorId(Integer id) {

		Producto productoBuscado = null;
		Pila<Producto> pilaAux = new PilaNodos<>();
		Producto productoAux = null;

		while (productoBuscado == null && !productos.isEmpty()) {
			productoAux = productos.pop();
			if (productoAux.getId() == id) {
				productoBuscado = productoAux;
			} else {
				pilaAux.push(productoAux);
			}
			
			while (!pilaAux.isEmpty()) {
				productos.push(pilaAux.pop());
			}
		}
		return productoBuscado;
	}
	
	
	/**
	 * Agrega un elemento al estante siempre y cuando haya lugar, sino, deber� emitir la excepci�n que corresponda..
	 */

	/**
	 * Retira el producto de la estanter�a por su id
	 */

}
