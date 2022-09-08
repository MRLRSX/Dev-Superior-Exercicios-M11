package ExercicioTres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path01 = "C:\\Curso Java\\Codigo Projeto\\Arquivos\\src\\ExercicioTres\\Textos\\leitura";
		String path02 = "C:\\Curso Java\\Codigo Projeto\\Arquivos\\src\\ExercicioTres\\Textos\\leitura02";
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path02, true));
				BufferedReader bufferedReader01 = new BufferedReader(new FileReader(path01));
				BufferedReader bufferedReader02 = new BufferedReader(new FileReader(path02));) {

			String[] lines = { " LUCAS ROCHA ", "ANNA CLARA BERNARDINO ROCHA"};
			for (String linhas : lines) {
				bufferedWriter.write(linhas);
				bufferedWriter.newLine();
			}
			while (bufferedReader01.ready()) {
				System.out.println(bufferedReader01.readLine());
			}
			while (bufferedReader02.ready()) {
				System.out.println(bufferedReader02.readLine());
			}

		} catch (IOException errorLeitura) {
			System.out.println(errorLeitura.getMessage());
		}
	}
}
