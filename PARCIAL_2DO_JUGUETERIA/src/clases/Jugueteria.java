package clases;

public class Jugueteria implements ContenedorInteligente <Juguete, Integer>{

	private static final int ALTO_ESTANTERIA = 6;
	private static final int ANCHO_ESTANTERIA = 3;
	private static final int PROFUNDIDAD_ESTANTERIA = 4;
	private static final int FILA_PELOTA = 0;
	private static final int FILA_PELUCHE = 1;
	private static final int FILA_TITERE = 2;
	private Estante[][] estanteria;
	private ListaJuguetesPorId listaJuguetesPorId = new ListaJuguetesPorId();
	private double total;
	
	
	
	
	public Jugueteria() {
		setEstanteria();
		this.total = 0;
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
	
	

	
	public void mostrarVentas() {
		System.out.println("El total de ventas fue de: " + total);
		System.out.println("--------------------------------------------");
		
	}

	

	
	@Override
	public void guardar(Juguete juguete) {
		if (juguete instanceof Peluche) {
			this.depositarJuguetePorFila(juguete, FILA_PELUCHE);
		} else if (juguete instanceof Pelota) {
			this.depositarJuguetePorFila(juguete, FILA_PELOTA);
		} else {
			this.depositarJuguetePorFila(juguete, FILA_TITERE);
		}

		listaJuguetesPorId.add(juguete);
		total += juguete.getPrecio();
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

	
	
	
	public boolean existeJuguete(int idJuguete) {
		return listaJuguetesPorId.search(idJuguete) != null;
	}


	
	
	@Override
	public Juguete recuperarPorId(Integer id) {
		Juguete jugueteEncontrado = null;

		int fila = 0;
		int columna = 0;

		if(this.existeJuguete(id)) {
			while (fila < estanteria.length && jugueteEncontrado == null) {
				while (columna < estanteria[fila].length && jugueteEncontrado == null) {
					jugueteEncontrado = estanteria[fila][columna].recuperarPorId(id);
					columna++;
				}

				fila++;
			}

			if (jugueteEncontrado != null) {
				listaJuguetesPorId.removeByKey(jugueteEncontrado.getId());
			}
		}

		return jugueteEncontrado;
	}
	
	
	
	
	
	
	
	
	
	
	
}