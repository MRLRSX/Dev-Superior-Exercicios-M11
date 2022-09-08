package ExercicioUm;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       File file = new File("C:\\Curso Java\\Codigo Projeto\\Arquivos\\src\\ExercicioUm\\Textos\\ArquivoLeitura");
       Scanner entrada = null;
       try {
    	   entrada = new Scanner(file); 
    	   while(entrada.hasNextLine()) {
    		   System.out.println(entrada.nextLine());
    	   }
       }catch(IOException errorLeitura) {
    	   System.out.println("" + errorLeitura.getMessage());
       }finally {
    	   if(entrada != null)
    	      entrada.close();
       }
	}
}
