
public class Administradorteste {

	public static void main(String[] args) {
		
		Administrador a = new Administrador();
		
		a.setNome("Felipe");
		a.setSalario(1000);
		a.obterlucro();
		System.out.println("Funcionario => Nome: " + a.getNome() + " Salario: " + a.getSalario());
		
	}

}
