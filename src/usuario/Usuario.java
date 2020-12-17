package usuario;

public class Usuario {

	private int numero;
	String nome;
	private double saldo;

	public Usuario() {
	};

	public Usuario(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getNome() {
		return this.nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return this.numero + ";" + this.nome + ";" + this.saldo;
	}
}
