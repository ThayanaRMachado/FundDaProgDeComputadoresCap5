import java.util.Scanner;

public class TesteFatorialEx3 {

	public static void main(String[] args) {
		
		FatorialEx3 fatorial = new FatorialEx3();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe quantos n�meros devem ser lidos.");
		fatorial.setN(entrada.nextInt());
		
		fatorial.calculaFat();
	}

}
