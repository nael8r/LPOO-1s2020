
public class Teste {

	public static void main(String[] args) {
		// Esse construtor que não recebe parâmetros não foi declarado, por que posso usá-lo?
		CadastroAluno cadastro = new CadastroAluno();
		// O que acontece aqui?
		cadastro.display();

		cadastro.nome = new Nome();
		// O que acontece aqui?
		cadastro.nome.display();

		cadastro.endereco = new Endereco();
		cadastro.nome.primeiroNome = "Ana";
		cadastro.nome.sobreNome = "Cardoso";
		cadastro.endereco.rua = "Rua sem nome";
		cadastro.endereco.numero = 0;

		// 2
		// CadastroAluno cadastro = new CadastroAluno("Ana", "Cardoso", "Rua sem nome", 0);

		// 3
		// Nome nome = new Nome("Ana", "Cardoso");
		// Endereco endereco = new Endereco("Rua sem nome", 0);
		// CadastroAluno cadastro = new CadastroAluno(nome, endereco);

		cadastro.display();

	}
}
