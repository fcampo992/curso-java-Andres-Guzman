
public class EjemploStringMetodosArreglos {
	public static void main(String[] args) {
		String nombre = "Facundo";
		
		System.out.println("nombre.lenght() = "+ nombre.length());
		System.out.println("nombre.toUpperCase() = "+ nombre.toUpperCase());
		System.out.println("nombre.toLowerCase() = "+ nombre.toLowerCase());
		System.out.println("nombre.equals(\"Facundo\") = "+ nombre.equals("Facundo"));
		System.out.println("nombre.equals(\"facundo\") = "+ nombre.equals("facundo"));
		System.out.println("nombre.equalsIgnoreCase(\"facundo\") = "+ nombre.equalsIgnoreCase("facundo"));
		System.out.println("nombre.compareTo() = " + nombre.compareTo("Facundo"));
		System.out.println("nombre.charAt() = " + nombre.charAt(0));
		System.out.println("nombre.charAt() = " + nombre.charAt(nombre.length()-1));
		System.out.println("nombre.sub = " + nombre.substring(1));
		System.out.println("nombre.sub = " + nombre.substring(2,4));
		
		String trabalengua = "trabalenguas";
		System.out.println("trabalengua = "+ trabalengua.replace("a", "e"));
		System.out.println("trabalengua = " + trabalengua);
		System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
		
		
	}

}
