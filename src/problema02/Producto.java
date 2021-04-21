package problema02;

public class Producto {
	
	protected String descripcion;
	protected double costo;
	
	public double getCosto() {
		return this.costo;
	}
	
	public void setCosto(double cost) {
		this.costo = cost;
	}
	
	public String toString() {
		return this.descripcion + ": $" + this.costo; 
	}
	
}
