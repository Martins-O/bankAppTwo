package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testShuffle(){
        int [] nums = {1,1,2,2};
        int [] expected = {1,2,1,2};
        assertEquals(expected, Solution.shuffle(nums, 2));
    }

}