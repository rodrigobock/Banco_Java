package core;

public class ContaVip extends Conta {

	public ContaVip(int NumConta, double SaldoConta, String NomeUsuario) {
		super(NumConta, SaldoConta, NomeUsuario);
	}

	public static void main(String[] args) {

		ContaVip Rodrigo = new ContaVip(0002, 20000, "Rodrigo");

		Rodrigo.depositarVip(10000);
		Rodrigo.depositarVip(10000);
		Rodrigo.depositarVip(10000);
		Rodrigo.depositarVip(10000);
		Rodrigo.depositarVip(10000);
		Rodrigo.depositarVip(10000);
		Rodrigo.depositarVip(10000);

	}

}
