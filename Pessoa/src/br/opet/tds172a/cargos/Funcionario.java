package br.opet.tds172a.cargos;

import java.util.Date;

import br.opet.tds172a.pessoa.Pessoa;

/**
 * 
 * @author heral
 *
 */
public class Funcionario extends Pessoa {

	/**
	 * Atributos da classe funcionario Sendo eles matricula
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
	public Funcionario(String nome, Date dataNascimento, int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}

	/**
	 * 
	 * get para obter a matricula do funcionario ou das classes herdeiras
	 * 
	 * @return
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * set para inserir a matricula do funcionario ou das classes herdeiras
	 * 
	 * @return
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * metodo baterPonto que bate o ponto de um funcionario armazenando a data e
	 * hora
	 * 
	 * @param dataHora
	 * @return
	 */
	public boolean baterPonto(Date dataHora) {
		System.out
				.println("Vou bater o ponto do Funcionario da matricula: " + this.matricula + "-" + dataHora.toString());
		return true;
	}
}
