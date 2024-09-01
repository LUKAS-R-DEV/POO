package aplicativo;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double n1=sc.nextDouble();
		System.out.println("digite o segundo numero");
		double n2=sc.nextDouble();
		
		if(n1>n2) {
			System.out.println("primeiro numero maior que o segundo");
		}
		else if(n2>n1) {
			System.out.println("segundo numero maior que o primeiro");
		}
		else {
			System.out.println("numeros iguais");
		}
	}

}
