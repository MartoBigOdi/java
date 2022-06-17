/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Un producto
 */
public abstract class Producto {

	/**
	 * Atributos, Completar
	 */

	/**
	 * Constructor del pedido, recibe sus atributos como parámetro
	 * 
	 * @param familiaProducto {@link FamiliaProducto}
	 * @param nombre          {@link String} con el nombre
	 * @param precio          {@link Float} con su precio
	 */
	public Producto(FamiliaProducto familiaProducto, String nombre, float precio) {
		// completar
	}

	public float getPrecio(TipoPedido tipoPedido) {

		// Completar
		return 0f;
	}

}
