package fundamentos;

import java.util.Scanner;

public class ExercicioComplementar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i=0,opcao;
		double somatorio=0,media;
		
	do{
		System.out.println("*********************");
		System.out.println("[1] Pr�xima opera��o ");
		System.out.println("[2] Sair ");
		System.out.println("*********************");
		
		opcao = entrada.nextInt();
		
		if(opcao==1) { //Testes
			System.out.println("Informe a Quantidade de Funcion�rios: ");
			int quantia = entrada.nextInt();
				while(quantia>0) {
					System.out.printf("Informe o Sal�rio do %d Funcion�rio: ",i);
					String salario = entrada.next().replace(",", ".");
					double novo = Double.parseDouble(salario);
					somatorio += novo;
					quantia--;
					i++;
				}
				media = somatorio/i; //calculo da media
				System.out.printf("A m�dia � igual a %.2f\n",media);
		}else {
			System.out.println("Opera��o Finalizada");
		}
}while(opcao!=2);
		
		entrada.close();
	}
}
