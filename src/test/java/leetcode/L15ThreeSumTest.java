package leetcode;

import leetcode.array.ThreeSum;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
class L15ThreeSumTest {



    @Test
    public void test1(){

        ThreeSum solution = new ThreeSum();

        int[] input = {-1,0,1,2,-1,-4};

        List<Integer> contain1 = Arrays.asList(-1,-1,2);
        List<Integer> contain2 = Arrays.asList(-1,0,-1);

        List<List<Integer>> answer = solution.threeSum(input);

        System.out.println("answer = " + answer);

    }

}