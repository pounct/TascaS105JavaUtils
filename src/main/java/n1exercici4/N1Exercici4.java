package n1exercici4;

import java.io.IOException;
import java.util.Scanner;

import n1exercici4.Servicio;

public class N1Exercici4 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Servicio servicio = new Servicio();
		String dir = "";
		if (args.length == 0) {

			System.out.println("argument does not exist.");
			System.exit(0);
		} else {

			dir = args[0];

		}

		servicio.treeLlistaDirectori(dir);
		System.out.println("filename : ");
		String fileToRead = sc.nextLine();
		
		
		servicio.llegirFitxer(fileToRead);

	}

}
