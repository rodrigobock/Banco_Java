package core;

import core.Interfaces.IConta;

public class Conta{
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
}
