package ar.edu.ort.tp1.examen.clases;

public interface Depositante<T, K> {
	/**
	 * Agrega un elemento al deposito.
	 * @param t elemento a depositar
	 * @throws Exception 
	 */
	public void depositar(T elemento) throws Exception;
	
	/**
	 * Retira un elemento del deposito, en base a su ID
	 * @param id
	 * @return
	 */
	public T retirarPorId(K id);
}
