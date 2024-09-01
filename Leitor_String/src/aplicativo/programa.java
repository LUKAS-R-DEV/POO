package aplicativo;

public class programa {

	public static void main(String[] args) {
		int contador=0;
		String palavra="futebol";
		String vogais="aeiouAEIOU";
		System.out.println(palavra.length());
		System.out.println(palavra.toUpperCase());
		
		for(int i=0;i<palavra.length();i++) {
			char caracter=palavra.charAt(i);
			if(vogais.indexOf(caracter)!=-1) {
				contador++;
			}
		}
		System.out.println(contador);
		palavra=palavra.toUpperCase();
		
		if(palavra.startsWith("UNI")){
			System.out.println("a palavra começa com UNI");
			
		}
		else {
			System.out.println("a palavra não começa com UNI");
		}
		if(palavra.endsWith("RIO")) {
			System.out.println("a palavra termina com RIO");
		}else {
			System.out.println("a palavra não termina com RIO");
		}
		
	}

}
