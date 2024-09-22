import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream archivo = new FileInputStream("src/config.properties");
			Properties p = new Properties(System.getProperties());
			p.load(archivo);
			p.setProperty("mi.propiedad.custom", "mi valor custom");
			System.setProperties(p);
			
			Properties ps = System.getProperties();
			ps.list(System.out);
			
			System.out.println("ps = " + ps.getProperty("config.autor.email"));
			System.out.println("ps = " + ps.getProperty("config.auto.nombre"));
			System.out.println(System.getProperty("config.texto.ambiente"));
			
			
			}catch(Exception e) {
				System.out.println("No existe el archivo = " + e);
				
			}
	}
	
	
}
