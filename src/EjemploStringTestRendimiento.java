
public class EjemploStringTestRendimiento {
	
	public static void main(String[] args) {
		
		String curso = "Programacion Java";
		String profesor = new String ("Facundo Campo");
		
		curso.concat(profesor);
		System.out.println(curso);
		
		String resultado = curso.concat(profesor);
		System.out.println(resultado);
		System.out.println(curso == resultado);

//		No funciona porque este metodo es de Java 12
//		String resultado2 = curso.transform( c -> {
//			return c + " con " + profesor;
//		});
		
		
		
		System.out.println(curso);
		
	}

}
