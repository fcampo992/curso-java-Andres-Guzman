import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
	public static void main(String[] args) {
		
		String texto = "Hola como estas?";
		
		Class strClass = texto.getClass();
		
		System.out.println("strClass = " + strClass.getName());
		System.out.println("strClass = " + strClass.getSimpleName());
		System.out.println("strClass = " + strClass.getPackageName());
		System.out.println("strClass = " + strClass.getPackage());
		
		for (Method m : strClass.getMethods()) {
			System.out.println("metodo.getName() = " + m.getName());
		}
		
		
	}

}
