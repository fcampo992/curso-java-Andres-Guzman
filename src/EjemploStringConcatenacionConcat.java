
public class EjemploStringConcatenacionConcat {
	
	public static void main(String[] args) {
		
		String a = "a";
		String b = "b";
		String c = a;
		
		StringBuilder sb = new StringBuilder();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			
//			c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 168ms, 100000 => 3744 ms
//			c += a + b + "\n"; //500 => 34ms, 1000 => 60 ms, 10000 => 101 ms, 100000 => 1488 ms
			sb.append(a).append(b).append("\n");//500 => 0ms, 1000 => 1ms, 10000 => 2ms, 100000 => 8ms
			
		}
		long fin = System.currentTimeMillis();
				
//		System.out.println("c = " + c);
		System.out.println("sb = "+ sb.toString());
		System.out.println(fin-inicio);
		
	}

}
