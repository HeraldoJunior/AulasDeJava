package br.opet.tds172a.maintestesdiversos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opet.util.Reader;

import br.opet.tds172a.cargos.Funcionario;
import br.opet.tds172a.util.MyReader;

/**
 * 
 * @author Heraldo
 * @since 19/02/2018
 * @version 1.0.1 Esta classe serve para efetuar os testes durante a aula para
 *          efetuar o cadastro de varios objetos com vetor
 * 
 */
public class MainComMenu {

	/**
	 * constante que determina o tamanho da lista de funcionarios
	 * 
	 * constante é um valor que nunca irá se alterar por hipotese alguma
	 */
	// public static final int TAMANHO_LISTA_FUNCIONARIOS = 2;

	/**
	 * OPÇÕES DECLARADAS POR MEIO DE CONSTANTE PARA FACILITAR O ENTENDIMENTO DO
	 * CODIGO
	 */
	public static final int OPCAO_ADICIONAR = 1;
	public static final int OPCAO_LISTAR = 2;
	public static final int OPCAO_ALTERAR = 3;
	public static final int OPCAO_REMOVER = 4;
	public static final int OPCAO_SAIR = 9;

	public int alteracaoFuncionario;

	public static void main(String[] args) throws Exception {

		/**
		 * Arraylist para listagem de funcionarios
		 */
		List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();

		/**
		 * Formatação da data para utilizar do mesmo padrão em mais ocasiões caso
		 * necessario
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);

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
			System.out.println("2 - Listar Funcionarios");
			System.out.println("3 - Alterar Funcionario(Somente Nome e Data de Nascimento)");
			System.out.println("4 - Remover Funcionario pela Matricula");
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
			case OPCAO_ADICIONAR:

				/**
				 * pergunta para o usuario inserir a matricula do funcionario a ser cadastrado
				 */
				System.out.println("Insira a Matricula do funcionario e aperte enter!");
				/**
				 * leitura do que for inserido na console para armazenar a matricula do usuario
				 */
				int matricula = MyReader.readInt();

				/**
				 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
				 */
				System.out.println("Insira a Nome do funcionario e aperte enter!");
				/**
				 * leitura do que for inserido na console para armazenar o nome do funcionario
				 */
				String nome = MyReader.readString();

				/**
				 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
				 */
				System.out.println("Insira a Data de Nascimento do funcionario e aperte enter!");
				/**
				 * leitura do que for inserido na console para armazenar a data de nascimento do
				 * funcionario
				 */
				Date dataNascimento = MyReader.readDate();

				/**
				 * criação do objeto funcionario que é recebido por "novoFuncionario"
				 */
				Funcionario novoFuncionario = new Funcionario(nome, dataNascimento, matricula);
				/**
				 * inserção de um funcionario na lista por meio da criação do objeto com
				 * "novoFuncionario"
				 */
				listaDeFuncionarios.add(novoFuncionario);

				break;

			case OPCAO_LISTAR: {
				/**
				 * Opção para listar os funcionarios criados
				 * 
				 * Arrumar a formatação da data.
				 * 
				 */
				if (listaDeFuncionarios.size() == 0) {
					System.out.println("Não existem funcionarios cadastrados");
					break;
				}
				System.out.println("-------------------------");
				System.out.println("Nomes Imprindo a Lista com Array List");
				for (int i = 0; i < listaDeFuncionarios.size(); i++) {
					Funcionario funcionarioRecuperado = listaDeFuncionarios.get(i);

					System.out.println(
							"Nome.: " + funcionarioRecuperado.nome + "- Matricula.: " + funcionarioRecuperado.matricula
									+ " - Data de Nascimento.: " + sdf.format(funcionarioRecuperado.dataNascimento));
				}

				break;
			}
			/**
			 * Opção de alterar o funcionario
			 */
			case OPCAO_ALTERAR:
				System.out.println("Insira a matricula do funcionario a ser removido");
				int matriculaProcurada = MyReader.readInt();

				for (int i = 0; i < listaDeFuncionarios.size(); i++) {
					
					if (matriculaProcurada == listaDeFuncionarios.get(i).getMatricula()) {

						/**
						 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
						 */
						System.out.println("Insira a Nome do funcionario e aperte enter!");
						/**
						 * leitura do que for inserido na console para armazenar o nome do funcionario
						 */
						nome = MyReader.readString();

						/**
						 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
						 */
						System.out.println("Insira a Data de Nascimento do funcionario e aperte enter!");
						/**
						 * leitura do que for inserido na console para armazenar a data de nascimento do
						 * funcionario
						 */
						dataNascimento = MyReader.readDate();
						/**
						 * get e set do nome da data de nascimento para alterar o cadastro do funcionario
						 */
						listaDeFuncionarios.get(i).setNome(nome);
						listaDeFuncionarios.get(i).setDataNascimento(dataNascimento);
						System.out.println("Alterado com sucesso!");

					}else {
						System.out.println("Não Alterado!");

					}
				}
				break;

			case OPCAO_REMOVER:

				System.out.println("Insira a matricula do funcionario a ser removido");
				matriculaProcurada = MyReader.readInt();

				for (int i = 0; i < listaDeFuncionarios.size(); i++) {
					if (matriculaProcurada == listaDeFuncionarios.get(i).getMatricula()) {

						System.out.println("Dados do funcionário com a matricula " + matriculaProcurada + ":\nNome: "
								+ listaDeFuncionarios.get(i).getNome() + " - Data de nascimento: "
								+ sdf.format(listaDeFuncionarios.get(i).getDataNascimento()));
						System.out.println("Deseja remover o funcionario da matricula " + matriculaProcurada
								+ "? (Digite 1 parasim ou 2 para não");
						int opcaoEscolhida = MyReader.readInt();
						if (opcaoEscolhida == 1) {
							listaDeFuncionarios.remove(i);
							System.out.println("Funcionário removido com sucesso");

						}else {
							System.out.println("Funcionario não removido!");
						}
					}
				}
				break;

			case OPCAO_SAIR:
				System.out.println("--------------------------------");

				System.out.println("Obrigado por utilizar o Sistema!");
				System.out.println("Até a Proxima!");

				System.out.println("--------------------------------");

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
		} while (menu < OPCAO_SAIR);

		/**
		 * Mensagens finais do sistema para informar o fim da execução
		 */
		System.out.println("Volte Sempre!");
		System.out.println("Fim");

	}
}
