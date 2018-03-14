package br.opet.tds172a.cargos;

import java.util.Date;

/**
 * 
 * @author heral
 *
 */
public class Professor extends Funcionario {
	
	public Professor(){
		
	}
	
	public Professor(String nome, Date dataNascimento,int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}
	
	/**
	 * Sobrescrita do metodo da classe funcionario para classe direto poder imprimir o cargo do funcionario em especifico
	 */
	public boolean baterPonto(Date dataHora) {
		System.out
				.println("Vou bater o ponto do Professor de matricula: " + this.matricula + "-" + dataHora.toString());
		return true;
	}
	
}
