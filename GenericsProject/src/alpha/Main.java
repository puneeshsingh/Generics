package alpha;

public class Main {

	public static void main(String[] args) {
		GenericsTest<String> generic1 = new GenericsTest<String>("Hello Generics");

		generic1.setT("Hello from Earth!");
		System.out.println(generic1.getT());

		GenericsTest<Integer> generic2 = new GenericsTest<Integer>(123);
		System.out.println(generic2.getT());
		System.out.println(generic2.genericMethod("111"));
		
		
		System.out.println(genericMethodWithObject(new Integer(123)));
		System.out.println(genericMethodWithObject(new Double(123123123)));
		System.out.println(genericMethodWithObject(new Float(123.123)));
		System.out.println(genericMethodWithObject("Oregon"));
		System.out.println(genericMethodWithObject(123.123));
		System.out.println(genericMethodWithObject(new Object()));
		
		GenericsTest generic3 = new GenericsTest();
	
		
		//Integer i = Integer.valueOf(
		
		
		
		
		GarbageClass gc = new GarbageClass(10);
		try {
			gc.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Object genericMethodWithObject(Object obj) {
		//String str = obj.toString();
		//return (String)obj;
		return obj;

	}
}
