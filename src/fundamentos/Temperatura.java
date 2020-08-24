package fundamentos;
import java.util.Scanner;

public class Temperatura {
  private static Scanner rel;
  	public static void main(String[] args) {
		float conversao;
		double aux = 1.8;
		int kelvin = 273, fahrenheit = 31;
		rel = new Scanner(System.in);
		
		do {
			  System.out.println("--------------------------------------------------");
		      System.out.println("Escolha para qual temperatura deseja converter: ");
		      System.out.println("[1] Celsius para Fahrenheit");
		      System.out.println("[2] Celsius para Kelvein");
		      System.out.println("[3] Finalizar");
		      System.out.println("--------------------------------------------------");
		     
		      conversao = rel.nextFloat();
		      System.out.println("Informe a temperatura: ");
		      float temperatura = rel.nextFloat();
		      
		      if(conversao == 1) {
		    	  double resultado = aux*temperatura+fahrenheit;
		    	  System.out.println("a temperatura de Celsius para Fahrenheit é: " + resultado);
		      }else if(conversao == 2) {
		    	  double resultado = (temperatura + kelvin);
		    	   System.out.println("a temperatura de Celsius para Kelvin é: " + resultado);
		      }else {
		    	  System.out.println("operação invalida");
		      }
		      
		}while(conversao!=3);
	}
}