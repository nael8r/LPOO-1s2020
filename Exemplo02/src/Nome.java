public class Nome {
	String primeiroNome;
	String sobreNome;

	public Nome() {

	}
	
	// 2: Lembrar que criar outro construtor me obriga a declarar o padrão
	public Nome(String aPrimeiroNome, String aSobrenome) {
	//public Nome(String primeiroNome, String aSobrenome) {
		this.primeiroNome = aPrimeiroNome;
		// O que acontece se o parâmetro (ou variável) local tem o mesmo nome do atributo?
		// primeiroNome = primeiroNome;
		this.sobreNome = aSobrenome;
	}
	
	public void display() {
		System.out.println("Nome: " + this.primeiroNome + " " + this.sobreNome);
	}
	
}
