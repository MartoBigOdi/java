/**
 * 
 */
package ort.tp1.parcial1.entidades;

import java.util.ArrayList;

/**
 * Clase que contiene un pedido generado.
 */
public class Pedido {

	/*
	 * Completar atributos
	 */

	public Pedido(TipoPedido tipo) {
	}

	/**
	 * Permite agregar un producto al pedido
	 * 
	 * @param producto El {@link Producto} a agregar.
	 * @param cantidad La cantidadd del {@link Producto} a agregar
	 */
	public void agregarProducto(Producto producto, Integer cantidad) {

		// buscar si el producto esta sumar cantidades
//		si no esta agregarlo
	}

	/**
	 * Saca un producto del pedido.
	 * 
	 * @param producto El {@link Producto} a sacar del pedido
	 * @param cantidad Cantidad del {@link Producto} a sacar del pedido
	 */
	public void sacarProducto(Producto producto, int cantidadASacar) {
//Completar
	}

	/**
	 * Devuelve el indice del producto buscado en la lista.
	 * 
	 * @param p {@link Producto}
	 * @return El indice >= 0 si encuentra el producto y -1 si no lo encuentra
	 */
	private int buscarProducto(Producto p) {
//completar
		int idx = -1;
		return idx;
	}

	/**
	 * Indica la cantidad del producto dado.
	 * 
	 * @param producto {@link Producto} cuya cantidad se desea averiguar
	 * @return {@link Integer} conteniendo la cantidad del producto en el pedido -1
	 *         si no está el producto
	 */
	private int cantidadProducto(Producto producto) {
		// completar
		return -1;
	}

	/**
	 * Devuelve una estructura conteniendo las lineas del pedido
	 * 
	 * @return un la estructura conteniendo {@link LineaPedido}s
	 */
	private Object getTablaProductosPedidos() {
		// Completar

		return null;
	}

	/**
	 * // * Calcula el importe del pedido
	 * 
	 * @return {@link Float} conteniendo el importe del pedido
	 */
	private float calcularImportePedido() {

		// Completar
		float importe = 0;
		return importe;
	}

}
