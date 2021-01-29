package core;

public class ContaBasica extends Conta {

	public ContaBasica(int NumConta, double SaldoConta, String NomeUsuario) {
		super(NumConta, SaldoConta, NomeUsuario);
	}

	public static void main(String[] args) {
		ContaBasica Rodrigo = new ContaBasica(0001, 100, "Rodrigo");
		Rodrigo.depositarBasico(100);
		Rodrigo.depositarBasico(100);
		Rodrigo.depositarBasico(100);
		Rodrigo.depositarBasico(100);
	}

}
