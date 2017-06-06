
public class Fornecedorteste {

	public static void main(String[] args) {
		
		Fornecedor fe = new Fornecedor();
		
		fe.setNome("Tempero");
		fe.setCredimax(15000);
		fe.setValoremdv(600);
		System.out.println("Fornecedor=> Nome: "  + fe.getNome() + " Credito maximo "  + fe.getCredimax() +" Valor em divida " + fe.getValoremdv());
	
	
	
	}

}
