import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        Assert.assertTrue("Returned string is not a greeting!", (this.getClassString().contains("hello") || getClassString().contains("Hello") ));
    }
}
