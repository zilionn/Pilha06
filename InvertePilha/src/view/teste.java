package view;

import java.util.Stack;

public class teste {
	 public static void main(String[] args) {
	        Stack<Integer> pilhaOriginal = new Stack<>();
	        pilhaOriginal.push(14);
	        pilhaOriginal.push(26);
	        pilhaOriginal.push(38);
	        pilhaOriginal.push(15);
	        pilhaOriginal.push(5);
	        pilhaOriginal.push(39);
	        pilhaOriginal.push(11);
	        pilhaOriginal.push(25);
	        pilhaOriginal.push(22);
	        pilhaOriginal.push(20);
	        pilhaOriginal.push(17);
	        pilhaOriginal.push(1);

	        inverterPilha(pilhaOriginal);

	        // Imprimindo a pilha original invertida
	        System.out.println("Pilha Original Invertida:");
	        while (!pilhaOriginal.isEmpty()) {
	            System.out.println(pilhaOriginal.pop());
	        }
	    }

	    // Método para inverter a pilha original
	    public static void inverterPilha(Stack<Integer> pilha) {
	        if (pilha.isEmpty()) {
	            return;
	        }

	        int elemento = pilha.pop();
	        inverterPilha(pilha);

	        insereNoFundo(pilha, elemento);
	    }

	    // Método para inserir um elemento no fundo da pilha
	    public static void insereNoFundo(Stack<Integer> pilha, int elemento) {
	        if (pilha.isEmpty()) {
	            pilha.push(elemento);
	            return;
	        }

	        int temp = pilha.pop();
	        insereNoFundo(pilha, elemento);
	        pilha.push(temp);
	    }
	}