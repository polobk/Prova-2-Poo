public class Fornecedor extends Pessoa {

private	double creditomax;
private	double valoremdv;
	
	Fornecedor(){
		
	}

	public double getCredimax() {
		return creditomax;
	}

	public void setCredimax(double credimax) {
		this.creditomax = credimax;
	}

	public double getValoremdv() {
		return valoremdv;
	}

	public void setValoremdv(double valoremdv) {
		this.valoremdv = valoremdv;
	}

public void obtersaldo(double diferen�a){
	creditomax +=diferen�a;
	valoremdv += diferen�a;
}


}