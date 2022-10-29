package HackerRank;

import java.util.*;
import java.text.*;

    public class Solution7
    {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            NumberFormat nfus=NumberFormat.getCurrencyInstance(Locale.US);
            CharSequence us=nfus.format(payment);
            NumberFormat nfch=NumberFormat.getCurrencyInstance(Locale.CHINA);
            CharSequence china=nfch.format(payment);
            NumberFormat nffr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            CharSequence france=nffr.format(payment);
            NumberFormat nfIN=NumberFormat.getCurrencyInstance(new Locale("en","IN","Rs."));
            CharSequence india=nfIN.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }

