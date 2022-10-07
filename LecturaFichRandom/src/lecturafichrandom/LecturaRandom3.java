package lecturafichrandom;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LecturaRandom3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {   
			   File fichero = new File ("C:\\Users\\usuario\\eclipse-workspace\\LecturaFichRandom\\src\\lecturafichrandom\\letras.txt");
			   
			   File fichero2 = new File ("C:\\Users\\usuario\\eclipse-workspace\\LecturaFichRandom\\src\\lecturafichrandom\\letrasEscritas.txt");
			   
			   RandomAccessFile file = new RandomAccessFile(fichero, "rw");
			   
			   RandomAccessFile file2 = new RandomAccessFile(fichero2, "rw");
			   

			   for (int i=(int) file.length()-1; i>=0; i-=1) {

				file.seek(i);
				
				file2.write(file.read());
			
			   }
			   
			   file.close(); 
			   
			   file2.close();
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	

}
