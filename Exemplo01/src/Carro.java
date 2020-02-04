
public class Carro {
	String nome;
	int kilometrosRodados;
	int tanque;
	int capacidadeTanque;
	boolean documentosPagos;
	char primeiroDigito;

	// TAREFA 1: criar esse método
	public void abastece(double litros) {
		System.out.print("Tanques antes de abastecer:");
		System.out.println(tanque);
		if (tanque + litros <= capacidadeTanque) {
			tanque += litros;
		}
		System.out.print("Tanques depois de abastecer:");
		System.out.println(tanque);
	}

	// TAREFA 2: criar esse método
	// mencionar porque usar double seria problemático
	public boolean temTanqueCheio() {
		return tanque == capacidadeTanque;
	}

	// TAREFA 3: criar esse método
	public void anda(int kilometros) {
		System.out.print("Kilometragem atual:");
		System.out.println(kilometrosRodados);
		kilometrosRodados += kilometros;
		System.out.print("Kilometragem depois de andar:");
		System.out.println(kilometrosRodados);
	}
}
