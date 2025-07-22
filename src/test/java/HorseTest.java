import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HorseTest {
    @Nested
    public class horseTest{
        @Test
        public void nameNotFound(){
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Horse(null, 0.0));
            assertEquals("Name cannot be null.", exception.getMessage());
        }


    }
}
