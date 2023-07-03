package n1exercici1;

public class N1Exercici1 {

	public static void main(String[] args) {
		Servicio servicio = new Servicio();
		String dir = "";
		if (args.length == 0) {
			
			dir = ".\\src\\main\\java\\n1exercici1\\directori";
		} else {

			dir = args[0];

		}		
		servicio.llistaDirectori(dir);

		
	}

	
}
