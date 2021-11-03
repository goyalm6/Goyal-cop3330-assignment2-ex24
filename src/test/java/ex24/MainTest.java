package ex24;

import org.junit.jupiter.api.Test;
import static ex24.Main.isAnagram;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void isAnagramShouldReturnTrue() {
        String s1 = "tone";
        String s2 = "note";
        Boolean result = isAnagram(s1, s2);
        assertTrue(result);
    }

    @Test
    void isAnagramShouldReturnFalse() {
        String s1 = "test";
        String s2 = "sets";
        Boolean result = isAnagram(s1, s2);
        assertFalse(result);
    }
}