
public class Teste {

//	int somaTanques(Carro C1, Carro C2) {
	static void somaTanques(Carro C1, Carro C2) {
		// TAREFA 4: mencionar diferença entre variáveis locais e globais
		int soma = 0;
		soma += C1.tanque;
		soma += C2.tanque;
//		return soma;
	}

	public static void main(String[] args) {
		Carro monza = new Carro();
		monza.nome = "Monza";
		monza.kilometrosRodados = 10000;
		monza.tanque = 0;
		monza.capacidadeTanque = 50;
		monza.documentosPagos = false;
		monza.primeiroDigito = 'J';

		Carro opala = new Carro();
		opala.nome = "Opala";
		opala.kilometrosRodados = 20000;
		opala.tanque = 5;
		opala.capacidadeTanque = 80;
		opala.documentosPagos = true;
		opala.primeiroDigito = 'M';

		// somar a quantidade de gasolina dos dois carros
		somaTanques(monza, opala);
//		int soma = somaTanques(monza, opala);
//		System.out.println(soma);

		// TAREFA 5: abastecer o tanque do monza de 10 em 10 litros enquanto não estiver
		// cheio
		while (!monza.temTanqueCheio()) {
			// Int => Double
			monza.abastece(10);
		}

		// TAREFA 6: Andar de 10 em 10 km com o Opala até andar 100 km
		for (int i = 0; i < 100; i += 10) {
			opala.anda(10);
		}
		
		// TAREFA 7 : O que acontece se passarmos um double para o método anda
//		opala.anda(1.7);
		opala.anda((int)1.7);
		

	}
}
