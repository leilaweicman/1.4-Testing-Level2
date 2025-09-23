package exercise7;

import org.testng.annotations.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise7Test {

    @Test
    void optionalShouldBeEmpty() {
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }
}
