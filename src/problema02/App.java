package problema02;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadete c1 = new Cadete("Juan");
		PedidoBasico p2 = new PedidoBasico(true);
		Producto aux = new Producto();
		aux.setCosto(100);
		p2.agregarProducto(aux);
		Tramite t1 = new Tramite();
		p2.entregado();
		c1.agregarComisionable(p2);
		c1.agregarComisionable(t1);
		
		System.out.println(c1.comisiones());
	}

}
