public class CadastroAluno {
	Nome nome;
	Endereco endereco;

	public CadastroAluno () {

	}

	// 2: Lembrar que criar outro construtor me obriga a declarar o padrão
	public CadastroAluno(String primeiroNome, String sobrenome, String rua, int numero) {
		this.nome = new Nome(primeiroNome, sobrenome);
		this.endereco = new Endereco(rua, numero);
	}

	// 3
	public CadastroAluno(Nome aNome, Endereco aEndereco) {
		this.nome = aNome;
		this.endereco = aEndereco;
	}

	public void display() {
		nome.display();
		endereco.display();
	}
	
}
