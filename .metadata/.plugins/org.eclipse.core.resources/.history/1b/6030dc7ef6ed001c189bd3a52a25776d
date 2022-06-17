package clases;

public abstract class Juguete implements Mostrable{
	private static final String MSG_MARCA_INVALIDA = "La marca no puede ser nula ni vacia";
	private static final String MSG_ID_INVALIDO = "El id no puede ser menor a 1";
	private int id;
	private String marca;
	private double precio;
	
	
	public Juguete(int id, String marca, double precio) throws RuntimeException {
		setId(id);
		setMarca(marca);
		setPrecio(precio);
	}
	
	
	private void setId(int id) throws RuntimeException{
		if (id < 0 || id == 0) {
			throw new RuntimeException(MSG_ID_INVALIDO);
		}
			this.id = id;
	}

	
	private void setMarca(String marca) throws RuntimeException{
		if (marca == null || marca.isEmpty()) {
			throw new RuntimeException(MSG_MARCA_INVALIDA);
		}
			this.marca = marca;
	}

	
	private void setPrecio(double precio) throws RuntimeException{
		if (precio < 1 || precio == 0) {
			throw new RuntimeException("Precio no puede ser menor a 1 o = 0");
		}
			this.precio = precio;
	}

	
	public int getId() {
		return id;
	}
	
	
	public String getMarca() {
		return marca;
	}


	public double getPrecio() {
		return precio;
	}
	
	

} 