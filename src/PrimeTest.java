/*
 * Copyright (c) 2020. Mohammed A. Shehab
 * Website: https://users.encs.concordia.ca/~m_shehab/
 * Contact: m_shehab@encs.concordia.ca or mohammed_shihab@daad-alumni.de
 */

import static org.junit.Assert.*;
/*
* This file contains the test units of your implementation.
* It is not allow to modify any code inside it.
* So, you have to run the class test case and see the results for your code.
* */
public class PrimeTest {

    double get_system_time(int n)
    {
        // This function is used to measure the local system clocks.
        // It is not allow to change it.
        long start = System.nanoTime();
        for (int i = 1; i < n; i*=2)
        {
            // free process..
        }
        long end = System.nanoTime();
        double t = (end - start) / 1000000000.0;
        return t;
    }

    @org.junit.Test
    public void test_case1() {
        double t_s  = get_system_time(1000);
        Prime obj = new Prime();
        long start = System.nanoTime();
        boolean b = obj.is_prime(9973);
        long end = System.nanoTime();

        assertEquals("Test case 1 Fail.",b, true);

        double t = (end - start) / 1000000000.0;
        double diff = Math.abs(t - t_s);
        System.out.println("Test unit 1 Passed.");
        System.out.printf("Your algorithm takes %.9f sec.\n",t);

        if(diff <= 0.00009)
        {
            System.out.println("The implementation efficiency is Excellent.");
        }
        else if(diff <= 0.0003)
        {
            System.out.println("The implementation efficiency is Very Good.");
        }
        else if(diff <= 0.0009)
        {
            System.out.println("The implementation efficiency is Good.");
        }
        else
        {
            System.out.println("The implementation efficiency is Bad.");
        }
    }

    @org.junit.Test
    public void test_case2() {
        double t_s  = get_system_time(1000);
        Prime obj = new Prime();
        long start = System.nanoTime();
        boolean b = obj.is_prime(1000);
        long end = System.nanoTime();

        assertEquals("Test case 1 Fail.",b, false);

        double t = (end - start) / 1000000000.0;
        double diff = Math.abs(t - t_s);
        System.out.println("Test unit 1 Passed.");
        System.out.printf("Your algorithm takes %.9f sec.\n",t);

        if(diff <= 0.00009)
        {
            System.out.println("The implementation efficiency is Excellent.");
        }
        else if(diff <= 0.0003)
        {
            System.out.println("The implementation efficiency is Very Good.");
        }
        else if(diff <= 0.0009)
        {
            System.out.println("The implementation efficiency is Good.");
        }
        else
        {
            System.out.println("The implementation efficiency is Bad.");
        }
    }

    @org.junit.Test
    public void test_case3() {
        double t_s  = get_system_time(1000);
        Prime obj = new Prime();
        long start = System.nanoTime();
        boolean b = obj.is_prime(8431);
        long end = System.nanoTime();

        assertEquals("Test case 1 Fail.",b, true);

        double t = (end - start) / 1000000000.0;
        double diff = Math.abs(t - t_s);
        System.out.println("Test unit 1 Passed.");
        System.out.printf("Your algorithm takes %.9f sec.\n",t);

        if(diff <= 0.00009)
        {
            System.out.println("The implementation efficiency is Excellent.");
        }
        else if(diff <= 0.0003)
        {
            System.out.println("The implementation efficiency is Very Good.");
        }
        else if(diff <= 0.0009)
        {
            System.out.println("The implementation efficiency is Good.");
        }
        else
        {
            System.out.println("The implementation efficiency is Bad.");
        }
    }

    @org.junit.Test
    public void test_case4() {
        double t_s  = get_system_time(1000);
        Prime obj = new Prime();
        long start = System.nanoTime();
        boolean b = obj.is_prime(9900);
        long end = System.nanoTime();

        assertEquals("Test case 1 Fail.",b, false);

        double t = (end - start) / 1000000000.0;
        double diff = Math.abs(t - t_s);
        System.out.println("Test unit 1 Passed.");
        System.out.printf("Your algorithm takes %.9f sec.\n",t);

        if(diff <= 0.00009)
        {
            System.out.println("The implementation efficiency is Excellent.");
        }
        else if(diff <= 0.0003)
        {
            System.out.println("The implementation efficiency is Very Good.");
        }
        else if(diff <= 0.0009)
        {
            System.out.println("The implementation efficiency is Good.");
        }
        else
        {
            System.out.println("The implementation efficiency is Bad.");
        }
    }

    @org.junit.Test
    public void test_case5() {
        double t_s  = get_system_time(1000);
        Prime obj = new Prime();
        long start = System.nanoTime();
        boolean b = obj.is_prime(10007);
        long end = System.nanoTime();

        assertEquals("Test case 1 Fail.",b, true);

        double t = (end - start) / 1000000000.0;
        double diff = Math.abs(t - t_s);
        System.out.println("Test unit 1 Passed.");
        System.out.printf("Your algorithm takes %.9f sec.\n",t);

        if(diff <= 0.00009)
        {
            System.out.println("The implementation efficiency is Excellent.");
        }
        else if(diff <= 0.0003)
        {
            System.out.println("The implementation efficiency is Very Good.");
        }
        else if(diff <= 0.0009)
        {
            System.out.println("The implementation efficiency is Good.");
        }
        else
        {
            System.out.println("The implementation efficiency is Bad.");
        }
    }

    @org.junit.Test
    public void test_case6() {
        double t_s  = get_system_time(1000);
        Prime obj = new Prime();
        long start = System.nanoTime();
        boolean b = obj.is_prime(92177);
        long end = System.nanoTime();

        assertEquals("Test case 1 Fail.",b, true);

        double t = (end - start) / 1000000000.0;
        double diff = Math.abs(t - t_s);
        System.out.println("Test unit 1 Passed.");
        System.out.printf("Your algorithm takes %.9f sec.\n",t);

        if(diff <= 0.00009)
        {
            System.out.println("The implementation efficiency is Excellent.");
        }
        else if(diff <= 0.0003)
        {
            System.out.println("The implementation efficiency is Very Good.");
        }
        else if(diff <= 0.0009)
        {
            System.out.println("The implementation efficiency is Good.");
        }
        else
        {
            System.out.println("The implementation efficiency is Bad.");
        }
    }
}