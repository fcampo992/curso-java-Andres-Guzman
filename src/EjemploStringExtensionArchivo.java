
public class EjemploStringExtensionArchivo {
	
	public static void main(String[] args) {
		
		String archivo = "alguna.imagen.json";
		int i = archivo.lastIndexOf(".");
		System.out.println("archivo.length() = " + archivo.length());
		System.out.println("archivo.subString(archivo.lenght()-4) = " + archivo.substring(i+1));
		
		
		
	}

}
