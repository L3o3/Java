package entities;

public abstract class Conta {

	private Integer conta;
	private String titular;
	protected Double saldo;
		
	public Conta() {
	}
	
	public Conta(Integer conta, String titular, Double saldo) {
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitulat(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(Double Saldo) {
		saldo -= Saldo + 5.0;
	}

	public void deposit(double Saldo) {
		saldo += Saldo;
	}
}