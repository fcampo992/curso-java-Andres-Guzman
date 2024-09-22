import java.util.Properties;

public class EjemploPropiedadesDeSistema {
	
	public static void main(String[] args) {
		
		String username = System.getProperty("user.name");
		System.out.println("Username = " + username);
		
		String home = System.getProperty("user.home");
		System.out.println("user.home = " + home);
		
		String workspace = System.getProperty("user.dir");
		System.out.println("user.dir = " + workspace);
		
		String java = System.getProperty("java.version");
		System.out.println("java.version = " + java);
		
		String lineSeparator = System.getProperty("line.separator");
		System.out.println("lineSeparator = " + lineSeparator);
		
		String javalibrarypath = System.getProperty("java.library.path");
		System.out.println("java.library.path = " + javalibrarypath);

		
		Properties p = System.getProperties();
		p.list(System.out);
		
		
	}

}
