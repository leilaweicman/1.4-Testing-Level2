package exercise4;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise4Test {

    private final String text = "Hello";
    private final Integer number = 42;
    private final Person person = new Person("Alice");
    private final Double decimal = 3.14;
    private final List<Object> list = new ArrayList<>() {{
        add(text);
        add(number);
        add(person);
        add(decimal);
    }};

    @Test
    void shouldKeepInsertionOrder() {

    }

    @Test
    void shouldContainElementsInAnyOrder() {

    }

    @Test
    void shouldContainPersonOnlyOnce() {

    }

    @Test
    void shouldNotContainBob() {

    }
}
