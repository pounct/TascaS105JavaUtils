package n3exercici1;

import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class N3Exercici1 {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, IOException {

		Servicio servicio = new Servicio();

		String algoritmo = "AES/CBC/PKCS5Padding";
		SecretKey secretKey = servicio.generateKey(128);
		IvParameterSpec ivParameterSpec = servicio.generateIv();

		String pathResource = ".\\src\\main\\java\\n3exercici1\\";
		String fileName = "Resultado.txt";
		File inputFile = new File(pathResource + fileName);

		File decryptedFile = new File(pathResource + "document.decrypted");
		File encryptedFile = new File(pathResource + "document.encrypted");

		servicio.encryptFile(algoritmo, secretKey, ivParameterSpec, inputFile, encryptedFile);
		System.out.println("file encrypted...");
		
		servicio.decryptFile(algoritmo, secretKey, ivParameterSpec, encryptedFile, decryptedFile);
		System.out.println("file decrypted...");

	}

}
