package fundamentos.tarefas;

import java.util.Scanner;

public class Tarefa3 {
 public static void main(String[] args) {
	 /*
	  * Criar um programa que leia o peso e 
	  * a altura do usu�rio e imprima no 
	  * console o IMC.
	  */
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Informe seu Peso: ");
	 double peso = entrada.nextDouble();
	 System.out.println("Informe sua altura: ");
	 double altura = entrada.nextDouble();
	 
	 double calculo = peso/(altura*altura);
	 
			 
	 System.out.println("seu IMC � de: " + calculo);
	 
	 entrada.close();
}
}
