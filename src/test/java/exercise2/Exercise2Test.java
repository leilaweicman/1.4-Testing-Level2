package exercise2;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise2Test {

    @Test
    void objectsShouldBeSameReference() {
        String text = new String("hello");
        String sameRef = text;
        assertThat(text).isSameAs(sameRef);
    }

    @Test
    void objectsShouldNotBeSameReference() {
        String text1 = new String("hello");
        String text2 = new String("hello");
        assertThat(text1).isNotSameAs(text2);
    }
}
