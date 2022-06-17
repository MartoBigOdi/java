package excep.TDAS;

public class Zona {
	
	private String nombre;
	private int codigo;
	private double superficie;
	
	public Zona(String nombre, int codigo, double superficie) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.superficie = superficie;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public double getSuperficie() {
		return superficie;
	}
	@Override
	public String toString() {
		return "Zona [nombre = " + nombre + ", codigo = " + codigo + ", superficie = " + superficie + "]";
	}
	
	
	
}
