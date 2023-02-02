package Capitulo11;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;


public class Ejercicio1 {
	public static void main(String[] args) {
		String linea="";
		try {
			File archivo= new File("primos.dat");
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
			for(int i=0;i<500;i++) {
				if(esPrimo(i)) {
					bw.write(Integer.toString(i)+"\n");
				}
			}
			bw.close();
		}catch(IOException ioe) {
			System.out.println("Error en la escritura del archivo");
		}
	}
	private static boolean esPrimo(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
