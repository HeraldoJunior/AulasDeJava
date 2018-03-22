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
	
	public static void main(String[] args) throws Exception {

		/**
		 * Arraylist para listagem de funcionarios
		 */
		List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
		
		/**
		 * Formatação da data para utilizar do mesmo padrão em mais ocasiões caso necessario
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
			System.out.println("2 - Listar Funcionario");
			System.out.println("3 - Remover todos os Funcionarios");
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
				 * inserção de um funcionario na lista por meio da criação do objeto com "novoFuncionario"
				 */
				listaDeFuncionarios.add(novoFuncionario);

				/**
				 * leitura do que for inserido na console para armazenar o nome do usuario
				 */
				System.out.println("Cadastro do funcionario concluido com sucesso!");
				/**
				 * lista de funcionarios recebendo o funcionario novo e o contador incrementando
				 * 1 posição para não sobrescrever
				 */
				// listaDeFuncionarios[contador++] = funcionarioNovo;

				/**
				 * Opção de listar os funcionarios existentes
				 */

				break;

			case 2: {
				/**
				 * Opção para listar os funcionarios criados 
				 * 
				 * Arrumar a formatação da data.
				 * 
				 */
				if(listaDeFuncionarios.size() == 0) {
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

				
				// usando lista
				// System.out.println("Lista Funcionarios: ");
				// System.out.println("--------------------------------");
				// System.out.println("Data de Nascimento - Nome ");

				// for (int j = 0; j < listaFuncionarios.length; j++) {
				// System.out.println(listaFuncionarios[j].getNome() + " - " +
				// listaFuncionarios[j].getMatricula()
				// + " - " + sdf.format(listaFuncionarios[j].getDataNascimento()));
				// }

				/**
				 * Para casos onde tenha posições vazias dentro da lista
				 * 
				 */

				// for (int j = 0; j < listaFuncionarios.length; j++) {

				// if(listaFuncionarios[j] != null){
				// System.out.println(listaFuncionarios[j].getNome() + " - "
				// +listaFuncionarios[j].getMatricula() + " - " +
				// sdf.format(listaFuncionarios[j].getDataNascimento())); } }
				break;
			}
			
			case 3:
				
				for (int i = listaDeFuncionarios.size() - 1; i >= 0; i--) {
					listaDeFuncionarios.remove(i);
					
					System.out.println("Funcionario " + i + " Excluidos com sucesso!");

				}

			case 9:
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
		} while (menu < 9);

		/**
		 * Mensagens finais do sistema para informar o fim da execução
		 */
		System.out.println("Volte Sempre!");
		System.out.println("Fim");

	}
}
