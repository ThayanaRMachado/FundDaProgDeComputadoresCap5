import java.util.Scanner;

//Fundamentos da programa��o de computadores - Cap�tulo 4 Estrutura de repeti��o - p�gina 133
public class FatorialEx3 {

	private int n, num, i, j, fat;
	Scanner dado = new Scanner(System.in);
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int calculaFat() {
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite o " + i + "� n�mero.");
			num = dado.nextInt();
			fat = 1;
			
			for (int j = 1; j <= num; j++) {
				fat = fat * j;
				System.out.println("Fatorial de " + num + " = " + fat);
			}
		}
		return fat;
		
	}
	
}
