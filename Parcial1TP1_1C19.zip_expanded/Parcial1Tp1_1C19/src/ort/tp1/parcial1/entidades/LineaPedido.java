/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Línea de un pedido, incluye el producto y la cantidad del mismo
 */
public class LineaPedido {

//completar atributos

	/**
	 * Constructor de la entidad
	 * 
	 * @param producto {@link Producto} contenido en la línea.
	 * @param cantidad {@link Integer} representando la cantidad de producto de la
	 *                 línea
	 */
	public LineaPedido(Producto producto, int cantidad) {
//completar
	}

	/**
	 * Devuelve le precio de una linea de pedido
	 * 
	 * @param tipo {@link TipoPedido} para calular el precio
	 * @return {@link Float} con el precio de la línea
	 */
	public float getPrecioLineaPedido(TipoPedido tipo) {
		// completar
		return 0f;
	}

	/**
	 * Agraga la cantidad indicada de producto a la {@link LineaPedido}
	 * 
	 * @param cantidad {@link Integer} con la cantidad a agregar (debe ser positivo,
	 *                 si no, no agrega)
	 */
	public void adicionarCantidad(int cantidad) {
		// completar
	}
}
