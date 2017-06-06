public class Empregado extends Pessoa{

	private double salario;
	
	Empregado(){
		
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
			
	}

	public void obterlucro(double sl){
		salario += sl;
		
	}
	
	
	
}
