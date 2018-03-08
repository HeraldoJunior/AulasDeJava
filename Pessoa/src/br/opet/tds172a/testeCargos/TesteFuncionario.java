package br.opet.tds172a.testeCargos;

import br.opet.tds172a.cargos.Funcionario;
import br.opet.tds172a.cargos.Secretario;
import br.opet.tds172a.cargos.Diretor;
import br.opet.tds172a.cargos.Professor;

public class TesteFuncionario {

	/**
	 * Classe criada para testes referente aos funcionarios/cargos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Inicio dos testes");

		Funcionario novoFuncionario = new Funcionario();
		Secretario novoSecretario = new Secretario();
		Diretor novoDiretor = new Diretor();
		Professor novoProfessor = new Professor();

		System.out.println("Final dos testes");

	}
}
