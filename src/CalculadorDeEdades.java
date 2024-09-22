import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;


public class CalculadorDeEdades {
	public static void main(String[] args) {
		
//		Formato de la fecha
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		Calendar fechaActual = Calendar.getInstance();

//		Solicita fecha de nacimiento al usuario
		Scanner s = new Scanner(System.in);
		System.out.print("Ingresa tu fecha de nacimiento ('yyyy/MM/dd'): ");
		String fechaNacUser = s.next();
		
		int edadUser = 0;
		
		try {
			Date fechaDate = sd.parse(fechaNacUser);
			Calendar fechaNac = Calendar.getInstance();
			fechaNac.setTime(fechaDate);
			
			edadUser = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
			
			if(fechaNac.get(Calendar.MONTH) <= fechaActual.get(Calendar.MONTH ) &&  (fechaNac.get(Calendar.DAY_OF_MONTH) < fechaActual.get(Calendar.DAY_OF_MONTH)))
				edadUser = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR)-1;
			
//			System.out.println("Fecha del mes: " + fechaNac.get(Calendar.DAY_OF_MONTH));
//			System.out.println("Fecha de hoy: " + fechaActual.getTime());
			System.out.println("Tu edad es: " + edadUser);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


		
		
		
	}

}
