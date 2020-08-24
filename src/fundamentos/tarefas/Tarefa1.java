package fundamentos.tarefas;

import java.util.Scanner;

public class Tarefa1 {
 public static void main(String[] args) {
	 
	System.out.println("Informe a temperatura em Celsius: ");
	Scanner entrada = new Scanner(System.in);
	double temperatura = entrada.nextDouble();
	
	double conversao = 1.8 * temperatura + 32;
	System.out.println("A temperatura é igual a " + conversao);
	entrada.close();
//F=1,8C+32
}
}
