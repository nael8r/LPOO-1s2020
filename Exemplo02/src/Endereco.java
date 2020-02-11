
public class Endereco {

	String rua;
	int numero;

	public Endereco() {

	}

	// 2: Lembrar que criar outro construtor me obriga a declarar o padrão
	public Endereco(String aRua, int aNumero) {
		this.rua = aRua;
		this.numero = aNumero;
	}

	public void display() {
		System.out.println("Rua: " + this.rua);
		System.out.println("Numero: " + this.numero);
	}

}
