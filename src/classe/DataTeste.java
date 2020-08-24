package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data um = new Data();
		um.ano = 2021;
		
		Data dois = new Data(31,12,2020);
	
		
		System.out.printf(""
				+ um.obterDataFormatada());
		System.out.printf("\n"
				+ dois.obterDataFormatada());
		
		
		
	
	}
}
