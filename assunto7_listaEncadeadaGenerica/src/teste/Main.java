package teste;

import java.util.Scanner;

import listas.ListaCrescInt;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		ListaCrescInt lista = new ListaCrescInt();

		System.out.println("Insira um valor ( Digite um numero negativo para sair): ");
		valor = sc.nextInt();
		while (valor >= 0) {
			lista.add(valor);
			lista.show();
			System.out.println("Insira um valor ( Digite um numero negativo para sair): ");
			valor = sc.nextInt();
			
		}
		sc.close();
	}

}
