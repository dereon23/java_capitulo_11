package Capitulo11;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Ejercicio5 {

	public static void main(String[] args) {
		if(args.length==2) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
			String s="";
			while(s!=null) {
				s=br.readLine();
				if(s!=null) {
					for(int i=0;i<s.length();i++) {
						if(i<s.length()-1&&s.charAt(i)=='/'&&s.charAt(i+1)=='/') {
							s=s.substring(0, i);
							break;
						}
					}
					bw.write(s+"\n");
				}
			}
			br.close();
			bw.close();
		}catch(IOException ioe) {
			System.out.println("Error al leer/escribir ficheros");
		}
		}else {
			System.out.println("El programa requiere dos ficheros como argumentos");
		}
	}
	
}
