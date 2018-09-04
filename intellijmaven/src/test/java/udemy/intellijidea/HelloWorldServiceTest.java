package udemy.intellijidea;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldServiceTest {
    private HelloWorldService helloWorldService = new HelloWorldService();

    @Test
    public void hello() throws Exception {
        assertEquals("Hello World!", helloWorldService.hello());
    }

}