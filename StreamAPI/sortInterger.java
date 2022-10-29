package StreamAPI;

import java.util.ArrayList;

public class sortInterger
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(50);
        al.add(10);
        al.add(139);
        al.add(13);

     //   al.stream().sorted((x,y)->x.compareTo(y)).forEach(e-> System.out.println(e)); //accending order
     //   al.stream().sorted((x,y)->-x.compareTo(y)).forEach(e-> System.out.println(e)); //decending order
        //maximum elements
     //   al.stream().max((x,y)->x.compareTo(y)).stream().forEach(e-> System.out.println(e));
        //minimum elements
     //   al.stream().min((x,y)->x.compareTo(y)).stream().forEach(e-> System.out.println(e));
        //sum of all even number
        System.out.println(al.stream().filter(e->e%2==0).mapToInt((e)->e).sum());
        //sum of all odd number
        System.out.println(al.stream().filter(e->e%2!=0).mapToInt((e)->e).sum());
    }
}
