package vehiculo;

public class TestVehiculos {
	public static void main(String[] args) {
	Persona ana=new Persona("Ana");
	Persona gladys=new Persona("Gladys");
	Persona pepe=new Persona("Pepe");
	Moto honda=new Moto(400, pepe);
        
	honda.subirAcompaniante(ana);
           
	honda.subirAcompaniante(gladys);
	honda.cambiarChofer(gladys);
        
        
	Autobus ab=new Autobus(2000,gladys);
        ab.bajarPasajero();
	ab.cambiarChofer(pepe);
	ab.subirPasajero(ana);
	ab.cambiarChofer(gladys);
}
}
