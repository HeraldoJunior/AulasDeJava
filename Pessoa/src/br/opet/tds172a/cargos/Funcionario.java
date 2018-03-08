package br.opet.tds172a.cargos;

import br.opet.tds172a.pessoa.Pessoa;

/**
 * 
 * @author heral
 *
 */
public class Funcionario extends Pessoa {

	/**
	 * Atributos da classe funcionario Sendo eles matricula e nome
	 */
	public int matricula;

	/**
	 * Construtor Funcionario da classe Funcionario que está vazio
	 */
	public Funcionario() {

	}

	/**
	 * Construtor Funcionario da classe Funcionario
	 * 
	 * @param matricula
	 * @param nome
	 */
	public Funcionario(String nome, String dataNascimento,int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
