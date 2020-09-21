/*
 * Copyright (c) 2020. Mohammed A. Shehab
 * Website: https://users.encs.concordia.ca/~m_shehab/
 * Contact: m_shehab@encs.concordia.ca or mohammed_shihab@daad-alumni.de
 */
import java.util.ArrayList;
import java.util.List;

public class OddProblem {
/*
Problems in Computer Science are often classified as belonging to a certain class of problems (e.g.,
NP, Unsolvable, Recursive). In this problem you will be analyzing a property of an algorithm whose
classification is not known for all possible inputs.
Consider the following algorithm:
1. input n
2. print n
3. if n = 1 then STOP
4. if n is odd then n ←− 3n + 1
5. else n ←− n/2
6. GOTO 2
Given the input 22, the following sequence of numbers will be printed
22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
* */
    int [] toArray(List li)
    {
        // Helper function to convert list to array.
        int[] arr = new int[li.size()];
        //Copy data
        for (int i = 0; i < li.size();++i)
        {
            arr[i] = (int) li.get(i);
        }
        return arr;
    }
    public int[] solution(int v)
    {
        List arrayList = new ArrayList<Integer>();
        // Start your code from here.
        // Begin your magic spell here ;)
        // End code here
        System.out.println("\n");
        return toArray(arrayList);
    }
}
