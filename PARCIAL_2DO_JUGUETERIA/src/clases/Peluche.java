package clases;


public class Peluche extends Juguete implements Mostrable {
	
	private static final String MSG_MODELO_INVALIDO = "El modelo no puede ser Null";
	private static final String MSG_PELUCHE = "El peluche cuesta %.2f es de modelo %s es de la marca %s y tiene un id %d\n";
	private String modelo;
	
	
	public Peluche(int id, String marca, String modelo, double precio) throws RuntimeException {
		super(id, marca, precio);
		setModelo(modelo);
	}
	
	
	private void setModelo(String modelo) throws RuntimeException {
		if (modelo == null || modelo.isEmpty()) {
			throw new RuntimeException(MSG_MODELO_INVALIDO);
		}
			this.modelo = modelo;
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	
	
	@Override
	public void mostrar() {
		System.out.printf(MSG_PELUCHE, this.getPrecio(), this.getModelo(), this.getMarca() ,this.getId());
	}
	

}
