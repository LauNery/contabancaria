package conta_model;

public class Conta {
		
		private int numero;
			private int agencia;
			private int tipo;
			private String titular;
			private float saldo;
			
			public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
				super();
				this.numero = numero;
				this.agencia = agencia;
				this.tipo = tipo;
				this.titular = titular;
				this.saldo = saldo;
			}

			public int getNumero() {
				return numero;
			}

			public void setNumero(int numero) {
				this.numero = numero;
			}

			public int getAgencia() {
				return agencia;
			}

			public void setAgencia(int agencia) {
				this.agencia = agencia;
			}

			public int getTipo() {
				return tipo;
			}

			public void setTipo(int tipo) {
				this.tipo = tipo;
			}

			public String getTitular() {
				return titular;
			}

			public void setTitular(String titular) {
				this.titular = titular;
			}

			public float getSaldo() {
				return saldo;
			}

			public void setSaldo(float saldo) {
				System.out.println("\nSaldo Suficiente......");
				this.saldo = saldo;
			}
			public boolean deposito(Float valor) {
				
				if(this.getSaldo() < valor) {
					return false;
				}
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("\nDepósito realizado com sucesso! ");
				return true;
			}
			
			public boolean transferencia(Float valor) {
				if(this.getSaldo() < valor) {
					return false;
				}
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("\nTransferência concluída!......");
				return true;
			}
			public void visualizar() {
				String tipo = "";
				
				switch(this.tipo) {
				case 1: 
					tipo = "Conta Corrente";
					break;
				}
				
				System.out.println("\n\n***********************************************************");
				System.out.println("Dados da Conta: ");
				System.out.println("************************************************************");
				System.out.println("Número da Conta: " + this.numero);
				System.out.println("Agência: " + this.agencia);
				System.out.println("Tipo de Conta: " + tipo);
				System.out.println("Titular: " + this.titular);
				System.out.println("Saldo: " + this.saldo);
				System.out.println("\n......Início do Menu! ");
			}
	}


