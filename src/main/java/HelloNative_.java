/**
 * Created by moon on 10/2/14.
 */
import c.hello;
import ij.IJ;
import ij.plugin.PlugIn;

public class HelloNative_ implements PlugIn {
	public void run(String arg) {
		hello c = new hello();
		IJ.log(c.sayHello());
	}
}
