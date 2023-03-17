package ejercicio2;

public class TrabajadorD {
	
	private  String nombre, apellido;
	private int precioHora;
	
	public TrabajadorD(String nombre, String apellido, int precioHora) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}
	
	public int calcularSueldo(int numeroHoras) {
		return numeroHoras*precioHora;
	}
	
	//@Deprecated
	public Boolean prima() {
		return false;
	}
}
