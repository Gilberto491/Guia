package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.contentEquals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "pedro";
		var sobrenome = "santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome);
		System.out.printf("%s %s tem %d anos e ganha R$: %.2f",nome,sobrenome,idade,salario);
		
		System.out.println("boa tarde".compareTo("teste"));
		
	}
}
