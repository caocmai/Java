package Numbers;

public class Example {
	public static void main(String[] args) {
		int i = 200;
		
		short s = (short)i; 
		System.out.println(s);
		
		double d = (double)i; 
		System.out.println(d);
		
		byte b = (byte)i;
		System.out.println(b);
		
//		float f = 3839.34839;
//        System.out.println(f);
//		
//		float f = 3839.34839F;
//        System.out.println(f);
		float x = 23.6;
		float foo = 0.1f;
        System.out.println(foo == 0.1d);
        System.out.println(foo == 0.1f);
	}

}
