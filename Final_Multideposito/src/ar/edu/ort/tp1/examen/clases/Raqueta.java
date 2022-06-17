package ar.edu.ort.tp1.examen.clases;

public class Raqueta extends Producto {

	private static final String MSG_TAMANIO_ARO_INVALIDO = "Tama�o de aro inv�lido.";
	private static final String MSG_RAQUETA = 
			"La raqueta tiene un tama�o de aro %d es de la marca %s y tiene un id %d\n";
	
	private int tamanioAro;

	public Raqueta(int id, String marca, int tamanioAro) throws Exception {
		super(id, marca);
		setTamanio(tamanioAro);
	}
	
	
	
	private void setTamanio(int tamanioAro) throws Exception {
		if(tamanioAro > 120 || tamanioAro < 93) {
			throw new Exception(MSG_TAMANIO_ARO_INVALIDO);
		} 
			this.tamanioAro = tamanioAro;
		
	}
	
	
	public int getTamanioAro() {
		return this.tamanioAro;
	}
	
	
	public void getInfo() {
		System.out.printf(MSG_RAQUETA, this.getTamanioAro(), this.getMarca(), this.getId());
	}
	
}
