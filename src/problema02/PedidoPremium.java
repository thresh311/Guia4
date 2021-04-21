package problema02;

public class PedidoPremium extends Pedido {
	
	public static int cantMaxProd = 20;

	@Override
	public boolean agregarProducto(Producto p) {
		if(this.productos.size() < this.cantMaxProd) {
			this.productos.add(p);
			return true;
		} 
		
		return false;
	}

	@Override
	public double precio() {
		double total = 0;
		for (Producto p : this.productos) {
			total+= p.getCosto();
		}
		if(this.productos.size() > 5) {
			return total*1.3;
		} else {
			return total*1.2;
		}
		
	}

	@Override
	public double comision() {
		if(this.entregado != null) {
		if(this.productos.size() > 10) {
			return 50 + this.precio()*0.15;
		}
		return this.precio()*0.15;
		}
		return 0;
	}
	
	

}
