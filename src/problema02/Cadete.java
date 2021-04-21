package problema02;

import java.util.ArrayList;

public class Cadete {
	String nombre;
	ArrayList<Pedido> pedidos;
	
	
	public Cadete (String nombre) {
		this.nombre = nombre;
		this.pedidos = new ArrayList<Pedido> ();
	}
	
	public void agregarPedido (Pedido p) {
		this.pedidos.add(p);
	}
	
	public double comisiones() {
		double total = 0;
		
		for(Pedido p : this.pedidos) {
			total+=p.comision();
		}
	
		return total;
	}
	
	public String toString() {
		return this.nombre + "\n" + pedidos.toString();
	}
}
