package core;

import java.util.ArrayList;

import usuario.Usuario;

public class Agencia {

	static ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();

	public ArrayList<Usuario> GetAll() {
		return Usuarios;
	}

	public int pegarQuantidade() {
		return Usuarios.size();
	}

	public void criarConta(Usuario novo) {
		int maiorNumero = 0;
		for (Usuario u : Usuarios) {
			if (u.getNumero() > maiorNumero) {
				maiorNumero = u.getNumero();
			}
		}
		novo.setNumero(maiorNumero + 1);
		Usuarios.add(novo);
	}

	public void excluirPorID(int Numero) throws Exception {
		Usuario p = pegarPorID(Numero);
		Usuarios.remove(p);
	}

	public Usuario pegarPorID(int Numero_procurado) throws Exception {
		for (Usuario pe : Usuarios) {
			if (pe.getNumero() == Numero_procurado) {
				return pe;
			}
		}
		throw new Exception("Não encontrado");
	}

	public void atualizar(Usuario p) {
		int ondeMudar = -1;
		for (int i = 0; i < pegarQuantidade(); i++) {
			if (Usuarios.get(i).getNumero() == p.getNumero()) {
				ondeMudar = i;
				break;
			}
		}
		if (ondeMudar >= 0) {
			Usuarios.set(ondeMudar, p);
		}
	}

	public void verificarSaldo(int id) throws Exception {
		Usuario p = pegarPorID(id);
		System.out.println(p.getSaldo());
	}

	public void sacar(int id, double valor) throws Exception {
		Usuario p = pegarPorID(id);
		if (valor > p.getSaldo()) {
			System.out.println("Saldo atual: " + p.getSaldo());
		} else {
			double saldo = p.getSaldo() - valor;
			p.setSaldo(saldo);
			System.out.println("Saldo atual: " + p.getSaldo());
		}
	}

	public void depositar(int id, double valor) throws Exception {
		Usuario p = pegarPorID(id);
		double saldo = p.getSaldo() + valor;
		p.setSaldo(saldo);
		System.out.println("Saldo atual: " + p.getSaldo());
	}


}