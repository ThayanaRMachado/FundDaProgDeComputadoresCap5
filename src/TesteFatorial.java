import java.util.Scanner;

public class TesteFatorial {

	public static void main(String[] args) {
		
		FatorialEx2 fatorial = new FatorialEx2();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite m número inteiro positivo");
		fatorial.setNum(entrada.nextInt());
		
		fatorial.imprimir();

	}

}
