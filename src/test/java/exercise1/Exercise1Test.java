package exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Exercise1Test {

    @Test
    void integersShouldBeEqual() {
        Integer a = 10;
        Integer b = 10;
        assertThat(a).isEqualTo(b);
    }

    @Test
    void integersShouldBeNotEqual() {
        Integer a = 5;
        Integer b = 10;
        assertThat(a).isNotEqualTo(b);
    }
}
