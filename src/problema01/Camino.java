package problema01;

import java.util.ArrayList;
import java.util.List;

public class Camino {

	ArrayList<Coordenada> camino;

	
	public Camino () {
		camino = new ArrayList<Coordenada>();
	}
	
	public void agregar (Coordenada p1) {
		this.camino.add(p1);
	}
	
	public String toString() {
		return this.camino.toString();
	}
	
	public void agregar (double lat, double lng) {
		Coordenada aux = new Coordenada (lat, lng);
		this.camino.add(aux);
	}
	
	public void agregar (int mtsLt, int mtsLn) {
		Coordenada aux;
		
		if(camino.isEmpty()) {
		aux = new Coordenada();	
		} else  {
		aux = new Coordenada (camino.get(camino.size()-1).getLatitud(), camino.get(camino.size()-1).getLongitud());
		}
		
		aux.sumarLatitud(mtsLt);
		aux.sumarLongitud(mtsLn);
		camino.add(aux);
	}
	
	public List<Coordenada> buscar(Coordenada no, Coordenada se) {
		List<Coordenada> resultado = new ArrayList<Coordenada>();
		
		for (Coordenada c1 : this.camino) {
			if (no.latitud >= c1.latitud && no.longitud <= c1.longitud) {
				if(se.latitud <= c1.latitud && se.longitud >= c1.longitud) {
					resultado.add(c1);
				}
			}
		}
		
		return resultado;
	}
	
	public List<Coordenada> buscar(Coordenada centro, int distancia) {
		
		Coordenada no = new Coordenada(centro.latitud, centro.longitud);
		Coordenada se = new Coordenada(centro.latitud, centro.longitud);
		
		no.sumarLatitud(distancia);
		no.sumarLongitud(-1*distancia);
		
		se.sumarLatitud(-1*distancia);
		se.sumarLongitud(distancia);
		
		return buscar(no, se);
	}
	
}
