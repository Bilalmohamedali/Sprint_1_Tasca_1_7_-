package ejercicio1;

public class Trabajador {
	private  String nombre, apellido;
	private int precioHora;
	
	public Trabajador(String nombre, String apellido, int precioHora) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}
	
	public int calcularSueldo(int numeroHoras) {
		return numeroHoras*precioHora;
	}
	

}
