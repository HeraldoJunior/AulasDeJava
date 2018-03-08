package br.opet.tds172a.cargos;

/**
 * 
 * @author heral
 *
 */
public class Professor extends Funcionario {
	
	public Professor(){
		
	}
	
	public Professor(String nome, String dataNascimento,int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}
	
}
