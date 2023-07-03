package n1exercici5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Servicio {

	public static void serialize(Object object, String filename) {
		File file = new File(filename);
		try {

			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			try {
				oos.writeObject(object);
				oos.flush();
			} finally {
				try {
					oos.close();
				} finally {
					fos.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object deserialize(String filePath) throws IOException, ClassNotFoundException {

		 ObjectInputStream in = null;
	        try {
	            in = new ObjectInputStream(new FileInputStream(filePath));
	            Object o = in.readObject();
	            in.close();
	            return o;
	        } catch (FileNotFoundException e) {
	            throw new RuntimeException("FileNotFoundException occurred. ", e);
	        } catch (ClassNotFoundException e) {
	            throw new RuntimeException("ClassNotFoundException occurred. ", e);
	        } catch (IOException e) {
	            throw new RuntimeException("IOException occurred. ", e);
	        } finally {
	            if (in != null) {
	                try {
	                    in.close();
	                } catch (IOException e) {
	                    throw new RuntimeException("IOException occurred. ", e);
	                }
	            }
	        }
	}

}
