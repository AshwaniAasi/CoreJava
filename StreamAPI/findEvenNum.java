package StreamAPI;

import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class findEvenNum
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(19);
        al.add(13);

        //--------------------using Collections and simple logic-----------------------
//        for (int i:al)
//        {
//            if(i%2!=0)
//            {
//                System.out.println(i);
//            }
//        }
//
   //----------------------using stream api (first part)-------------------------------
//        Stream<Integer> s=al.stream();
//        List l=s.filter(e->e%2!=0).collect(Collectors.toList());
//        System.out.println(l);

  //----------------------using stream api (second part) nothing to store direct print the elements-------------
//        Stream<Integer> s=al.stream();
//        s.filter(e ->e%2!=0).forEach(e-> System.out.println(e));

//------using stream api (3rd part) nothing to store direct print the elements with method chaining----------
  //      al.stream().filter(e->e%2!=0).forEach(e-> System.out.println(e));

//-------if we want to count odd number in the list-----------------------
        System.out.println(al.stream().filter(integer -> integer%2!=0).count());


    }

}
