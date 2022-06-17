package ar.edu.ort.tp1.examen.clases;

public class Deposito implements Depositante<Producto, Integer> {

	private static final String MSG_TIPO_PROD_INVALIDO = "Tipo de producto inv�lido";
	private static final String MSG_NO_PUDO_DEPOSITAR = "No se pudo depositar el producto.";
	private static final String MSG_PROF_INVALIDO = "Profundidad de estanter�a inv�lido";
	private static final int ALTO_ESTANTERIA = 3;
	private static final int ANCHO_ESTANTERIA = 4;
	private static final int PROFUNDIDAD_ESTANTERIA_MAX = 10;
	private static final int PROFUNDIDAD_ESTANTERIA_MIN = 2;
	private static final int FILA_PELOTA = 0;
	private static final int FILA_RAQUETA = 1;
	private static final int FILA_BOLSO = 2;
	private Estante[][] estantes;
	private ListaDeProductosPorId listaOrdenadaId;

	
	
	public Deposito(int profundidadEstanteria) {
		//Esto solo por ahora
		setProfundidad(profundidadEstanteria);
		listaOrdenadaId = new ListaDeProductosPorId();
	}


	//Primero Validamos y lanzamos la Exception
	//Luego tenemos que poblar la estanteria con "Estantes",
	//Reccorriendo la matriz y haciendo instancias de "Estante" en cada posicion con 
	//Doble for
	private void setProfundidad(int profundidadEstanteria) {
		if(profundidadEstanteria < PROFUNDIDAD_ESTANTERIA_MIN || profundidadEstanteria > PROFUNDIDAD_ESTANTERIA_MAX) {
			throw new RuntimeException(MSG_PROF_INVALIDO);
		} 
		this.estantes = new Estante[ALTO_ESTANTERIA][ANCHO_ESTANTERIA];
		
		//Como es dos dimensiones para no confundirse utilizamos directo las FINALS que tenemos 
		//Dimensiones
		for(int i = 0; i < ALTO_ESTANTERIA; i++) {
			for(int j = 0; j < ANCHO_ESTANTERIA; j++) {
				//Creamos los Estantes dentro de la matriz con el parametro de Profundidad
				estantes[i][j] = new Estante(profundidadEstanteria);
			}
		}
	}


	
	//Depositar hace el instanceof para ver que FILA 
	//UTILIZAR 
	@Override
	public void depositar(Producto elemento) throws Exception {
		
		if(elemento instanceof Raqueta) {
			
				this.depositarProductoFila(elemento, FILA_RAQUETA);
			
		} else if (elemento instanceof Bolso) {
			
				this.depositarProductoFila(elemento, FILA_BOLSO);
		
		} else {
				this.depositarProductoFila(elemento, FILA_PELOTA);
		}
	}

	
	
	
	/**
	 * Deposita el producto recibido en la estanter�a, en la fila que le corresponde
	 * seg�n su producto, en el el primer estante que tenga lugar.
	 */
	//Recibimos el elemento y la fila a utilizar
	private void depositarProductoFila(Producto elemento, int fila) throws Exception {
		
		int columna = 0;
		boolean depositado = false;
		
		while(columna < estantes[fila].length && !depositado) {
			//Metemos en un try catch para manejar la exception que nos tire si no pasa el push()
			try {
				//buscamos el estante para poder agregar el producto 
				//con estante.depositar() que teneiamos
				Estante estante = estantes[fila][columna];
				estante.depositar(elemento);
				//modificamos la bandera
				depositado = true;
				listaOrdenadaId.add(elemento);
			} catch(RuntimeException e) {
			}
			columna++;
		}
		
		if(!depositado){
			throw new Exception(MSG_NO_PUDO_DEPOSITAR);
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
		
		//Hacemos una busqueda con doble while para encontrar el prodcuto
		while(fila < estantes.length && productoEncontrado == null) {
			while(columna < estantes[fila].length && productoEncontrado == null) {
				//Accedemos al elemento para comparar
				productoEncontrado = estantes[fila][columna].retirarPorId(id);
				
				columna ++;
			}
			fila ++;
		}
		
		//Preguntamos si no es null y lo sacamos de la lista ordenada con su ID
		if(productoEncontrado != null) {
			
			listaOrdenadaId.removeByKey(productoEncontrado.getId());
		}
		
		return productoEncontrado;
	}
	
	
	
	/**
	 * Indica si un producto se encuentra depositado
	 * @param idProducto
	 * @return
	 */
	public boolean productoDepositado(Integer idProducto) {
	
		return listaOrdenadaId.search(idProducto) != null;
	}
	
	

	
}