/*
 * Copyright (c) 2020. Mohammed A. Shehab
 * Website: https://users.encs.concordia.ca/~m_shehab/
 * Contact: m_shehab@encs.concordia.ca or mohammed_shihab@daad-alumni.de
 */

import org.junit.Test;

import static org.junit.Assert.*;
/*
 * This file contains the test units of your implementation.
 * It is not allow to modify any code inside it.
 * So, you have to run the class test case and see the results for your code.
 * */
public class OddProblemTest {

    @Test
    public void test_case1() {
        OddProblem obj = new OddProblem();
        int []arr = obj.solution(10);
        int []results ={10,5,16,8,4,2,1};
        assertArrayEquals(results, arr);
    }

    @Test
    public void test_case2() {
        OddProblem obj = new OddProblem();
        int []arr = obj.solution(22);
        int []results ={22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1};
        assertArrayEquals(results, arr);
    }

    @Test
    public void test_case3() {
        OddProblem obj = new OddProblem();
        int []arr = obj.solution(100);
        int []results ={100,50,25,76,38,19,58,29,88,44,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1};
        assertArrayEquals(results, arr);
    }

    @Test
    public void test_case4() {
        OddProblem obj = new OddProblem();
        int []arr = obj.solution(174);
        int []results ={174,87,262,131,394,197,592,296,148,74,37,112,56,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1};
        assertArrayEquals(results, arr);
    }
}