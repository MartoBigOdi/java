package ar.edu.ort.tp1.examen.clases;

public class Bolso extends Producto {
	private static final String MODELO_DE_BOLSO_INV�LIDO = "Modelo de bolso inv�lido.";
	private static final String MSG_MODELO = 
			"El bolso es de modelo %s es de la marca %s y tiene un id %d\n";

	
	private String modelo;

	public Bolso(int id, String marca, String modelo) throws Exception {
		super(id, marca);
		setModelo(modelo);
	}
	
	
	private void setModelo(String modelo) throws Exception {
		if(modelo == null || modelo.isEmpty()) {
			throw new Exception(MODELO_DE_BOLSO_INV�LIDO);
		} 
			this.modelo = modelo;
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	
	
	public void getInfo() {
		System.out.printf(MSG_MODELO, this.getModelo(), this.getMarca(), this.getId());
	}
	

}
