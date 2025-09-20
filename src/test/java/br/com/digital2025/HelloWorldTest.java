import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        Assert.assertEquals("Hello, World!", "Hello, World!");
    }
}