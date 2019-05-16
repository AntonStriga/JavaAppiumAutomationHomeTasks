import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("Returned value is less or equal 45", this.getClassNumber() > 45);
    }
}
