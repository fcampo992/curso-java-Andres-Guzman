
public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saludar = "Hola Mundo desde Java";
		System.out.println("Saludar: " + saludar);
		System.out.println("Saludar.toUpperCase() " + saludar.toUpperCase());
		
		
		int numero = 10;
		System.out.println("numero = " + numero);
		boolean  valor = true;
		if (valor) {
			System.out.println("numero = " + numero);
			int numero2 = 10;
			System.out.println("Numero2 = " + numero2);
		}
		
		var numero3 = "3";
		System.out.println(numero3);
	}

}
