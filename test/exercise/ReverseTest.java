package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    void reverse() {
        char [] arr = {'s', 'e', 'm', 'i', 'c', 'o', 'l', 'o', 'n'};
        char expected[] = {'n','o','l','o','c','i','m','e','s'};
        assertArrayEquals(new char[]{'n', 'o', 'l', 'o', 'c', 'i', 'm', 'e', 's'}, reverse.reverse(arr));
    }
}