package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
/*Criar um scanner, pegar 3 string usando nextline e elas
*receber�o 3 salarios e ap�s isso ser� calculado a m�dia dos 3
*sal�rios. Este sal�rio poder� ser digitado com . ou ,
*/ 

	double Media;
System.out.println("*********************************");
System.out.print("Informe o Primeiro Sal�rio: ");
	String valor1 = entrada.nextLine().replace(",", ".");
System.out.print("Informe o Segundo Sal�rio: ");
	String valor2 = entrada.nextLine().replace(",", ".");
System.out.print("Informe o Terceiro Sal�rio: ");
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
