package clases;

public enum TipoDePelota {
	FUTBOL("Futbol"), TENIS("Tenis"), GOLF("Golf");

	private String descripcion;

	private TipoDePelota(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	
}
