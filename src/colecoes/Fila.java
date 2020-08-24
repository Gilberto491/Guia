package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); //Retorna false
		fila.offer("Bia"); //Lan�a uma exce��o
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		// Peek e Element - > obter o pr�ximo elemento da fila (sem remover)
		// Diferen�a � o comportamento quando a fila est� Vazia!
		System.out.println(fila.peek()); //Retorna false
		System.out.println(fila.peek()); //Lan�a uma exce��o
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// Poll e Remove - > obter o pr�ximo elemento da fila e remove!
		// Diferen�a do comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.poll()); //Retorna null
		System.out.println(fila.remove()); //Lan�a uma excer��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); 
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
