//Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura de repeti��o - p�gina 132
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
		System.out.println("Novo sal�rio: " + calculaNovoSal());
	}

}
