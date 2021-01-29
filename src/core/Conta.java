package core;

public class Conta {
	public int NumeroConta;
	protected double Saldo;
	public String Usuario;
	public int QtdeDepositosVIP;
	public int QtdeDepositosBasico;

	public Conta(int NumConta, double SaldoConta, String NomeUsuario) {
		this.NumeroConta = NumConta;
		this.Saldo = SaldoConta;
		this.Usuario = NomeUsuario;
	}

	public void depositarVip(double valor) {

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

	public void depositarBasico(double valor) {

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
