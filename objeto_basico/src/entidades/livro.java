package entidades;

public class livro {
String livro="One Piece";
String autor="Eiichiro Oda";
double valor=25;
String anoDoLivro="1997";
int quantEstoque=100;


public void exibirLivro() {
	System.out.println("livro->"+livro);
}
public void exibirAutor() {
	System.out.println("autor->"+autor);
}
public String exibirValor() {
return "valor->"+valor+" R$";	
}
public String exibirAnoLivro() {
	return "ano de publicação->"+anoDoLivro;
}
public String quantiEstoque() {
	return"quantidade em estoque->"+quantEstoque;
}


}
