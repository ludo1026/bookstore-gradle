import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by luchabou on 16/06/2014.
 */
public class CalculTest {
    @Test
    public void testSum() {
        Assert.assertEquals(4, new Calcul().sum(1,2,1));
    }
}
