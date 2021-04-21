package problema02;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pedido {
	
	protected ArrayList<Producto> productos;
	LocalDate entregado;
	
	public Pedido () {
		this.productos = new ArrayList<Producto>();
	}
	
	public abstract boolean agregarProducto(Producto p);
	
	public abstract double precio();
	
	public abstract double comision();
	
	public String toString() {
		return productos.toString();
	}
	
	public void entregado () {
		this.entregado = this.entregado.now();
	}
	

}

	