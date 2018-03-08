package br.opet.tds172a.teste;

import br.opet.tds172a.pessoa.Pessoa;

/**
 * 
 * @author Heraldo 
 * @since 19/02/2018
 * @version 1.0.1
 * 			Esta classe serve para efetuar os testes durante a aula.0
 * 
 */
public class MainTestes {
	
	/**
	 * Construtor da classe MainTestesW
	 */
	public MainTestes() 
	{
		System.out.println("Construtor MainTestes()");
	}

	public static void main(String[] args) {

		/**
		 * print para identificar inicio do programa na console
		 */
		System.out.println("Inicio");

		/**
		 * Criação dos objetos pessoa a partir da classe Pessoa
		 */
		//Pessoa pessoa = new Pessoa();
		//Pessoa pessoaDaOutraTurma = new Pessoa();
		Pessoa pessoaDaOutraEscola = new Pessoa();
		
		


		/**
		 * informando os dados da pessoa e pegando o nome e data denascimento
		 */
		pessoaDaOutraEscola.informarPessoa("Enzo", "02-02-2000");
		String nomeRetornado = pessoaDaOutraEscola.getNome();
		String dataNascimentoRetornada = pessoaDaOutraEscola.getDataNascimento();

		/**
		 * Impressão do nome e data de nascimento retornados
		 */
		System.out.println(nomeRetornado);
		System.out.println(dataNascimentoRetornada);

		/**
		 * informando os dados da pessoa e pegando o nome e data denascimento
		 */
		pessoaDaOutraEscola.informarPessoa("Valentina", "01-01-1999");
		nomeRetornado = pessoaDaOutraEscola.getNome();
		dataNascimentoRetornada = pessoaDaOutraEscola.getDataNascimento();

		/**
		 * Impressão do nome e data de nascimento retornados
		 */
		System.out.println(nomeRetornado);
		System.out.println(dataNascimentoRetornada);

		/**
		 * print para identificar fim do programa na console
		 */
		System.out.println("Fim");

	}

}