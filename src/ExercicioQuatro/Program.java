package ExercicioQuatro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;


public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       String path = "C:\\Program Files";
       
       File diretorio = new File(path);
       
       File[] holders = diretorio.listFiles(File::isDirectory);
       System.out.println("FOLDERS");
       try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Curso Java\\Codigo Projeto\\Arquivos\\src\\ExercicioTres\\Textos\\arquivo03.txt"))){
    	   
    	   for(File file : holders) {
    		   System.out.println(file);
    		   bufferedWriter.write(""+file);
    		   bufferedWriter.newLine();
    	   }
       }catch(IOException errorLeitura) {
    	   System.out.println(""+ errorLeitura.getMessage());
       }
       
   
	}
}
