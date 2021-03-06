package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import usuario.Usuario;

public class ManipuladorArquivos {

	public static boolean verificaArquivo(String caminho) {
		File arquivo = new File(caminho);
		boolean existe = arquivo.exists();

		return existe;
	}

	public static boolean criaArquivo(String caminho) {
		File arquivo = new File(caminho);
		try {
			return arquivo.createNewFile();
		} catch (IOException e) {
			return false;
		}
	}

	public static boolean escreveArquivo(String caminho, String conteudo) {
		try {
			FileWriter arq = new FileWriter(caminho);
			arq.write(conteudo);
			arq.close();
		} catch (IOException e) {
			return false;
		}

		return true;

	}

	public static ArrayList<String> lerArquivo(String caminho) {
		ArrayList<String> texto = new ArrayList<String>();
		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader bufferLeitura = new BufferedReader(arq);
			String linha = bufferLeitura.readLine();
			while (linha != null) {
				texto.add(linha);
				linha = bufferLeitura.readLine();
			}
		} catch (IOException e) {
			return null;
		}
		return texto;
	}
	
	public static boolean gravaUsuario(String caminho, Usuario usuario) {
		return escreveArquivo(caminho, usuario.toString());
	}
	
	public static Usuario lerUsuario(String caminho) {
		Usuario usuario;
		ArrayList<String> texto = lerArquivo(caminho);
		String linha = texto.get(0);
		String[] dados = linha.split(";");
		
		usuario = new Usuario(Integer.parseInt(dados[0]), dados[1], Float.parseFloat(dados[2]));
		
		return usuario;
	}
	
}
