package br.opet.tds172a.cargos;

import java.util.Date;

/**
 * 
 * @author heral
 *
 */
public class Diretor extends Funcionario {

	public Diretor() {

	}

	public Diretor(String nome, Date dataNascimento, int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}
	
	/**
	 * Sobrescrita do metodo funcionario para classe direto poder imprimir o cargo do funcionario em especifico
	 */
	public boolean baterPonto(Date dataHora) {
		System.out
				.println("Vou bater o ponto do Diretor de matricula: " + this.matricula + "-" + dataHora.toString());
		return true;
	}
}
