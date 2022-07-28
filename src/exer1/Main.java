package exer1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Nome: ");
			String nome = scan.next();

			if (nome.equals("0"))
				break;

			System.out.print("Idade: ");
			int idade = scan.nextInt();
		}

		System.out.println("Fim");

	}

}
