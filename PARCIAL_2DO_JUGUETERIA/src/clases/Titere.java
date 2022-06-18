package clases;

public class Titere extends Juguete implements Mostrable{

	private static final int MIN_TAMANIO = 30;
	private static final int MAX_TAMANIO = 70;
	private static final String MSG_TAMANIO_INVALIDO = "Tamanio de titere invalido.";
	private static final String MSG_TITERE = "La titere cuesta %.2f tiene un tamanio de %d cm es de la marca %s y tiene un id %d\n";
	private int tamanio;
	
	
	public Titere(int id, String marca, int tamanio, double precio) throws RuntimeException {
		super(id, marca, precio);
		setTamanio(tamanio);
	}
	
	//FIXME no usa constantes.
	//RESUELTO
	private void setTamanio(int tamanio) throws RuntimeException {
		if(tamanio < MIN_TAMANIO || tamanio > MAX_TAMANIO) {
			throw new RuntimeException(MSG_TAMANIO_INVALIDO);
		}
			this.tamanio = tamanio;
	}
	
	
	public double getTamanio() {
		return this.tamanio;
	}
	
	
	@Override
	public void mostrar() {
		System.out.printf(MSG_TITERE, this.getPrecio(), this.getTamanio(), this.getMarca(), this.getId());
		
	}
	
	
	
	
	
}