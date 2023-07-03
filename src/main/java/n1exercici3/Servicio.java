package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Servicio {
	
	public static void treeLlistaDirectori(String filename) throws IOException {
		File file = new File(filename);
		Path filePath = Paths.get(filename);

		BasicFileAttributes attr =
                Files.readAttributes(filePath, BasicFileAttributes.class);
		try {
			
			if (!file.isDirectory()) {
				escriureFitxer(filename+"(F)"+"  Ultima data de modificacio: " + attr.lastModifiedTime());
				
			}
			else {
				escriureFitxer( file+"(D)"+"  Ultima data de modificacio: " + attr.lastModifiedTime());
				String files[] = file.list();
				for (int i = 0; i < files.length; i++) {
					treeLlistaDirectori(filename + File.separator + files[i]);
				}
				
			}
			
		} catch (IOException e) {

		}		
	}
	
	public static void escriureFitxer(String resultado) {
		
		

		try {

			String destination = "C:\\Users\\formacio\\fethi\\TascaS105JavaUtils\\src\\main\\java\\n1exercici3\\resultado.txt";
			BufferedWriter fitxer = new BufferedWriter(new FileWriter(destination,true));

			fitxer.write(resultado);
			fitxer.newLine();

			fitxer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
