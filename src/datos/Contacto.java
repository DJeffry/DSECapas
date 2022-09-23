package datos;

public class Contacto {
	private String nombre;
	private long celular;
	public String getNombre() {
		return nombre;
	}
	public Contacto(String nombre, long i) {
		super();
		this.nombre = nombre;
		this.celular = i;
	}
	@Override
	public String toString() {
		return "contacto [nombre=" + nombre + ", celular=" + celular + "]";
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
}
