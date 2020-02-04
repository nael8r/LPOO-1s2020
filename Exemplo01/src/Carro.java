
public class Carro {
	String nome;
	int kilometrosRodados;
	double tanque;
	double capacidadeTanque;
	boolean documentosPagos;
	char primeiroDigito;

	// TAREFA 1: criar esse método
	public void abastece(double litros) {
		if(tanque + litros <= capacidadeTanque) {
			tanque += litros;
		}
	}
	// TAREFA 2: criar esse método
	public boolean temTanqueCheio() {
		return tanque == capacidadeTanque;
	}
	
	// TAREFA 3: criar esse método
	public void anda(int kilometros) {
		kilometrosRodados += kilometros;
	}
}
