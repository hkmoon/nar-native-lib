package c;

public class hello {
	static
	{
		NarSystem.loadLibrary();
	}
	public native static byte test();

	public native String sayHello();

	public void run(String args) {
		test();
	}

	public static void main(final String[] args) {
		hello c = new hello();
		c.run(null);
	}
}
