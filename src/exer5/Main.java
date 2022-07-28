package exer5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe qual tabuada deseja ver: ");
		int tabuada = scan.nextInt();

		System.out.println("Tabuada de " + tabuada + ":");

		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}

		scan.close();
	}

}
