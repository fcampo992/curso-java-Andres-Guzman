import java.util.Map;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class EjemploVariablesDeEnterno {
	
	public static void main(String[] args) {
		
		Map<String, String> varEnv = System.getenv();
		System.out.println("Variables de Entorno = " + varEnv);
		
		String username = System.getenv("USERNAME");
		System.out.println("USERNAME = " + username);
		
		String JAVAHOME =  System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME = " + JAVAHOME);
		
		
		
	}

}
