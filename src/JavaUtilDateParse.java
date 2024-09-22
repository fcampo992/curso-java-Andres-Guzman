import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una fecha con el formato 'yyyy-MM-dd'");
		try {
			Date fecha = format.parse(scan.next());
			System.out.println("Fecha = " + fecha);
			System.out.println(format.format(fecha));
			
			Date fecha2 = new Date();
			System.out.println("Fecha actual = "+ fecha2);
			
			if (fecha.after(fecha2)) {
				System.out.println("La fecha ingresada es posterior que la fecha actual");
			}
			else if(fecha.before(fecha2)){
				System.out.println("La fecha Ingresada es anterior que la fecha actual");
			}
			if (fecha.equals(fecha2)) {
				System.out.println("La fecha ingresada es igual a la fecha actual");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
