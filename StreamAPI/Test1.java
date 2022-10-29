package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(40);
        al.add(80);
        al.add(90);
        al.add(50);

        // first way to get stream instance for ArrayList
//        Stream<Integer> s1=al.stream();
//        s1.forEach(e-> System.out.print(e+", "));

        //Second way to get stream instance for their static method
//        Stream s2=Stream.of(al);
//        s2.forEach(e-> System.out.println(e));

        // 3rd way to get stream instance for their static method with value
      //  Stream s3=Stream.of(100,300,50,43,23,33,345);
//        Stream s3= Stream.of("ashwani","rahul","ravi");
//        s3.forEach(e-> System.out.println(e));

        // 4th way to get stream instance for an array
//        int [] arr={600,766,545,4544,544,54555,45};
//        IntStream s4=Arrays.stream(arr);
//        s4.forEach(e -> System.out.println(e));

        // 5th way to get stream instance for empty instance
//        Stream s5=Stream.empty();

        // 6th way to get stream instance for builder build method
//        Stream s6=Stream.builder().build();



    }
}
