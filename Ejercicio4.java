package Capitulo11;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		if(args.length==1) {
		try {
			BufferedReader br;
			BufferedWriter bw;
			String s;
			br=new BufferedReader(new FileReader(args[0]));
			bw=new BufferedWriter(new FileWriter("Ejerc4palabras_sort.txt"));
			s="";
			ArrayList<String> sorteado=new ArrayList<String>();
			//añadir líneas a ArrayList
			while(s!=null) {
				s=br.readLine();
				if(s!=null) {
				sorteado.add(s);
				}
			}
			//Sorteando ArrayList
			Collections.sort(sorteado);
			for(String str : sorteado) {
				bw.write(str+"\n"); //Escribiendo en fichero
			}
			br.close();
			bw.close();
		}catch(IOException ioe) {
			System.out.println("Error leyendo/escribiendo archivo");
		}
		}else {
			System.out.println("El programa requiere un fichero de texto por comando");
		}
		
	}
	
}
