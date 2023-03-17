package ejercicio1;

public class TrabajadorPresencial extends Trabajador {
	private static int gasolina;

	public TrabajadorPresencial(String nombre, String apellido, int precioHora, int gasolina) {
		super(nombre, apellido, precioHora);
		TrabajadorPresencial.gasolina = gasolina;
	}

	@Override
	public int calcularSueldo(int numeroHoras) {
		// TODO Auto-generated method stub
		return super.calcularSueldo(numeroHoras) + this.gasolina;
	}
}
