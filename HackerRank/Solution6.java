package HackerRank;

import java.util.Scanner;

    public class Solution6
    {
        static boolean isAnagram(String a, String b)
        {
            // Complete the function
            a = a.toLowerCase();
            b = b.toLowerCase();

            if(a.length() != b.length())
            {
                return false;
            }
            else
            {
                char firstArray [] = a.toCharArray();
                char secondArray [] = b.toCharArray();
                char temp;
                for(int i = 0; i < firstArray.length - 1; i++){
                    for(int j = i + 1; j < firstArray.length; j++)
                        if(firstArray[i] > firstArray[j])
                        {
                            temp = firstArray[i];
                            firstArray[i] = firstArray [j];
                            firstArray [j] = temp;
                        }
                }
                for(int i = 0; i < secondArray.length - 1; i++)
                {
                    for(int j = i + 1; j < secondArray.length; j++)
                        if(secondArray[i] > secondArray[j])
                        {
                            temp = secondArray[i];
                            secondArray[i] = secondArray [j];
                            secondArray [j] = temp;
                        }
                }
                int count = 0;
                for(int  i = 0; i < firstArray.length; i++)
                {
                    if (firstArray[i] == secondArray[i])
                    {
                        count++;
                    }
                }
                if(count == firstArray.length)
                    return true;
                else
                    return false;
            }
        }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }
