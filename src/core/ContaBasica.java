package core;

import core.Interfaces.IConta;

public class ContaBasica extends Conta implements IConta {

	public ContaBasica(int NumConta, double SaldoConta, String NomeUsuario) {
		super(NumConta, SaldoConta, NomeUsuario);
	}

	public static void main(String[] args) {
		ContaBasica Rodrigo = new ContaBasica(0001, 100, "Rodrigo");
		Rodrigo.depositar(100);
		Rodrigo.depositar(100);
		Rodrigo.depositar(100);
		Rodrigo.depositar(100);
	}

	public void depositar(double valor) {

		double saldo = Saldo + valor;
		System.out.println("Saldo atual: " + saldo);

		Saldo = saldo;

		if (QtdeDepositosVIP == 6) {
			Saldo -= 0.20;
			QtdeDepositosVIP = 0;
		} else {
			QtdeDepositosVIP++;
		}

		System.out.println("O Saldo atual na conta é de: " + Saldo);

	}

}
