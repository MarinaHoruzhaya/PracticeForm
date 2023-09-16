package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class SystemPropertiesTests {

    @Test
    void systemPropertiesTest() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Tag(value = "property")
    @Test
    void systemProperties1Test() {
        System.setProperty("browser","chrome");
        String browser = System.getProperty("browser");

        System.out.println(browser);
    }

    @Test
    void systemProperties2Test() {
        String browser = System.getProperty("browser", "mozilla ");
        System.out.println(browser);
    }
}
