package n1exercici5;

import java.io.IOException;
import java.util.Scanner;

import n1exercici5.Servicio;

public class N1Execici5 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Servicio servicio = new Servicio();
		
		System.out.println("filename to use : ");
		String fileToReadOrWrite = sc.nextLine();
		
		Object obj = "Objeto String";
		
		servicio.serialize(obj,fileToReadOrWrite);
		System.out.println("objecte serialised");
		
		Object obj2 = servicio.deserialize(fileToReadOrWrite);
		System.out.println("objecte deserialised : " +obj2);
		System.out.println("from file : "+fileToReadOrWrite);
		
		

	}

}
