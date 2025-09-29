package exercise4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
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
        assertThat(list).containsExactly(text, number, person, decimal);
    }

    @Test
    void shouldContainElementsInAnyOrder() {
        assertThat(list).containsExactlyInAnyOrder(decimal, person, number, text);
    }

    @Test
    void shouldContainPersonOnlyOnce() {
        assertThat(list).containsOnlyOnce(person);
    }

    @Test
    void shouldNotContainBob() {
        Person bob = new Person("Bob");
        assertThat(list).doesNotContain(bob);
    }
}
