package classe;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui!
	
	public static void main(String[] args) {
		
		PrimeiroTrauma b = new PrimeiroTrauma();
		PrimeiroTrauma a = b;
		
		// pode mexer aqui
		System.out.println(a.a); // pode mexer aqui
		// pode mexer aqui
		
	}
}
