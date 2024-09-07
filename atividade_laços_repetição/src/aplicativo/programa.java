package aplicativo;

import java.util.ArrayList;
import java.util.List;

public class programa {

	public static void main(String[] args) {
		int contador = 0;
		System.out.println("laço while ate 50");
		while (contador <= 50) {
			System.out.print(contador + " ");
			contador++;
		}
		System.out.println();
		System.out.println();

		System.out.println("laço for ate 50");
		for (int i = 0; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("numeros pares de 1 a 50");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("numeros impares de 1 a 50");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		String vetorPersonagens[] = new String[] { "Naruto Uzumaki ", "Luffy Monkey D", "Goku", "Sakura Haruno",
				"Spike Spiegel", "Light Yagami", "Mikasa Ackerman", "Edward Elric", "Saitama", "Natsu Dragneel" };

		for (int i = 0; i < vetorPersonagens.length; i++) {
			if (i > 3) {
				System.out.println(vetorPersonagens[i] + " posição->" + i);
			}
		}
		System.out.println();
		List<String> listaPersonagens = new ArrayList<String>();
		String personagem_0 = "goku";
		String personagem_1 = "zoro";
		String personagem_2 = "yuji";
		String personagem_3 = "geto";
		String personagem_4 = "vegeta";

		listaPersonagens.add(personagem_0);
		listaPersonagens.add(personagem_1);
		listaPersonagens.add(personagem_2);
		listaPersonagens.add(personagem_3);
		listaPersonagens.add(personagem_4);

		listaPersonagens.remove(1);

		for (String exibirPersonagens : listaPersonagens) {
			System.out.println(exibirPersonagens);
		}
		listaPersonagens.remove(2);
		System.out.println();
		for (String exibirPersonagens : listaPersonagens) {
			System.out.println(exibirPersonagens);
		}
		System.out.println();
		if (personagem_0.equalsIgnoreCase("Talles")) {
			System.out.println("O primeiro personagem se chama Talles");
		} else {
			System.out.println("O primeiro personagem não se chama Talles");

		}
	}

}
