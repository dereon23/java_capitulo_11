package Capitulo11;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class Ejercicio3 {
	public static void main(String[] args) {
		if(args.length==2) {
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
			BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ejerc3out.txt"));
			String s1="";
			String s2="";
			while(s1!=null||s2!=null) {
				if(s1!=null) {
					s1=br1.readLine();
					if(s1!=null) {
						bw.write(s1+"\n");
					}
				}
				if(s2!=null) {
					s2=br2.readLine();
					if(s2!=null) {
						bw.write(s2+"\n");
					}
				}
			}
			br1.close();
			br2.close();
			bw.close();
		}catch(IOException ioe){
;			System.out.println("Error al leer/escribir archivos");
		}
		}else {
			System.out.println("El programa requiere dos ficheros pasados por comando");
		}
		
	}

}
