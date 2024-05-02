package exercicio1;

import java.util.Scanner;

import Fila.FilaInt;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		FilaInt fila = new FilaInt();

		System.out.println("Valor inteiro positivo para inserir na fila ou negativo para encerrar");
		valor = sc.nextInt();
		while (valor >= 0) {
			fila.enqueue(valor);
			System.out.println("Valor inteiro positivo para inserir na fila ou negativo para encerrar");
			valor = sc.nextInt();
		}
		while (!fila.isEmpty()) {
			System.out.println(fila.dequeue());
		}
		sc.close();
	}

}
