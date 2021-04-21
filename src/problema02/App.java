package problema02;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadete c1 = new Cadete("Juan");
		PedidoBasico p2 = new PedidoBasico(true);
		PedidoPremium p3 = new PedidoPremium();
		p2.entregado();
		c1.agregarPedido(p2);
		
	}

}
