package ExercicioDois;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\Curso Java\\Codigo Projeto\\Arquivos\\src\\ExercicioDois\\Textos\\leitura";

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
			String linha = bufferedReader.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = bufferedReader.readLine();
			}
		} catch (IOException errorLeitura) {
			System.out.println(errorLeitura.getMessage());
		}
	}
}
