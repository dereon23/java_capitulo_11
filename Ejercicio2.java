package Capitulo11;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Ejercicio2 {
	public static void main(String[] args) {
		String s= "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
		}catch(IOException ioe){
			System.out.println("El archivo no pudo ser leído");
		}
	}
}
