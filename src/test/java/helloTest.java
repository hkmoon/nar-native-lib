/**
 * Created by moon on 9/24/14.
 */
import c.hello;
import org.junit.Assert;
import org.junit.Test;
public class helloTest {
	@Test public final void testNativeMethod()
	{
		Assert.assertEquals(108, hello.test());
	}
}
