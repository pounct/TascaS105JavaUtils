package n3exercici1;

import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class N3Exercici1 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		SecretKey secretKey= KeyGenerator.getInstance("AES").generateKey();
		
		Servicio servicio = new Servicio();	
	    
		
		//String pathFitxer = "C:\\Users\\formacio\\fethi\\TascaS105JavaUtils\\src\\main\\java\\n3exercici1\\EncryptedResultado.txt";
		//servicio.encriptiFitxer(pathFitxer,secretKey);
		
		
		String pathEncriptiFitxer = "C:\\Users\\formacio\\fethi\\TascaS105JavaUtils\\src\\main\\java\\n3exercici1\\EncryptedResultado.txt";
		servicio.desencriptiFitxer(pathEncriptiFitxer,secretKey);
		
		
		
		
	}

}
