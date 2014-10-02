import fiji.Debug;
import org.junit.Ignore;

/**
 * Created by moon on 10/2/14.
 */
@Ignore public class TestDrive {
	public static void main(String... args) {
		final String clownPath =
				System.getProperty("user.home") + "/Desktop/Fiji.app/samples/clown.jpg";
		Debug.runFilter(clownPath, "HelloNative", "");
	}
}
