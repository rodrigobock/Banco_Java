package testes;

import core.ManipuladorArquivos;
import usuario.Usuario;

public class Testes {

	public static void main(String[] args) throws Exception {

		ManipuladorArquivos.criaArquivo("usuario.txt");
	Usuario rodrigo = new Usuario(0001, "rodrigo bock", 2000);
	ManipuladorArquivos.gravaUsuario("usuario.txt", rodrigo);
	
	Usuario LerRodrigo = ManipuladorArquivos.lerUsuario("usuario.txt");
	System.out.println(LerRodrigo);
		
		
	}
}