package br.opet.tds172a.maintestesdiversos;

import java.util.ArrayList;
import java.util.Vector;

public class MainTesteComArrayVectorArrayList {

	public static final int MAX_ITENS = 10;

	public static void main(String[] args) {

		/**
		 * LISTA COM ARRAY tem que ditar o tamanho tem que botar a posição que quer
		 * colocar
		 * 
		 */
		String[] meuArray = new String[2];
		meuArray[0] = "Joao Array";
		meuArray[1] = "Maria Array";
		System.out.println("-------------------------");
		System.out.println("Nomes Imprindo com Array");
		for (int i = 0; i < meuArray.length; i++) {

			System.out.println(meuArray[i]);
		}

		/**
		 * LISTA COM VECTOR
		 * 
		 * Não se preocupe com alocação ele aloca na primeira posição disponivel
		 * Posições de 0 a 1 para colocar na list usa add para retirar da lista usa
		 * remove
		 *
		 */

		Vector<Integer> listaVectorString = new Vector<Integer>();
		System.out.println("-------------------------");
		System.out.println("Nomes Imprindo com Vector");
		long inicioLong2 = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaVectorString.add(i);
		}
		long fimLong2 = System.nanoTime();

		System.out.println("Vector add...: " + (fimLong2 - inicioLong2));

		/**
		 * Lista com arraylist
		 * 
		 */
		/*
		 * ArrayList<String> listaArrayListString = new ArrayList<String>();
		 * 
		 * listaArrayListString.add("Joao ArrayList");
		 * listaArrayListString.add("Maria ArrayList");
		 * 
		 * System.out.println("-------------------------");
		 * System.out.println("Nomes Imprindo com Array List"); 
		 * for (int i = 0; i < listaArrayListString.size(); i++){ 
		 * String objRecuperado = listaArrayListString.get(i);
		 * 
		 * System.out.println(objRecuperado); }
		 */

		/**
		 * Lista com arraylist sem colocar o tipo da arraylist
		 * 
		 */

		ArrayList<Integer> listaArrayListStringSem = new ArrayList<>();

		/**
		 * vai iniciar o add dos listes
		 */
		long inicioLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaArrayListStringSem.add(i);
		}
		long fimLong = System.nanoTime();

		System.out.println("Arraylist add...: " + (fimLong - inicioLong));

	}

}
