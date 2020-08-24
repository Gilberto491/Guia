package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		//alunos ?
		//nota valida
		//total = nota valida
		//-1
		Scanner entrada = new Scanner(System.in);

		int contador=0;
		double total=0,media,nota=0;
		
		while(nota!=-1) {
			System.out.print("Informe uma nota válida: ");
			nota = entrada.nextDouble();
			if(nota>=0 && nota<=10) {
				total += nota;
				contador++;
			}else if(nota!=-1){
				System.out.println("Informe uma nota válida por favor");
			}
			
		}
		
		media = total/contador;
		System.out.printf("A Media do(s) %d aluno(s) é igual a: %.2f",contador,media);
		entrada.close();
	}
}
