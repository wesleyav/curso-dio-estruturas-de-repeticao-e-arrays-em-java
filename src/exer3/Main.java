package exer3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int numeroMaior = 0;
		int soma = 0;

		do {
			System.out.println("Número: ");
			int numero = scan.nextInt();

			soma += numero;
//			System.out.println("Soma: " + soma);

			if (numero > numeroMaior) {
				numeroMaior = numero;
			}

			count++;
//			System.out.println("Número maior: " + numeroMaior);
//			System.out.println("contador: " + count);
		} while (count < 5);

		scan.close();
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma / 5);
		System.out.println("Fim");
	}

}
