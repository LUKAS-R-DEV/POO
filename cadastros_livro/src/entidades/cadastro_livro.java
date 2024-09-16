package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class cadastro_livro {
	Scanner sc = new Scanner(System.in);
	List<cadastro_livro> listaLivros = new ArrayList<cadastro_livro>();
	private int idLivro = 0;
	private String titulo;
	private String autor;
	private String editora;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataPublicacao;
	private int numeroPaginas;
	private String genero;
	private String dataString;
	private String disponivel;

	public cadastro_livro() {

	}

	public cadastro_livro(int idLivro, String titulo, String autor, String editora, Date dataPublicacao,
			int numeroPaginas, String genero, String disponivel) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
		this.disponivel = disponivel;
	}

	public cadastro_livro(int idLivro, String titulo, String autor, String editora, Date dataPublicacao,
			int numeroPaginas, String genero) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}

	public List<cadastro_livro> getListaLivros() {
		return listaLivros;
	}

	public void cadastraLivro() {
		boolean respostaCorreta = false;
		idLivro++;
		System.out.println("Digite o titulo do Livro");
		titulo = sc.nextLine();
		System.out.println("Digite o autor do Livro");
		autor = sc.nextLine();
		System.out.println("Digite a Data de Publicação do Livro-> dd/mm/yyyy");
		dataString = sc.nextLine();
		try {
			dataPublicacao = sdf.parse(dataString);

		} catch (ParseException e) {
			System.out.println("Erro ao Adicionar a data!");
			pausar();
			return;
		}

		System.out.println("Digite o nome da editora");
		editora = sc.nextLine();
		System.out.println("Digite o gênero do livro");
		genero = sc.nextLine();
		System.out.println("Digite a quantidade de paginas no livro");
		numeroPaginas = sc.nextInt();
		sc.nextLine();
		System.out.println("O livro está disponivel sim ou não");
		while (respostaCorreta == false) {
			String resposta = sc.nextLine().toLowerCase();
			switch (resposta) {
			case "sim": {
				disponivel = "sim";
				respostaCorreta = true;
				break;
			}
			case "não": {
				disponivel = "não";
				respostaCorreta = true;
				break;
			}
			default: {
				System.out.println("resposta Incorreta!");
				System.out.println("O livro está disponivel sim ou não");
				break;
			}

			}

		}
		cadastro_livro novoCadastro = new cadastro_livro(idLivro, titulo, autor, editora, dataPublicacao, numeroPaginas,
				genero, disponivel);
		if (listaLivros.add(novoCadastro)) {
			System.out.println("Cadastro concluido");
			pausar();
		}

	}

	public void exibirLivros(List<cadastro_livro> listaLivros) {
		verificarListaVazia();
		for (cadastro_livro exibir : listaLivros) {
			System.out.println(exibir);
		}
		pausar();
	}

	public void removerLivro(List<cadastro_livro> listaLivros) {
		verificarListaVazia();
		System.out.println("Digite o id do livro que deseja Remover");
		int idRemover = sc.nextInt();
		sc.nextLine();
		boolean idCerto = false;
		if (listaLivros.removeIf(f -> f.getIdLivro() == idRemover)) {
			idCerto = true;
			System.out.println("livro removido!");
			pausar();
		} else if (!idCerto) {
			System.out.println("ID invalido!");
			pausar();
		}

	}

	public void verificarListaVazia() {
		if (listaLivros.isEmpty()) {
			System.out.println("não tem livros cadastrados");
			return;
		}

	}

	public void pausar() {
		System.out.println("Presione enter para continuar!");
		sc.nextLine();
	}

	@Override
	public String toString() {
		return "cadastro_livro [" + "idLivro=" + idLivro + "\n" + "titulo=" + titulo + "\n" + "autor=" + autor + "\n"
				+ "editora=" + editora + "\n" + "dataPublicacao=" + sdf.format(dataPublicacao) + "\n" + "numeroPaginas="
				+ numeroPaginas + "\n" + "genero=" + genero + "\n" + "disponivel=" + disponivel + "]"+"\n";
	}

}
