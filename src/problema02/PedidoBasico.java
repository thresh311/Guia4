package problema02;

public class PedidoBasico extends Pedido {
	
	protected static int cantMaxProd = 5;
	protected boolean express;

	public PedidoBasico (boolean exp) {
		super();
		this.express = exp;
	}
	
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
		if(express) {
			return total*1.05*1.2;
		} else {
			return total*1.05;
		}
	}

	@Override
	public double comision() {
		if(this.entregado != null) return this.precio()*0.1;
		return 0;
	}
	

}
