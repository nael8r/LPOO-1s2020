
public class Carro {
	String nome;
	int kilometrosRodados;
	int tanque;
	int capacidadeTanque;
	boolean documentosPagos;
	char primeiroDigito;

	// TAREFA 1: criar esse método
	public void abastece(double litros) {
		System.out.println("Tanques antes de abastecer: " + tanque);
		if (tanque + litros <= capacidadeTanque) {
			tanque += litros;
		}
		System.out.println("Tanques depois de abastecer: " + tanque);
	}

	// TAREFA 2: criar esse método
	// mencionar porque usar double seria problemático
	public boolean temTanqueCheio() {
		return tanque == capacidadeTanque;
	}

	// TAREFA 3: criar esse método
	public void anda(int kilometros) {
		System.out.println("Kilometragem atual: " + kilometrosRodados);
		kilometrosRodados += kilometros;
		System.out.println("Kilometragem depois de andar: " + kilometrosRodados);
	}
	
	public void imprime() {
		System.out.println("Nome: " + nome);
		System.out.println("Kilometragem: " + kilometrosRodados);
		System.out.println("Tanque: " + tanque);
		System.out.println("Capacidade do tanque: " + capacidadeTanque);
		System.out.println("Documentos pagos? " + documentosPagos);
		System.out.println("Primeiro digito da placa: " + primeiroDigito);
	}
}
