package aplicativo;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.cadastro_clientes;
import entidades.cadastro_livro;

public class programa {

	public static void main(String[] args) {
		cadastro_livro cadastroLivro = new cadastro_livro();
		cadastro_clientes cadastroClientes = new cadastro_clientes();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		try {

			do {
				System.out.println("selecione uma opção");
				System.out.println("CADASTRAR LIVROS-> 1");
				System.out.println("EXIBIR LIVROS-> 2");
				System.out.println("REMOVER LIVROS-> 3");
				System.out.println("CADASTRAR CLIENTES-> 4");
				System.out.println("EXIBIR CLIENTES-> 5");
				System.out.println("REMOVER CLIENTES-> 6");
				System.out.println("SAIR-> 7");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1: {
					cadastroLivro.cadastraLivro();
					break;
				}
				case 2: {
					cadastroLivro.exibirLivros(cadastroLivro.getListaLivros());
					break;
				}
				case 3: {
					cadastroLivro.removerLivro(cadastroLivro.getListaLivros());
					break;
				}
				case 4: {
					cadastroClientes.cadastrarClientes();
					break;
				}
				case 5: {
					cadastroClientes.exibirClientes(cadastroClientes.getListaClientes());
					break;
				}
				case 6: {
					cadastroClientes.removerClientes(cadastroClientes.getListaClientes());
					break;
				}
				case 7: {
					for (int i = 0; i <= 100; i += 20) {
						Thread.sleep(2000);
						System.out.println(i + " %");
					}
					System.out.println("Loading completo!");
					System.out.println("Programa Encerrado");
					break;
				}
				default: {
					System.out.println("Opção incorreta!");
					break;
				}
				}
			} while (opcao != 7);
		} catch (InputMismatchException e) {
			System.out.println("Entrada de Dados Invalida!");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
