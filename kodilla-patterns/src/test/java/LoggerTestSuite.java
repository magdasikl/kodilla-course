import com.kodiila.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {
//        Given
//        Logger logger = new Logger();
//        When
        Logger.getInstance().log("Moja pierwsza linijka");

//        Then
        Assert.assertEquals("Moja pierwsza linijka",Logger.getInstance().getLastLog());
    }
}
