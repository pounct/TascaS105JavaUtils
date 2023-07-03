package n1exercici2;

import java.io.IOException;

public class N1Exercici2 {

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
