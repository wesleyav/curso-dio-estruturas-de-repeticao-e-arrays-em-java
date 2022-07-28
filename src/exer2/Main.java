package exer2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe uma nota entre 0 e 10 -> ");
		int nota = scan.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida! Digite novamente");
			nota = scan.nextInt();
		}

		scan.close();
		System.out.println("Fim");

	}

}
