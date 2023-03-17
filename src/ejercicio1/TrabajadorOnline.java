package ejercicio1;

public class TrabajadorOnline extends Trabajador{
	public final int internet;

	public TrabajadorOnline(String nombre, String apellido, int precioHora, int internet) {
		super(nombre, apellido, precioHora);
		this.internet = internet;
	}
	
	@Override
	public int calcularSueldo(int numeroHoras) {
		// TODO Auto-generated method stub
		return super.calcularSueldo(numeroHoras)+ this.internet;
	}
}
