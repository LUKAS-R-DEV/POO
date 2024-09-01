package aplicativo;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a temperatura ");
		int temperatura=sc.nextInt();
		
		if(temperatura>30){
			System.out.println("a temperatura de->"+temperatura);
			System.out.println("está quente");
		}else {
			System.out.println("a temperatura de->"+temperatura);
			System.out.println("está frio");
		}
	}

}
