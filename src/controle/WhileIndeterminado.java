package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
			String sair = "";
			
			while(sair.equalsIgnoreCase("sair")==false) {
				System.out.print("Informe uma Palavra: ");
				sair = entrada.next();
			}
			System.out.println("Finalizado!");
		entrada.close();
	}
}
