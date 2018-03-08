package br.opet.tds172a.MainTestesDiversos;

import com.opet.util.Reader;

import br.opet.tds172a.cargos.Funcionario;

/**
 * 
 * @author Heraldo
 * @since 19/02/2018
 * @version 1.0.1 Esta classe serve para efetuar os testes durante a aula para
 *          efetuar o cadastro de varios objetos com vetor
 * 
 */
public class MainTesteLoop {

	/**
	 * 
	 */
	// public static final int TAMANHO_LISTA_FUNCIONARIOS = 3;

	public static void main(String[] args) throws Exception {
		/**
		 * array/vetor de 5 posições indo de 0 a 4
		 */
		// String[] listaTextos = new String[5];

		/**
		 * colocando algo dentro de uma posição
		 */
		// listaTextos[0] = "casa";
		// listaTextos[1] = "carro";
		// listaTextos[2] = "escola";
		// listaTextos[3] = "familia";
		// listaTextos[4] = "trabalho";

		/**
		 * imprimindo o que tem em uma posição especifica
		 */
		// System.out.println(listaTextos[1]);

		// --------------------------------------------------------------------------------------------------------
		/**
		 * vetor/array de funcionarios(objeto)
		 */
		// Funcionario[] listaFuncionarios = new Funcionario[5];

		/**
		 * construição do objeto funcionario já colocando os atributos
		 */
		// listaFuncionarios[0] = new Funcionario(1,"Joao");
		// listaFuncionarios[1] = new Funcionario(2,"Maria");
		// listaFuncionarios[2] = new Funcionario(3,"Marta");
		/**
		 * Metodo set para inserir/alterar o
		 */
		// listaFuncionarios[1].setNome("Carlos");

		/**
		 * imprimir funcionario da lista com seus respectivos atributos que existe na
		 * classe funcionarios
		 */
		// System.out.println(listaFuncionarios[1].getMatricula()+"-"+listaFuncionarios[1].getNome());
		// ----------------------------------------------------------------------------------------------------------
		System.out.println("Inicio");

		int i = 0;
		do {
		

			Funcionario[] listaFuncionarios = new Funcionario[i];
			System.out.println("Insira a Matricula do funcionario temporario e aperte enter!");
			int matricula = Reader.readInt();
			System.out.println("Insira a Nome do funcionario temporario e aperte enter!");
			String nome = Reader.readString();

			// Funcionario funcTempo = new Funcionario(matricula,nome);
			// listaFuncionarios[i] = funcTempo;
			/**
			 *
			 * imprimir funcionario da lista com seus respectivos atributos que existe na
			 * classe funcionarios
			 */
			// System.out.println("Matricula:" + listaFuncionarios[0].getMatricula() + " - "
			// + "Nome:" + listaFuncionarios[0].getNome());

			i++;
		} while (i < 21);

		System.out.println("Fim");

	}

}
