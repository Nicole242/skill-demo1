import static org.junit.Assert.*;
import org.junit.*;
//import java.beans.Transient;

public class SkillDemoTester {
    @Test
    public void multiplication(){
        assertEquals(8, SkillDemo.multiply(2, 4));
    }
    
}
