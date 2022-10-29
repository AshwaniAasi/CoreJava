package HackerRank;

import java.util.*;

    public class Solution5
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            StringBuilder B = new StringBuilder();
            B.append(A);
            B.reverse();
            String C = B.toString();
            if(A.equals(C)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            /* Enter your code here. Print output to STDOUT. */

        }
    }
