package calculadora_basica;

import entidades.calculadora;

public class programa {
	public static void main(String[]args) {
	calculadora calculadora=new calculadora ();
		System.out.println("soma-> "+calculadora.soma(8, 6));
		System.out.println("subtração-> "+calculadora.subtracao(80, 5));
		System.out.println("multiplicação-> "+calculadora.multiplicacao(8, 4));
		System.out.println("divisão-> "+calculadora.divisão(20,4));
		
		
		
		
	}

}
