
public class Administrador extends Empregado {
	
	private double ajudasDeCusto = 500;
	
	Administrador(){
		
	}

	
	public void obterlucro() {
		setSalario(getSalario() + ajudasDeCusto );
		
	}
	
	
	
	
}


