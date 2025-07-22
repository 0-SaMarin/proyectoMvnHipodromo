import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class MainTest {
    @Test
    @Timeout(value = 22)
    @Disabled
    public void timeoutTest(){
        try {
            Main.main(new String []{});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
