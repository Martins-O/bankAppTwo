package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceValueTest {
    DistanceValue distance = new DistanceValue();

    @Test
    void findTheDistanceValue() {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        int expected = 2;
        int actual = distance.distanceValue(arr1, arr2, d);
        assertEquals(expected, actual);
    }
}