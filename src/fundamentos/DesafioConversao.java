package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
/*Criar um scanner, pegar 3 string usando nextline e elas
*receberão 3 salarios e após isso será calculado a média dos 3
*salários. Este salário poderá ser digitado com . ou ,
*/ 

	double Media;
System.out.println("*********************************");
System.out.print("Informe o Primeiro Salário: ");
	String valor1 = entrada.nextLine().replace(",", ".");
System.out.print("Informe o Segundo Salário: ");
	String valor2 = entrada.nextLine().replace(",", ".");
System.out.print("Informe o Terceiro Salário: ");
	String valor3 = entrada.nextLine().replace(",", ".");
System.out.println("*********************************");

	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);

		Media = (salario1+salario2+salario3)/3;
		
		System.out.printf("%.2f",Media);
		entrada.close();
	}
}
