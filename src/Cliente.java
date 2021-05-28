
public class Cliente {

	
	public static void main(String[] args) {
		
		String cpf = "191";
		String nome = "Flávio";
		
		cadastrar(cpf, nome);
		
	}
	
	// CPF e NOME
	
	/*
	modificador tipoRetorno nome (parametros) {
		return tipoRetorno;
	}
	*/
	
	//ENTRADA > PROCESSAMENTO > SAIDA
	
	private static boolean cadastrar(String cpf, String nome) {
		System.out.println("Cadastrando o cliente:" + nome);
		return true;
	}
	
	private String consultar(String cpf) {
		System.out.println("Consultando o cpf: " + cpf); // PROCESSAMENTO
		return "Flavio";
	}
	
	private boolean alterar(String cpf, String nome) {
		System.out.println("Alterando o cliente:" + nome);
		return true;
	}
	
	private boolean excluir(String cpf) {
		System.out.println("Excluindo o cpf: " + cpf); // PROCESSAMENTO
		return true;
	}
}
