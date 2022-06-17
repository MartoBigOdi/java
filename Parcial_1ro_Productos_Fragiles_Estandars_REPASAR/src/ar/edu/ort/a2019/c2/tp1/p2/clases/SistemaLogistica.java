package ar.edu.ort.a2019.c2.tp1.p2.clases;

import java.util.ArrayList;

public class SistemaLogistica implements Mostrable {

	/**
	 * Mensajes de validaci�n
	 */
	private static final String MSG_EL_CODIGO_NO_PUEDE_SER_NULO = "El c�digo no puede ser nulo";
	private static final String MSG_TIPO_DE_PRODUCTO_INV�LIDO = "Tipo de producto inv�lido";
	private static final String MSG_EL_PRODUCTO_NO_PUEDE_SER_NULO = "El producto no puede ser nulo";
	private static final String MSG_TAMANIO_DE_DEPOSITO_FRAGIL_INVALIDO = "Tama�o de dep�sito fr�gil inv�lido";
	private static final String MSG_TAMANIO_DE_DEPOSITO_ESTANDAR_INVALIDO = "Tama�o de dep�sito estandar inv�lido";

/*
 *TODO Completar
 */
	/**
	 * Constructor del sistema de log�stica.
	 * @param stockMaximoEstandar St�ck m�ximo a almacenar para productos est�ndar.
	 * @param stockMaximoFragil St�ck m�ximo a almacenar para productos fr�giles.
	 * @throws IllegalArgumentException en caso de que los par�metros sean inv�lidos
	 */
	
	private ArrayList<Producto> productosEstandar;
	private ArrayList<Producto> productosFragiles;
	private ArrayList<Producto> retirados;
	private int stockMaximoEstandar;
	private int stockMaximoFragil;
	//Los int no es necesario inicilizar en 0
	private int contadorEstandar;
	private int contadorFragil;
	
	
	
	public SistemaLogistica(int stockMaximoEstandar, int stockMaximoFragil) throws IllegalArgumentException {
		//TODO Completar
		this.stockMaximoEstandar = stockMaximoEstandar;
		this.stockMaximoFragil = stockMaximoFragil;
		this.productosEstandar = new ArrayList<Producto>();
		this.productosFragiles = new ArrayList<Producto>();
		this.retirados = new ArrayList<Producto>();
	}

	
	
	/**
	 * Ingresa un producto al deposito que corresponda
	 * @param p el producto a ingresar - NO DEBE SER NULO
	 * @throws RuntimeException En caso de que el producto sea nulo, de tipo inv�lido o no pueda ser agregado.
	 */
	public void ingresarProducto(Producto p) throws RuntimeException {
		//		TODO COMPLETAR
		if( p == null) {
			//Arrojamos una excepcion Con msj, como hicimos las demas anteriores.
			throw new RuntimeException(MSG_EL_PRODUCTO_NO_PUEDE_SER_NULO);
		}

		if( p instanceof ProductoEstandar) {
			//Modularizamos
			agregarProductoEstandar(p);
			
		} else if (p instanceof ProductoFragil) {
			//Modularizamos
			agregarProductoFragil(p);
			
		} else {
			throw new RuntimeException(MSG_TIPO_DE_PRODUCTO_INV�LIDO);
		}

		p.etiquetar();
		System.out.println("Se ingres� correctamente el producto");

	}



	private void agregarProductoFragil(Producto p) throws RuntimeException{
		if(this.productosFragiles.size() == stockMaximoFragil) {
			throw new RuntimeException("El deposito Fragil est� lleno");
		}
		this.productosFragiles.add(p);
		contadorFragil++;
	}



	private void agregarProductoEstandar(Producto p) throws RuntimeException{
		if(this.productosEstandar.size() == stockMaximoEstandar) {
			throw new RuntimeException("El deposito est�ndar est� lleno");
		}
		this.productosEstandar.add(p);
		contadorEstandar++;		
	}
	
	

	/**
	 * Retira un producto en base a su tipo y c�digo
	 * @param codigo Del producto a retirar
	 * @param tipo Tipo del producto a retirar
	 * @return el producto retirado
	 * @throws IllegalArgumentException en caso de que el c�digo o el tipo sean nulos
	 * @throws RuntimeException En caso de no encontrar el producto buscado.
	 */
	public Producto retirarProductoSeleccionado(String codigo, TipoProducto tipo) throws IllegalArgumentException, RuntimeException {
		//Validamos que no sea null el codigo o el tipo
		if(codigo == null || tipo == null) {
			throw new IllegalArgumentException(MSG_TIPO_DE_PRODUCTO_INV�LIDO);
		}
		Producto pEncontrado = null;
		//El "tipoProdcuto.TIPO" este enum nos ayuda a ver donde tenemos que buscar, nos ayuda a decidir
		if(tipo == TipoProducto.ESTANDAR) {
			pEncontrado = buscarProducto(codigo, this.productosEstandar);
		} else if (tipo == TipoProducto.FRAGIL) {
			pEncontrado = buscarProducto(codigo, this.productosFragiles);
		}
		if(pEncontrado == null) {
			throw new RuntimeException("Producto no encontrado");
		}
		
		this.retirados.add(pEncontrado);
		return pEncontrado;
	}
	
	
	
	private Producto buscarProducto(String codigo, ArrayList<Producto> productos) {
		Producto producto = null;
		int idx = 0;
		while(idx < productos.size() && producto == null) {
			if(productos.get(idx).esTuCodigo(codigo)) {
				producto = productos.remove(idx);
			}
			idx++;
		}
		return producto;
	}



	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Se han retirado: " + retirados.size());
		//Mirando el Main, vemos que es un for each de retirados llamando a mostrar()
		for(Producto p : retirados) {
			p.mostrar();
		}
		//Finalmente mostramos los contadores
		System.out.println("Cantidad ingresada de P.Estandar: " + contadorEstandar);
		System.out.println("Cantidad ingresada de P.Fragil: " + contadorFragil);
	}
	

}
