package vehiculo;

public class Autobus extends Vehiculo{
	
	private int cantPasajeros=0;
	private Persona[] pasajeros=new Persona[30];

	
	public Autobus(int kmRecorridos, Persona chofer) {
		super(kmRecorridos, chofer);
		
	}
	
	public void subirPasajero(Persona pasajero) {
		if(cantPasajeros<this.pasajeros.length) {
                        System.out.println("Sube un pasajero");
			pasajeros[cantPasajeros+1]=pasajero;
			cantPasajeros++;
		}
	}
	public void bajarPasajero() {
                if(this.cantPasajeros>0){
                    System.out.println("Baja un pasajero");		
                    this.cantPasajeros--;
                }
                else if(this.cantPasajeros==0)
                    System.out.println("No hay pasajeros!");
	}


	@Override
	public void cambiarChofer(Persona otroChofer) {
		if(this.cantPasajeros==0){
                        System.out.println("Se cambia el chofer, porque hay pasajeros");
			super.asignarChofer(otroChofer);
                }
		else
			System.out.println("No puede cambiar chofer");
		
	}
        
        
	

}
