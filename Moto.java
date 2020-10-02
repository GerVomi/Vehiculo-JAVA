package vehiculo;

public class Moto extends Vehiculo{

	private Persona acompaniante;
	
	public Moto(int kmRecorridos,Persona chofer) {
		super(kmRecorridos,chofer);
	}
	
        
        
	public void subirAcompaniante(Persona cumpa) {
		if(!tieneAcompaniante()){
                        System.out.println("Se sube un acompaniante!: "+cumpa);
			this.acompaniante=cumpa;
                }
		else
			System.out.println("Ya hay acompañante");
	}
	public boolean tieneAcompaniante() {
		if(this.acompaniante==null)
			return false;
		return true;
	}
	
	@Override
	public void cambiarChofer(Persona otroChofer) {
		if(!tieneAcompaniante())
			this.cambiarChofer(otroChofer);
		else
			System.out.println("No puede cambiar chofer");
		
	}

    
	

}
