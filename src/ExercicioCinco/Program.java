package ExercicioCinco;

import java.io.File;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       File arquivo = new File("C:\\Users\\lucas");
       System.out.printf("getName %s", arquivo.getName());
       System.out.printf("\ngetParent %s", arquivo.getParent());
       System.out.printf("\ngetPath %s", arquivo.getPath());

	}
}
