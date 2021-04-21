package problema02;

public class Producto {
	
	protected String descripcion;
	protected double costo;
	
	public double getCosto() {
		return this.costo;
	}
	
	public String toString() {
		return this.descripcion + ": $" + this.costo; 
	}
	
}
