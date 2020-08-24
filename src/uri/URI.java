package uri;

import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI {
 
    public static void main(String[] args)  {
    
 
    	Scanner scan = new Scanner(System.in);
    	int n1 = scan.nextInt();
    	int n2 = scan.nextInt();
    	int resultado = 0;
    	for(int i = 1; i <=n2; i++){
    	resultado += n1;
    	}
    	System.out.println(resultado);
    	}
    }
 
