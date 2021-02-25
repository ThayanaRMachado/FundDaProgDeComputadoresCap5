import java.util.Scanner;

public class TesteFuncionarioEx1 {

	public static void main(String[] args) {
		FuncionarioEx1 funcionario = new FuncionarioEx1();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano atual");
		funcionario.setAnoAtual(entrada.nextInt());
		
		System.out.println(funcionario.calculaNovoSal());

		funcionario.imprimir();
	}

}
