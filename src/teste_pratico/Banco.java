package teste_pratico;

public class Banco {
	//atributos:
	
	public int conta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
	System.out.println("Conta: " + this.getConta());
	System.out.println("Tipo: " + this.getTipo());
	System.out.println("Dono: " + this.getDono());
	System.out.println("Saldo: " + this.getSaldo());
	System.out.println("Status: " + this.getStatus());
	}
	
	
	public void Banco() {
		this.setSaldo (0);
		this.setStatus(false);
	}
	
	
	//Metodos personalizados:
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);

		} else if (tipo == "CP"){
			this.setSaldo(150)	;
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() >= 0) {
			System.out.println("Conta não pode ser fechada, há saldo disponivel!");
		} else if (this.getSaldo() <= 0) {
			System.out.println("Conta não pode ser fechada, há saldo debitos pendentes!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
			//this.saldo = saldo + valor;
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito de R$ " + valor + " reais realizado na conta de " + this.getDono() + " com sucesso!");
		} else {
			System.out.println("Impossivel realizar deposito em uma conta fechada!");
			}
		}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);	
			System.out.println("Saque realizado de R$ " + valor + " reais realizado com sucesso na conta de " + getDono());
		} else {
			System.out.println("saldo insuficiente para saque na conta de " + getDono());
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int v;
		if (this.getTipo() == "CC") {
			v = 12;
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Taxa de 12 reais paga com sucesso!");
		} else if (this.getTipo() == "CP"){
			v = 20;
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Taxa de 20 reais paga com sucesso!");
		
		}else {
			System.out.println("conta fechada!");
		}
	}

	
	//Metodos especiais:

	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDono() {
		return dono;
	}


	public void setDono(String dono) {
		this.dono = dono;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
 
	
}
