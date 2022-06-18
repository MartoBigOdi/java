package clases;

import parcial_2do_main.Final;

public class Jugueteria implements ContenedorInteligente <Juguete, Integer>{

	private static final int ALTO_ESTANTERIA = 6;
	private static final int ANCHO_ESTANTERIA = 3;
	private static final int PROFUNDIDAD_ESTANTERIA = 4;
	private static final int FILA_PELOTA = 0;
	private static final int FILA_PELUCHE = 1;
	private static final int FILA_TITERE = 2;
	private Estante[][] estanteria;
	private ListaJuguetesPorId listaJuguetesPorId = new ListaJuguetesPorId();
	
	
	
	
	public Jugueteria() {
		setEstanteria();
	}
	
	
	
	
	//Creamos la estanteria con las medidas que nos pasan
	private void setEstanteria() {
		this.estanteria = new Estante[ALTO_ESTANTERIA][ANCHO_ESTANTERIA];

		for (int i = 0; i < ALTO_ESTANTERIA; i++) {
			for (int j = 0; j < ANCHO_ESTANTERIA; j++) {
				this.estanteria[i][j] = new Estante(PROFUNDIDAD_ESTANTERIA);
				
			}
		}
	}
	
	

	
	//Final.total, sumamos el total de los juguetes en la compra.
	public void mostrarVentas() {
		System.out.println("El total de ventas fue de: " + Final.total);
		System.out.println("--------------------------------------------");
		
	}

	

	
	@Override
	public void guardar(Juguete juguete) {
		JugueteFila(juguete);
		listaJuguetesPorId.add(juguete);
	}


	
	/*FIXME veo código duplicado. no se podría mejorar?
	 * De esta manera profe creo que podria dejarlo un poco mejor
	 * Mejoramos el guardar()
	*/	
	private void JugueteFila(Juguete juguete) {
		if (juguete instanceof Peluche) {
			this.depositarJuguetePorFila(juguete, FILA_PELUCHE);
		} else if (juguete instanceof Pelota) {
			this.depositarJuguetePorFila(juguete, FILA_PELOTA);
		} else {
			this.depositarJuguetePorFila(juguete, FILA_TITERE);
		}
	}

	
	
	
	private void depositarJuguetePorFila(Juguete juguete, int filaDeBusqueda) {
		int columna = 0;
		boolean depositado = false;

		while (columna < estanteria[filaDeBusqueda].length && !depositado) {
			try {
				Estante estante = estanteria[filaDeBusqueda][columna];
				estante.guardar(juguete);
				depositado = true;
			} catch (RuntimeException exception) {
				//No saco nada por consola
			}
			columna++;
		}
		if (!depositado) {
			throw new RuntimeException("No se pudo guardar juguete");
		}
	}

	
	
//	FIXME debe usar el metodo exists()
	public boolean existeJuguete(int idJuguete) {
		return listaJuguetesPorId.exists(idJuguete);
		//return listaJuguetesPorId.search(idJuguete) != null;
	}


	
	
	@Override
	public Juguete recuperarPorId(Integer id) {
		Juguete jugueteEncontrado = null;

		int fila = 0;
		int columna = 0;

		//FIXME porque no intenta sacar directamente en vez de llamar 2 veces a la lista?
		//Hecho, me quedo ese defecto de verlo como una matriz y que el interno estabaa de mas no lo vi. 
		//Gracias.
		if(this.existeJuguete(id)) {
			//while (fila < estanteria.length && jugueteEncontrado == null) {
				while (columna < estanteria[fila].length && jugueteEncontrado == null) {
					jugueteEncontrado = estanteria[fila][columna].recuperarPorId(id);
					columna++;
				}

				fila++;
			}

			if (jugueteEncontrado != null) {
				listaJuguetesPorId.removeByKey(jugueteEncontrado.getId());
			}
		//}

		return jugueteEncontrado;
	}
	
	
	
	
	
	
	
	
	
	
	
}
