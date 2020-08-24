package classe;

public class ValorVsReferencia {
		
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)
		
		a++;
		b--;
			
		System.out.println(a+" "+b);
		
		Data d1 = new Data(1,6,2022);
		Data d2 = d1; // atribuição por referência (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		int c = 5;
		voltarPrimitivo(c);
		System.out.println(c);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	static void voltarDataParaPadrao(Data d){
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	static void voltarPrimitivo(int c) {
		c = 5;
	}
}
