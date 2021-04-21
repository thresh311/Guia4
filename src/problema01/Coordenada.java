package problema01;

public class Coordenada {

	double latitud;
	double longitud;
	
	public Coordenada () {
	}
	
	public Coordenada (double lat, double longitud) {
		this.latitud = lat;
		this.longitud = longitud;
	}
	
	public double getLatitud () {
		return this.latitud;
	}
	
	public double getLongitud () {
		return this.longitud;
	}
	
	public void setLatitud (double lat) {
		this.latitud = lat;
	}
	
	public void setLongitud (double longitud) {
		this.longitud = longitud;
	}
	
	public boolean equals (Coordenada other) {
		return ((this.latitud == other.latitud) && (this.longitud == other.longitud));
	}
	
	public String toString () {
		return "Latitud: " + this.latitud + " Longitud: " + this.longitud;
	}
	
	public void sumarLatitud (int mtsLt) {
		this.latitud =  this.latitud + (mtsLt / 6378000) * (180/Math.PI);
	}
	
	public void sumarLongitud (int mtsLn) {
		this.longitud = this.longitud + (mtsLn / 6378000) * (180/Math.PI) / Math.cos(this.latitud * Math.PI / 180);
	}
	
	
	
}
