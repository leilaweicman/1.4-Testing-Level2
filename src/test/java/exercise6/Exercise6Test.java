package exercise6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise6Test {

    @Test
    void exceptionExampleShouldThrowArrayIndexOutOfBoundsException() {
        assertThatThrownBy(ExceptionExample::causeException).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
