package n2exercici1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class N2Exercici1 {
	
	
	public static void main(String[] args) 	throws IOException {
	        Servicio servicio = new Servicio();
	        
	        Properties properties = new Properties();
			try {
				
				properties.load(new FileInputStream(".\\src\\main\\resources\\config.properties"));
			} catch (IOException e) {

			}
			
			HashMap<String,String> props = new HashMap<>();
			for (String key : properties.stringPropertyNames()) {
				String value = properties.getProperty(key);
				System.out.println(key + " => " + value);
				props.put(key, value);
				
			}
			System.out.println("props");
			System.out.println(props);
			System.out.println();
			
	        
	        
	        
	        
	        //servicio.getProprietiesParam();
			String directori=props.get("directoriALlegir");
	        
	        String pathDestination = props.get("pathResult")+props.get("fileNameResult");
		
	        servicio.treeLlistaDirectori(pathDestination,directori);
	}

}
