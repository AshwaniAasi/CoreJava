package HackerRank;

import java.util.Scanner;

class Solution
{
    static boolean flag;
    static int B, H;
    static
    {
        flag=false;
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if((B>=0 && B<=100) && (H>=0 && H<=100))
        {
            flag=true;
        }
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            sc.close();
        }
    }
     public static void main(String[] args)
     {
        if(flag)
        {
            int area=B*H;
            System.out.print(area);
        }
    }
}
