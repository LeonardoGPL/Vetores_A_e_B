package vetores;

public class vetores {

	public static void main(String[] args) {
		// Criando variaveis com seus valores
		int a[] = { 4, 6, 7, 1, 0 };
		int b[] = { 7, 1, 3, 1, 2 };
		int x = 0, c = 0;
		// inserindo expressao matematica
		x = x++;
		// criando condição
		if (a[x] > 4 && b[x] > 4) {
			x = 1;
			c = 0;
		} else if (x <= 5) {
			c = c + a[x] * b[x];
			x = x++;
		}
		// exibir na tela o valor de C
		System.out.printf("%d", c);

	}

}
