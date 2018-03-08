package br.opet.tds172a.cargos;

/**
 * 
 * @author heral
 *
 */
public class Secretario extends Funcionario {

	public Secretario(){
		
	}
	
	public Secretario(String nome, String dataNascimento, int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}
}
