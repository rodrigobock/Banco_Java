package core.Interfaces;

import usuario.Usuario;

import java.util.ArrayList;

public interface IAgencia {
    public ArrayList<Usuario> GetAll();
    public int pegarQuantidade();
    public void criarConta(Usuario novo);
    public void excluirPorID(int Numero) throws Exception ;
    public Usuario pegarPorID(int Numero_procurado) throws Exception ;
    public void atualizar(Usuario p);
    public void verificarSaldo(int id) throws Exception ;
    public void sacar(int id, double valor) throws Exception ;
    public void depositar(int id, double valor) throws Exception ;

}
