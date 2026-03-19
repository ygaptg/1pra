import org.junit.Assert;
import org.junit.Test;
import static shlyapa.Main.ageMeter;

public class MainTest {

    @Test
    public void ageMeterTest() {
        String[] results = {ageMeter(17), ageMeter(18), ageMeter(19), ageMeter(0), ageMeter(1), ageMeter(34), ageMeter(35), ageMeter(36), ageMeter(40)};
        String[] responses = {"You are children", "You are young", "You are young", "You are children", "You are children", "You are young", "You are young", "You are old", "You are old"};

        for (int i = 0; i < results.length; i++) {
            Assert.assertEquals(responses[i], results[i]);
        }
    }
}
