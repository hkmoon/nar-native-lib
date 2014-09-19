package c;
import org.scijava.nativelib.NativeLibraryUtil;

public class hello {
	static
	{
		NativeLibraryUtil.loadVersionedNativeLibrary(hello.class, "hello-native-1.0-SNAPSHOT");
	}
	public native void test();

	public native String sayHello();

	public void run(String args) {
		test();
	}

	public static void main(final String[] args) {
		hello c = new hello();
		c.run(null);
	}
}
