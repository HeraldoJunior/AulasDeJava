package br.opet.tds172a.maintestesdiversos;

import java.util.Date;

import br.opet.tds172a.cargos.Diretor;
import br.opet.tds172a.cargos.Funcionario;
import br.opet.tds172a.cargos.Professor;
import br.opet.tds172a.cargos.Secretario;

public class MainHeranca {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		/**
		 * criação e impressao de Funcionario
		 */
		Funcionario f = new Funcionario();

		f.setNome("Joao Funcionario");
		f.setDataNascimento(new Date("01/01/2001"));
		f.setMatricula(123);
		Date dataHora = new Date();
		boolean retornoPonto = f.baterPonto(dataHora);

		// System.out.println("Nome: " + f.getNome() + " - " + "Data Nascimento: "
		// +f.getDataNascimento() + " - " + "Matricula: " + f.getMatricula());

		if (retornoPonto) {
			System.out.println("Ponto Batido com sucesso! " + "Nome: " + f.getNome() + " - " + "Data Nascimento: "
					+ f.getDataNascimento());
		} else {
			System.out.println("Ponto não batido, tente novamente!");
		}

		System.out.println(" ");
		System.out.println("--------------------------------------------------------------");
		System.out.println(" ");

		Diretor d = new Diretor();
		d.setNome("Joao Diretor");
		d.setDataNascimento(new Date("02-02-2002"));
		d.setMatricula(124);
		dataHora = new Date();
		retornoPonto = d.baterPonto(dataHora);

		if (retornoPonto) {
			System.out.println("Ponto Batido com sucesso! " + "Nome: " + f.getNome() + " - " + "Data Nascimento: "
					+ f.getDataNascimento());
		} else {
			System.out.println("Ponto não batido, tente novamente!");
		}

		System.out.println(" ");
		System.out.println("--------------------------------------------------------------");
		System.out.println(" ");

		Professor p = new Professor();
		p.setNome("Joao Professor");
		p.setDataNascimento(new Date("03-03-2003"));
		p.setMatricula(125);
		dataHora = new Date();
		retornoPonto = p.baterPonto(dataHora);

		if (retornoPonto) {
			System.out.println("Ponto Batido com sucesso! " + "Nome: " + f.getNome() + " - " + "Data Nascimento: "
					+ f.getDataNascimento());

		} else {
			System.out.println("Ponto não batido, tente novamente!");
		}

		System.out.println(" ");
		System.out.println("--------------------------------------------------------------");
		System.out.println(" ");

		Secretario s = new Secretario();
		s.setNome("Joao Secretario");
		s.setDataNascimento(new Date("04-04-2004"));
		s.setMatricula(126);
		dataHora = new Date();
		retornoPonto = s.baterPonto(dataHora);

		if (retornoPonto) {
			System.out.println("Ponto Batido com sucesso! " + "Nome: " + f.getNome() + " - " + "Data Nascimento: "
					+ f.getDataNascimento());
		} else {
			System.out.println("Ponto não batido, tente novamente!");
		}

	}

}
