package ar.edu.ort.tp1.examen.clases;

public abstract class Producto implements Mostrable {
	private static final String MSG_MARCA_INVALIDA = "La marca no puede ser nula ni vacía";
	private static final String MSG_ID_INVALIDO = "El id no puede ser menor a 1";

	private static final String MSG_MOSTRABLE =  "%s depositad@ id: %d";

	private int id;
	private String marca;
	private float costo = 123.2f;

	/**
	 * Constructor
	 * 
	 * @param id    debe ser mayor o igual a 1
	 * @param marca no ser nulo ni vacío.
	 */
	public Producto(int id, String marca) throws RuntimeException {
		setId(id);
		setMarca(marca);
	}

	private void setMarca(String marca) throws RuntimeException {
		if (marca == null || marca.isEmpty()) {
			throw new RuntimeException(MSG_MARCA_INVALIDA);

		}

		this.marca = marca;
	}

	private void setId(int id) throws RuntimeException {
		if (id < 1) {
			throw new RuntimeException(MSG_ID_INVALIDO);
		}

		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void mostrarDepositado() {
		System.out.printf(MSG_MOSTRABLE, this.getClass().getSimpleName(), this.getId());
	}

	public String getMarca() {
		return marca;
	}

	public float getCosto() {
		return costo;
	}
}
