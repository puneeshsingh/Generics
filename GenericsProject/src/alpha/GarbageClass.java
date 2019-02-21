package alpha;

public class GarbageClass {
	
	private int i;

	
	public GarbageClass() {
		super();
	}


	public GarbageClass(int i) {
		super();
		this.i = i;
	}


	public int getI() {
		return i;
	}


	@Override
	protected void finalize() throws Throwable {
		System.out.println("Calling garbage collector method");
		super.finalize();
	};
	
	
	
	
	

}
