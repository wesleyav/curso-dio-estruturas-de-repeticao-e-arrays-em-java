package exer4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de números: ");
		int quantidadeNumeros = scan.nextInt();

		int count = 0;
		int qtdPar = 0;
		int qtdImpar = 0;

		do {
			System.out.println("Número: ");
			int numero = scan.nextInt();

			if (numero % 2 == 0) {
				qtdPar++;
			} else {
				qtdImpar++;
			}

			count++;
		} while (count < quantidadeNumeros);

		scan.close();
		System.out.println("Par: " + qtdPar);
		System.out.println("Impar: " + qtdImpar);
	}
}
