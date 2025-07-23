import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HorseTest {
    private Horse horse;

    @Test
    public void horseNameIsNull(){
        try{
            horse = new Horse(null, 9, 8);
        }catch (IllegalArgumentException e){
            assertEquals("Name cannot be null.", e.getMessage());
        }

    }

    @Test
    public void horseNameIsBlank(){
        try{
            horse = new Horse("", 9, 8);
        }catch (IllegalArgumentException e){
            assertEquals("Name cannot be blank.", e.getMessage());
        }

    }

    @Test
    public void horseSpeedIsNegative(){
        try{
            horse = new Horse("x", -9, 8);
        }catch (IllegalArgumentException e){
            assertEquals("Speed cannot be negative.", e.getMessage());
        }

    }

    @Test
    public void horseDistanceIsNegative(){
        try{
            horse = new Horse("x", 10, -2);
        }catch (IllegalArgumentException e){
            assertEquals("Distance cannot be negative.", e.getMessage());
        }

    }

    @Test
    public void getterTest(){
        String name = "name";
        double speed = 9;
        double distance = 8;
        horse = new Horse(name, speed, distance);

        assertAll("validate getter variables match, variables from the constructor. ",
                () -> assertEquals(name, horse.getName()),
                () -> assertEquals(speed, horse.getSpeed()),
                () -> assertEquals(distance, horse.getDistance())
        );

    }
}
