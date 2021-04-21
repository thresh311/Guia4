package problema02;

import java.time.LocalDate;

public class Tramite implements Comisionable {

	String descripcion;
	String domicilio;
	LocalDate realizado;
	String hora;
	
	
	public double precio() {
		return 50;
	}
	
	@Override
	public double comision() {
		return 20;
	}

}
