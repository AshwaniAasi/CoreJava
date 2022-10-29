package HackerRank;

import java.util.Scanner;

public class Solution2
{
    public static void main(String[] args)
    {
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Breath");
        int B=sc.nextInt();
        System.out.println("Enter Height");
        int H=sc.nextInt();

        if((B>=0 && B<=100) && (H>=0 && H<=100))
        {
            flag=true;
        }
        if(flag)
        {
            int area=B*H;
            System.out.print(area);
        }
        else
            System.out.println("Breadth and height must be positive");

    }//end of main

}//end of class

