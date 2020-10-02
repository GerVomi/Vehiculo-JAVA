package vehiculo;

public abstract class Vehiculo {
	
	private int kmRecoridos;
	private Persona chofer;
	
	public Vehiculo(int kmRecorridos,Persona chofer) {
		this.asignarChofer(chofer);
		this.setKmRecoridos(kmRecorridos);
	}
	
	
	public void asignarChofer(Persona chofer) {
		this.chofer=chofer;
	}
	
	public int getKmRecoridos() {
		return kmRecoridos;
	}

	private void setKmRecoridos(int kmRecoridos) {
		this.kmRecoridos = kmRecoridos;
	}

	public abstract void cambiarChofer(Persona otroChofer);
}