package n1exercici2;

import java.io.File;
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
				System.out.println(filename+"(F)"+"  Ultima data de modificacio: " + attr.lastModifiedTime());
				
			}
			else {
				System.out.println( file+"(D)"+"  Ultima data de modificacio: " + attr.lastModifiedTime());
				String files[] = file.list();
				for (int i = 0; i < files.length; i++) {
					treeLlistaDirectori(filename + File.separator + files[i]);
				}
				
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}

		
		
	}
}