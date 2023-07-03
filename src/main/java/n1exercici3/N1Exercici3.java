package n1exercici3;

import java.io.IOException;

import n1exercici3.Servicio;

public class N1Exercici3 {

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

	}

}
