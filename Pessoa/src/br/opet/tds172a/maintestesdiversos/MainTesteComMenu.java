package br.opet.tds172a.maintestesdiversos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opet.util.Reader;

import br.opet.tds172a.cargos.Funcionario;

/**
 * 
 * @author Heraldo
 * @since 19/02/2018
 * @version 1.0.1 Esta classe serve para efetuar os testes durante a aula para
 *          efetuar o cadastro de varios objetos com vetor
 * 
 */
public class MainTesteComMenu {

	/**
	 * constante que determina o tamanho da lista de funcionarios
	 * 
	 * constante é um valor que nunca irá se alterar por hipotese alguma
	 */
	public static final int TAMANHO_LISTA_FUNCIONARIOS = 2;

	public static void main(String[] args) throws Exception {

		/**
		 * 
		 */
		Funcionario[] listaFuncionarios = new Funcionario[TAMANHO_LISTA_FUNCIONARIOS];
		/**
		 * Declaração da variavel menu para utilização na switch
		 */
		int menu;

		/**
		 * variavel contador para efetuar a contagem até o maximo da lista
		 */
		int contador = 0;

		/**
		 * looping para execução do menu e das operações necessarias de acordo com a
		 * opção.
		 */
		
		
		do {
			/**
			 * Mensagens de boas vindas, e instruções das opções.
			 */
			System.out.println("Bem Vindo Ao Menu");
			System.out.println("Digite a opção desejada");
			System.out.println("1 - Adicionar Funcionario");
			System.out.println("1 - Listar Funcionario");
			System.out.println("9 - Sair do Sistema");

			/**
			 * leitor para receber a opção do menu
			 */
			menu = Reader.readInt();

			/**
			 * opções dos menus por meio de switch e case
			 */
			switch (menu) {

			/**
			 * Opção para adicionar um novo funcionario, incrementando uma posição ao final
			 * do processo com mensagens amigaveis.
			 * 
			 */
			case 1:

				/**
				 * pergunta para o usuario inserir a matricula do funcionario a ser cadastrado
				 */
				System.out.println("Insira a Matricula do funcionario e aperte enter!");
				/**
				 * leitura do que for inserido na console para armazenar a matricula do usuario
				 */
				int matricula = Reader.readInt();

				/**
				 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
				 */
				System.out.println("Insira a Nome do funcionario e aperte enter!");
				/**
				 * leitura do que for inserido na console para armazenar o nome do usuario
				 */
				String nome = Reader.readString();
				
				/**
				 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
				 */
				System.out.println("Insira a Data de Nascimento do funcionario e aperte enter!");
				/**
				 * leitura do que for inserido na console para armazenar o nome do usuario
				 */
				String dataNascimentoString = Reader.readString();
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

				Date dataNascimento =  sdf.parse(dataNascimentoString);
				
				

				/**
				 * Inicialização do objeto funcionario com matricula e nome
				 */
				Funcionario funcionarioNovo = new Funcionario(nome, dataNascimento, matricula);
				
				

				/**
				 * leitura do que for inserido na console para armazenar o nome do usuario
				 */
				System.out.println("Cadastro do funcionario concluido com sucesso!");
				/**
				 * lista de funcionarios recebendo o funcionario novo e o contador incrementando
				 * 1 posição para não sobrescrever
				 */
				listaFuncionarios[contador] = funcionarioNovo;
				contador++;

				/**
				 * Opção de listar os funcionarios existentes
				 */
			case 2: {

				sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Lista Funcionarios: ");
				for (int contadorListagem = 0; contadorListagem < listaFuncionarios.length; contadorListagem++) {
					System.out.println(sdf.format(listaFuncionarios[contador].getDataNascimento()) + "-"
							+ listaFuncionarios[contadorListagem].getNome());
				}
			}

			case 9:
				System.out.println("Obrigado por utilizar o Sistema!");
				break;
			/**
			 * Opção para caso alguma outra tecla seja in incorreta seja inserida, mensagem
			 * amigavel ao usuario explicando
			 */
			default:
				System.out.println("Opção invalida, digite novamente.");
				break;
			}
			/**
			 * final do looping informando quando o memso irá ser finalizado
			 */
		} while (menu < 9);

		/**
		 * Mensagens finais do sistema para informar o fim da execução
		 */
		System.out.println("Volte Sempre!");
		System.out.println("Fim");

	}
}
