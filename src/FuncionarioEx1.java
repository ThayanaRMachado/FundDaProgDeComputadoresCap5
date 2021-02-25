//Fundamentos da programação de computadores - Capítulo 4 Estrutura de repetição - página 132
public class FuncionarioEx1 {

	private int inicio, anoAtual;
	private double salario = 1000, novoSal, percentual = salario * 015;

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public double calculaNovoSal() {
		novoSal = salario + (percentual * salario);
		for (int i = 2007; i <= anoAtual; i++) {
			percentual = percentual * 2;
			novoSal = novoSal + percentual * salario;
		}

		return novoSal;
	}

	public void imprimir() {
		System.out.println("Novo salário: " + calculaNovoSal());
	}

}
