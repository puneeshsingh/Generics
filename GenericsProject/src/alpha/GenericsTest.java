package alpha;

public class GenericsTest<T> {
	T t;

	
	public GenericsTest() {
		super();
	}

	public GenericsTest(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public <T> T genericMethod(T t) {
		System.out.println("Greetings from generics");
		return t;
	}
	
	
	}

