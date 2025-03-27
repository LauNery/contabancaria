package Conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		
		int selecao;

		while (true) {

			System.out.println("*############################ MENU ############################*");
			System.out.println("                                                                ");
			System.out.println("                   BANCO ANORA POMME                            ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("                                                                ");
			System.out.println("                1 - Cadastrar Conta                             ");
			System.out.println("                2 - Listagem com todas as Contas                ");
			System.out.println("                3 - Procurar Conta por Número                   ");
			System.out.println("                4 - Atualizar Dados da Conta                    ");
			System.out.println("                5 - Excluir a Conta                             ");
			System.out.println("                6 - Saque                                       ");
			System.out.println("                7 - Depósito                                    ");
			System.out.println("                8 - Transferência de valores entre contas       ");
			System.out.println("                9 - Sair                                        ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("Entre na a opção desejada:                                      ");
			System.out.println("                                                                ");
			
			selecao = lerScanner.nextInt();
			
			if (selecao == 9) {
				System.out.println("\nBanco Anora Pomme - Evolução para o seu sucesso!");
				sobre();
			lerScanner.close();
				System.exit(0);
			}
			
			switch (selecao) {
			case 1: 
				System.out.println("Cadastrar a Conta\n\n");
				
				break;
			
		    case 2:
		    	System.out.println("Listagem com todas as Contas\n\n");
		    	
		    	break;
		    	
		    case 3:	
		    	System.out.println("Procurar Conta por Número\n\n");
		    	
		    	break;
		    	
		    case 4:
		    	System.out.println("Atualizar Dados da Conta\n\n");
		    	
		    	break;
		    	
		    case 5: 
		    	System.out.println("Excluir a Conta\n\n");
		    	
		    	break;
		    	
		    case 6:
		    	System.out.println("Saque\n\n");
		    	
		    	break;
		    	
		    case 7: 
		    	System.out.println("Depósito\n\n");
		    	
		    	break;
		    	
		    case 8:	
		    	System.out.println("Transferência de valores entre contas\n\n");
		    	
		    	break;
			default:
				System.out.println("\nOpção Inválida - Tente Novamente!\n");
				break;
			}
		}

	}
	
	private static void sobre() {
		System.out.println("\n*********************************************************************");
		System.out.println("Projeto Desenvolvido por: Laura Nery ");
		System.out.println("Generation Brasil - lauran@genstudents.org");
		System.out.println("***********************************************************************");
	}
}
