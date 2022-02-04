import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
    @Test
    public void testIsLeapYear(){
        assertFalse(SkillDemo.isLeapYear(1900));
    }
}