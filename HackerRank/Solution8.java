package HackerRank;

import java.io.*;
import java.math.BigInteger;

public class Solution8
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        BigInteger bi= new BigInteger(n);
        if(n.length()<=100 && bi.isProbablePrime(1))
        {
            System.out.println("prime");
        }
        else
            System.out.println("not prime");

        bufferedReader.close();
    }
}
