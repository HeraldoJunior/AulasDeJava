package br.opet.tds172a.cargos;

/**
 * 
 * @author heral
 *
 */
public class Diretor extends Funcionario{
	
	public Diretor(){
		
	}

	public Diretor(String nome, String dataNascimento,int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}
}
