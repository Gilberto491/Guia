package fundamentos;

import java.util.Scanner;

public class ExercicioComplementar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i=0,opcao;
		double somatorio=0,media;
		
	do{
		System.out.println("*********************");
		System.out.println("[1] Próxima operação ");
		System.out.println("[2] Sair ");
		System.out.println("*********************");
		
		opcao = entrada.nextInt();
		
		if(opcao==1) { //Testes
			System.out.println("Informe a Quantidade de Funcionários: ");
			int quantia = entrada.nextInt();
				while(quantia>0) {
					System.out.printf("Informe o Salário do %d Funcionário: ",i);
					String salario = entrada.next().replace(",", ".");
					double novo = Double.parseDouble(salario);
					somatorio += novo;
					quantia--;
					i++;
				}
				media = somatorio/i; //calculo da media
				System.out.printf("A média é igual a %.2f\n",media);
		}else {
			System.out.println("Operação Finalizada");
		}
}while(opcao!=2);
		
		entrada.close();
	}
}
