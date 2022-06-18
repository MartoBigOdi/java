package ar.edu.ort.tp1.examen.clases;

public class Raqueta extends Producto {

	private static final String MSG_TAMANIO_ARO_INVALIDO = "Tamaño de aro inválido.";
	private static final String MSG_RAQUETA = 
			"La raqueta tiene un tamaño de aro %d es de la marca %s y tiene un id %d\n";

	public static final int MINIMO = 93;
	public static final int MAXIMO = 120;

	private int tamanioDeAro;

	public Raqueta(int id, String marca, int tamanioDeAro) throws RuntimeException {
		super(id, marca);
		setTamanio(tamanioDeAro);
	}

	private void setTamanio(int tamanioDeAro) throws RuntimeException {
		if (tamanioDeAro < MINIMO || tamanioDeAro > MAXIMO) {
			throw new RuntimeException(MSG_TAMANIO_ARO_INVALIDO);
		}

		this.tamanioDeAro = tamanioDeAro;
	}

	@Override
	public void mostrar() {
		System.out.printf(MSG_RAQUETA, tamanioDeAro, getMarca(), getId());
	}
}
