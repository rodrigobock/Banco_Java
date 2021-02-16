package core;

import core.Interfaces.IConta;

public class ContaVip extends Conta implements IConta {

	public ContaVip(int NumConta, double SaldoConta, String NomeUsuario) {
		super(NumConta, SaldoConta, NomeUsuario);
	}

	public static void main(String[] args) {

		ContaVip Rodrigo = new ContaVip(0002, 20000, "Rodrigo");

		Rodrigo.depositar(10000);
		Rodrigo.depositar(10000);
		Rodrigo.depositar(10000);
		Rodrigo.depositar(10000);
		Rodrigo.depositar(10000);
		Rodrigo.depositar(10000);
		Rodrigo.depositar(10000);

	}
	public void depositar(double valor) {

		double saldo = Saldo + valor;
		System.out.println("Saldo atual: " + saldo);

		Saldo = saldo;

		if (QtdeDepositosBasico == 3) {
			Saldo -= 0.20;
			QtdeDepositosBasico = 0;
		} else {
			QtdeDepositosBasico++;
		}

		System.out.println("O Saldo atual na conta é de: " + Saldo);

	}

}
