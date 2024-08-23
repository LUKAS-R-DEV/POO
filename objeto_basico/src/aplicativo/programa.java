package aplicativo;

import entidades.livro;

public class programa {

	public static void main(String[] args) {
		livro livro=new livro();
		
		livro.exibirLivro();
		livro.exibirAutor();
		System.out.println(livro.exibirValor());
		System.out.println(livro.exibirAnoLivro());
		System.out.println(livro.quantiEstoque());
		
		
		
		
		
		
		
	}

}
