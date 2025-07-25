import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class HippodromeTest {
    Hippodrome hippodrome;

    private void createHippodrome(){
        List<Horse> horses = List.of(
                new Horse("Houdini", 2.4),
                new Horse("Comanche", 2.5),
                new Horse("Ranger", 2.6),
                new Horse("Elvis", 2.7),
                new Horse("Yoda", 2.8),
                new Horse("Pegasus", 2.9),
                new Horse("Shelby", 3)
        );

        hippodrome = new Hippodrome(horses);
    }

    @Test
    public void hippodromeIsNull(){
         try{
             hippodrome = new Hippodrome(null);
         }catch (IllegalArgumentException exception){
             assertEquals("Horses cannot be null.", exception.getMessage());
         }
     }

    @Test
    public void hipodromeIsBlank(){
        try{
            hippodrome = new Hippodrome(new ArrayList<>());
        }catch (IllegalArgumentException exception){
            assertEquals("Horses cannot be empty.", exception.getMessage());
        }
    }

    @Test
    public void getHorsesTest(){
        createHippodrome();
        assertNotEquals(0, hippodrome.getHorses().size());
    }
}
