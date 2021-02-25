//Fundamentos da programação de computadores - Capítulo 4 Estrutura de repetição - página 133
public class FatorialEx2 {

	private int num, i, j;
	float e = 1, fat;

	public void setNum(int num) {
		this.num = num;
	}
	
	public float calculaFat() {
		for (int i = 1; i <= num; i++) {
			fat = 1;
			for (int j = 1; j <= 1; j++) {
				fat = fat * j;
				e = e + (1/fat);
			}
		}
		return e;
	}
	
	public void imprimir() {
		System.out.println("O valor de E = " + calculaFat());
	}
}
