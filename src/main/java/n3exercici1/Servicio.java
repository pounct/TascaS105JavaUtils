package n3exercici1;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;

public class Servicio {
	
	public void encriptiFitxer(String filename, SecretKey secretKey) {
		try {
			
			//SecretKey secretKey= KeyGenerator.getInstance("AES").generateKey();
			
			Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
            aes.init(Cipher.ENCRYPT_MODE, secretKey);
            
            //String fileName = "Encrypted.txt"; // result
            
            FileOutputStream fs = new FileOutputStream(filename);
            CipherOutputStream out = new CipherOutputStream(fs, aes);
            out.write("[Hello:Okay]\nOkay".getBytes());
            out.flush();
            out.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void desencriptiFitxer(String filename, SecretKey secretKey) {
		try {
			
			//SecretKey secretKey= KeyGenerator.getInstance("AES").generateKey();
			
			Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
            aes.init(Cipher.DECRYPT_MODE, secretKey);
            
            FileInputStream fis = new FileInputStream(filename);
            CipherInputStream in = new CipherInputStream(fis, aes);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
		} catch (Exception  e) {
			
		}
	}
/*
	public byte[] encryptMessage(byte[] message, byte[] keyBytes) throws InvalidKeyException, NoSuchPaddingException,
			NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException {

		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		return cipher.doFinal(message);
	}

	public byte[] decryptMessage(byte[] encryptedMessage, byte[] keyBytes) throws NoSuchPaddingException,
			NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		return cipher.doFinal(encryptedMessage);
	}
*/
}
