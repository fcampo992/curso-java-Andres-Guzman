import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		
//		calendario.set(2024, 9 ,22  , 8, 30,22);
		// formato calendario
		calendario.set(Calendar.YEAR, 2024);
		calendario.set(Calendar.MONTH, Calendar.OCTOBER);
		calendario.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		calendario.set(Calendar.HOUR, 8);
		calendario.set(Calendar.MINUTE, 30);
		calendario.set(Calendar.SECOND,10);
		calendario.set(Calendar.MILLISECOND, 420);
		calendario.set(Calendar.AM_PM, Calendar.AM);
		
		Date fecha = calendario.getTime();
		System.out.println(fecha);
		
		SimpleDateFormat formato = new SimpleDateFormat("'Fecha: 'yyyy-MM-dd 'hora: ' hh:mm:ss:SSS a");
		String fechaConFormato = formato.format(fecha);
		System.out.println("Fecha con Formato = "+ fechaConFormato);
		
	}

}
