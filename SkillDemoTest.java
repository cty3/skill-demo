import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
    @Test
    public void testIsLeapYear(){
        assertTrue(SkillDemo.isLeapYear(1900));
    }
}