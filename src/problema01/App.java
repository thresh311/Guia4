package problema01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenada a1 = new Coordenada();
		Coordenada a2 = new Coordenada(1,1);
		Coordenada a3 = new Coordenada(-1,-1);
		Coordenada a4 = new Coordenada(2,3);
		Coordenada a5 = new Coordenada(3,3);
		Camino camino = new Camino();
		camino.agregar(a1);
		camino.agregar(a2);
		camino.agregar(a3);
		camino.agregar(a4);
		camino.agregar(a5);
		camino.agregar(-2.1,-2.1);
		camino.agregar(9000000, 9000000);
		
		System.out.println(camino.toString());
		System.out.println(camino.buscar(new Coordenada(2,-0.5),new Coordenada(-2,2)).toString());
		System.out.println(camino.buscar(a1, 6378000).toString());
		
		a1.sumarLatitud(-6378000);
		a1.sumarLongitud(6378000);
		
		System.out.println(a1.toString());
		
		
	}

}
