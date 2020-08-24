package arrays;

import java.util.Arrays;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.0;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 7.4;
		
		
				System.out.println(Arrays.toString(notasAlunoA));
				System.out.println(notasAlunoA[0]);
				System.out.println(notasAlunoA[notasAlunoA.length - 1]);

	double totalAlunoA = 0;
		for(double i:notasAlunoA) {
			totalAlunoA += i;
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		double reforco = 8;
		double[] notasAlunoB = {6.9, 5.7, 8.6, reforco};
		
		double totalAlunoB = 0;
		for (double i: notasAlunoB) {
			totalAlunoB += i;
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
