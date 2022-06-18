package ar.edu.ort.tp1.examen.clases;

public class Deposito implements Depositante<Producto, Integer> {

	private static final String MSG_NO_PUDO_DEPOSITAR = "No se pudo depositar el producto.";
	private static final String MSG_PROF_INVALIDO = "Profundidad de estantería inválido";
	private static final int ALTO_ESTANTERIA = 3;
	private static final int ANCHO_ESTANTERIA = 4;
	private static final int PROFUNDIDAD_ESTANTERIA_MAX = 10;
	private static final int PROFUNDIDAD_ESTANTERIA_MIN = 2;
	private static final int FILA_PELOTA = 0;
	private static final int FILA_RAQUETA = 1;
	private static final int FILA_BOLSO = 2;

	private Estante[][] estantes;
	private ListaDeProductosPorId listaDeProductosPorId = new ListaDeProductosPorId();

	// TODO Completar
	public Deposito(int profundidadEstanteria) {
		setEstantes(profundidadEstanteria);
	}

	private void setEstantes(int profundidadEstanteria) {
		if(profundidadEstanteria < PROFUNDIDAD_ESTANTERIA_MIN || profundidadEstanteria > PROFUNDIDAD_ESTANTERIA_MAX) {
			throw new RuntimeException(MSG_PROF_INVALIDO);
		}

		this.estantes = new Estante[ALTO_ESTANTERIA][ANCHO_ESTANTERIA];

		for (int i = 0; i < ALTO_ESTANTERIA; i++) {
			for (int j = 0; j < ANCHO_ESTANTERIA; j++) {
				this.estantes[i][j] = new Estante(profundidadEstanteria);
			}
		}
	}

	/**
	 * Deposita el producto recibido en la estantería, en la fila que le corresponde
	 * según su producto, en el el primer estante que tenga lugar.
	 */
	@Override
	public void depositar(Producto producto) {
		if (producto instanceof Raqueta) {
			this.depositarProductoPorFila(producto, FILA_RAQUETA);
		} else if (producto instanceof Pelota) {
			this.depositarProductoPorFila(producto, FILA_PELOTA);
		} else {
			this.depositarProductoPorFila(producto, FILA_BOLSO);
		}

		listaDeProductosPorId.add(producto);
	}

	private void depositarProductoPorFila(Producto producto, int filaDeBusqueda) {
		int columna = 0;
		boolean depositado = false;

		while (columna < estantes[filaDeBusqueda].length && !depositado) {
			try {
				Estante estante = estantes[filaDeBusqueda][columna];
				estante.depositar(producto);
				depositado = true;
			} catch (RuntimeException exception) {
				// siga con el while
			}

			columna++;
		}

		if (!depositado) {
			throw new RuntimeException(MSG_NO_PUDO_DEPOSITAR);
		}
	}

	/**
	 * Retira un producto en base a su ID
	 */
	@Override
	public Producto retirarPorId(Integer id) {
		Producto productoEncontrado = null;

		int fila = 0;
		int columna = 0;

		if(this.productoDepositado(id)) {
			while (fila < estantes.length && productoEncontrado == null) {
				while (columna < estantes[fila].length && productoEncontrado == null) {
					productoEncontrado = estantes[fila][columna].retirarPorId(id);
					columna++;
				}

				fila++;
			}

			if (productoEncontrado != null) {
				listaDeProductosPorId.removeByKey(productoEncontrado.getId());
			}
		}

		return productoEncontrado;
	}


	// TODO Completar

	
	/**
	 * Indica si un producto se encuentra depositado
	 * @param idProducto
	 * @return
	 */
	public boolean productoDepositado(Integer idProducto) {
		return listaDeProductosPorId.search(idProducto) != null;
	}
}
