package n1exercici4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;

public class Servicio {

	public static void treeLlistaDirectori(String filename) throws IOException {
		File file = new File(filename);
		Path filePath = Paths.get(filename);

		BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
		try {

			if (!file.isDirectory()) {
				escriureFitxer(filename + "(F)" + "  Ultima data de modificacio: " + attr.lastModifiedTime());

			} else {
				escriureFitxer(file + "(D)" + "  Ultima data de modificacio: " + attr.lastModifiedTime());
				String files[] = file.list();
				for (int i = 0; i < files.length; i++) {
					treeLlistaDirectori(filename + File.separator + files[i]);
				}

			}

		} catch (IOException e) {
			// TODO: handle exception
		}

	}

	public static void escriureFitxer(String resultado) {

		try {

			String destination = "C:\\Users\\HP_mini\\eclipse-workspace\\TascaS105JavaUtils\\src\\main\\java\\n1exercici4\\resultado.txt";
			BufferedWriter fitxer = new BufferedWriter(new FileWriter(destination, true));

			// fitxer.newLine();
			fitxer.write(resultado);
			fitxer.newLine();

			fitxer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void llegirFitxer(String filename) {

		String linea = null;

		try {
			FileReader resource = new FileReader(filename);
			try (BufferedReader buffer = new BufferedReader(resource)) {
				do {

					linea = buffer.readLine();
					//System.out.println(linea);
					if (linea != null) {
						System.out.println(linea);

					}

				} while (linea != null);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
