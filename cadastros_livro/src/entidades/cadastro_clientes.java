package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cadastro_clientes {
	cadastro_livro cadastroLivro = new cadastro_livro();
	Scanner sc = new Scanner(System.in);
	List<cadastro_clientes> listaClientes = new ArrayList<cadastro_clientes>();
	private String nome;
	private String email;

	public cadastro_clientes() {

	}

	public cadastro_clientes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<cadastro_clientes> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<cadastro_clientes> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void cadastrarClientes() {
		System.out.println("Digite o nome do cliente");
		nome = sc.nextLine();
		System.out.println("Digite o email do cliente");
		email = sc.nextLine();

		cadastro_clientes novosClientes = new cadastro_clientes(nome, email);

		if (listaClientes.add(novosClientes)) {
			System.out.println("Cadastro concluido!");
			cadastroLivro.pausar();
		} else {
			System.out.println("Cadastro Não concluido");
			cadastroLivro.pausar();
		}
	}

	public void exibirClientes(List<cadastro_clientes> listaClientes) {
		if (listaClientes.isEmpty()) {
			System.out.println("ListaVazia!");
			cadastroLivro.pausar();
			return;

		}
		for (cadastro_clientes exibir : listaClientes) {
			System.out.println(exibir);
		}
		cadastroLivro.pausar();

	}

	public void removerClientes(List<cadastro_clientes> listaClientes) {
		if (listaClientes.isEmpty()) {
			System.out.println("ListaVazia!");
			cadastroLivro.pausar();
			return;

		}
		System.out.println("Digite o nome do cliente para remover");
		String nomeRemover = sc.nextLine();
		boolean nomeCerto = false;
		if (listaClientes.removeIf(f -> f.getNome().toString().equalsIgnoreCase(nomeRemover))) {
			nomeCerto = true;
			System.out.println("Nome removido!");
			cadastroLivro.pausar();
		} else if (!nomeCerto) {
			System.out.println("Nome Invalido!");
			cadastroLivro.pausar();
		}

	}

	@Override
	public String toString() {
		return "cadastro_clientes\n" + "[nome=" + nome + "\n" + "email=" + email + "]"+"\n";
	}

}
