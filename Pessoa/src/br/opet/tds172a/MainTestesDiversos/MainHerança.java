package br.opet.tds172a.MainTestesDiversos;

import br.opet.tds172a.cargos.Diretor;
import br.opet.tds172a.cargos.Funcionario;
import br.opet.tds172a.cargos.Professor;
import br.opet.tds172a.cargos.Secretario;

public class MainHerança {

	public static void main(String[] args) {

		/**
		 * criação e impressao de Funcionario
		 */
		Funcionario f = new Funcionario();

		f.setNome("Joao Funcionario");
		f.setDataNascimento("01-01-2000");
		f.setMatricula(123);

		System.out.println("Nome: " + f.getNome());
		System.out.println("Data Nascimento: " + f.getDataNascimento());
		System.out.println("Matricula: " + f.getMatricula());

		/**
		 * criação e impressao de professor
		 */
		Professor p = new Professor();

		p.setNome("Joao Professor");
		p.setDataNascimento("01-01-2000");
		p.setMatricula(124);

		System.out.println("Nome: " + p.getNome());
		System.out.println("Data Nascimento: " + p.getDataNascimento());
		System.out.println("Matricula: " + p.getMatricula());

		/**
		 * criação e impressao de diretor
		 */
		Diretor d = new Diretor();

		d.setNome("Joao Diretor");
		d.setDataNascimento("01-01-2000");
		d.setMatricula(125);

		System.out.println("Nome: " + d.getNome());
		System.out.println("Data Nascimento: " + d.getDataNascimento());
		System.out.println("Matricula: " + d.getMatricula());

		/**
		 * criação e impressao de secretario
		 */
		Secretario s = new Secretario();

		s.setNome("Joao Secretario");
		s.setDataNascimento("01-01-2000");
		s.setMatricula(126);

		System.out.println("Nome: " + s.getNome());
		System.out.println("Data Nascimento: " + s.getDataNascimento());
		System.out.println("Matricula: " + s.getMatricula());

	}

}
