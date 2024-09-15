package aplicativo;

import entidades.pessoas;

public class programa {

	public static void main(String[] args) {
		pessoas pessoas1=new pessoas();
		pessoas pessoas2=new pessoas();

		pessoas1.setId(01);
		pessoas1.setCidade("são paulo");
		pessoas1.setEmail("mark.com");
		pessoas1.setEndereco("centro");
		pessoas1.setEstado("São paulo");
		pessoas1.setIdade(20);
		pessoas1.setNome("mark");
		pessoas1.setPais("Brasil");
		pessoas1.setSobrenome("white");
		pessoas1.setTelefone("00 7457264736");
		
		
		pessoas2.setId(02);
		pessoas2.setCidade("xique xique");
		pessoas2.setEmail("joao.com");
		pessoas2.setEndereco("centro");
		pessoas2.setEstado("Bahia");
		pessoas2.setIdade(26);
		pessoas2.setNome("joao");
		pessoas2.setPais("Brasil");
		pessoas2.setSobrenome("Silva");
		pessoas2.setTelefone("03 8763354680 ");
		
		System.out.println(pessoas1.getNome());
		System.out.println(pessoas2.getNome());
		
		
		
	}

}
