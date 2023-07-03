package n1exercici1;

import java.io.File;

public class Servicio {

	public void llistaDirectori(String dir) {

		File file = null;
		String[] paths;

		try {
			file = new File(dir);
			paths = file.list();
			for (String path : paths) {
				System.out.println(path);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
