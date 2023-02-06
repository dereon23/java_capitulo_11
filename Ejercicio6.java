package Capitulo11;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.File;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		if(args.length==2) {
			try {
			String linea="";
			BufferedReader br=new BufferedReader(new FileReader(args[0]));
			int inst=0;
			while(linea!=null) {
				if(linea.contains(args[1])) {
					for(int i=0; i<linea.length();i++) {
						
						if(i+args[1].length()<=linea.length()) {
							if(linea.subSequence(i, i+args[1].length()).equals(args[1])) {
								inst++;
								i+=args[1].length();
							}
							if(i+args[1].length()>linea.length()) {
								break;
							}
						}
					}
				}
				linea=br.readLine();
			}
			System.out.println(inst);
			}catch(IOException ioe) {
				System.out.println("Error al leer archivo");
			}
		}else {
			System.out.println("Se requieren una archivo y un String para ejecutar el programa");
		}
		
	}
}
