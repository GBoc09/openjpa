import org.apache.openjpa.persistence.ArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class ArgumentExeceptionTest {
    @Test
    public void testIsFatal() {
        ArgumentException argumentException = new ArgumentException("THIS IS A DUMMY TEST", null, null, true);
        Assert.assertTrue(argumentException.isFatal());
    }
    @Test
    public void testIsFatal2() {
        ArgumentException argumentException = new ArgumentException("THIS IS A DUMMY TEST", null, null, false);
        Assert.assertFalse(argumentException.isFatal());
    }
}
