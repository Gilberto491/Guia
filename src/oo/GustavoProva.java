package oo;

import java.util.Scanner;

public class GustavoProva {
	public static void main(String[] args) {
		
				Scanner entrada = new Scanner(System.in);

				
				System.out.println("============================\n"
						+ "Informe a opera��o desejada:\n"
						+ "(1)Adi��o\n"
						+ "(2)Subtra��o\n"
						+ "(3)Multiplica��o\n"
						+ "(4)Divis�o\n"
						+ "(5)Saida\n"
						+ "============================");
			
			double opcao = entrada.nextDouble();
			
			/*
			 * PRIMEIRO IF FORA DO WHILE PARA CASO O USUARIO QUEIRA SAIR SEM FAZER ALGUM CALCULO
			 */
			
			if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) { // VERIFICANDO AS OP��ES
				  System.out.print("Informe o primeiro n�mero: ");
				  double n1 = entrada.nextDouble();
				  System.out.print("Informe o segundo n�mero: ");
				  double n2 = entrada.nextDouble();
				  if(opcao == 1) {
						double somar = n1 + n2;
						System.out.println("Resultado: " + somar); 
					}else if(opcao == 2){
						double subtrair = n1 - n2;
						System.out.println("Resultado: " + subtrair); 
					}else if(opcao == 3) {
						double multiplicar = n1 * n2;
						System.out.println("Resultado: " + multiplicar);
					}else {
						double dividir = n1 / n2;
						System.out.println("Resultado: " + dividir);
					}
			}else {
				System.out.println("Programa Finalizado"); 
			}
				
			while(opcao != 5) {
				
				System.out.println("============================\n"
						+ "Informe a opera��o desejada:\n"
						+ "(1)Adi��o\n"
						+ "(2)Subtra��o\n"
						+ "(3)Multiplica��o\n"
						+ "(4)Divis�o\n"
						+ "(5)Saida\n"
						+ "============================");
				
			   opcao = entrada.nextInt(); 
			   
			   if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) { // VERIFICANDO AS OP��ES
					  System.out.print("Informe o primeiro n�mero: ");
					  double n1 = entrada.nextDouble();
					  System.out.print("Informe o segundo n�mero: ");
					  double n2 = entrada.nextDouble();
					  if(opcao == 1) {
							double somar = n1 + n2;
							System.out.println("Resultado: " + somar); 
						}else if(opcao == 2){
							double subtrair = n1 - n2;
							System.out.println("Resultado: " + subtrair); 
						}else if(opcao == 3) {
							double multiplicar = n1 * n2;
							System.out.println("Resultado: " + multiplicar);
						}else {
							double dividir = n1 / n2;
							System.out.println("Resultado: " + dividir);
						}
				}else {
					System.out.println("Programa Finalizado");
				}
				
			}
				entrada.close();
	}
	
}