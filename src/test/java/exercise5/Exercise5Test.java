package exercise5;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise5Test {

    @Test
    void mapShouldContainAddedKey() {
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");

        assertThat(map).containsKey(1);
        assertThat(map).doesNotContainKeys(3);
    }
}
