package ar.edu.ort.a2019.c2.tp1.p2.clases;

public abstract class Producto implements Mostrable{


	private static final String MSG_LA_DESCRIPCIÓN_NO_PUEDE_SER_NULO = "La descripción no puede ser nulo";
	private static final String MSG_EL_CODIGO_NO_PUEDE_SER_NULO = "El código no puede ser nulo";
	private static final String MSG_EL_NOMBRE_NO_PUEDE_SER_NULO = "El nombre no puede ser nulo";

	
//	TODO Completar Métodos y atributos
	private String codigo;
	private String nombre;
	private String descripcion;
	private String etiqueta;
	
	
	public Producto(String codigo, String nombre, String descripcion) {
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	
	private void setCodigo(String codigo) throws IllegalArgumentException {
		if(codigo == null || codigo.isEmpty()) {
			throw new IllegalArgumentException(MSG_EL_CODIGO_NO_PUEDE_SER_NULO);
		}
		this.codigo = codigo;
	}
	
	
	private void setNombre(String nombre) throws IllegalArgumentException {
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(MSG_EL_NOMBRE_NO_PUEDE_SER_NULO);
		}
		this.nombre = nombre;
	}
	
	
	private void setDescripcion(String descripcion) throws IllegalArgumentException {
		if(descripcion == null || descripcion.isEmpty()) {
			throw new IllegalArgumentException(MSG_LA_DESCRIPCIÓN_NO_PUEDE_SER_NULO);
		}
		this.descripcion = descripcion;
	}
	
	
	protected void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	
	//Ya esta validado en el set, de que no sea nulo
	public boolean esTuCodigo(String codigo) {
		return this.codigo.equals(codigo);
	}
	
	
	
	protected String getNombre() {
		return nombre;
	}
	
	
	protected String getDescripcion() {
		return descripcion;
	}
	
	
	protected String getEtiqueta() {
		return etiqueta;
	}
	
	
	protected String getCodigo() {
		return codigo;
	}
	
	
	public abstract void etiquetar();


	@Override
	public String toString() {
		return "Producto [Codigo: " + codigo + ", Nombre: " + nombre + ", Descripcion: " + descripcion + ", Etiqueta: "
				+ etiqueta + "]";
	}
	
	
	
	
}
