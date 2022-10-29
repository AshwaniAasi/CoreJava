package StreamAPI;

import java.util.ArrayList;

public class sortName
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("zebra");
        al.add("rani");
        al.add("rahul");
        al.add("Ashwani");
        al.add("priya");

      //  al.stream().sorted().forEach(e-> System.out.println(e)); //for directly method.
//        al.stream().sorted((x,y)->x.compareTo(y)).forEach(e-> System.out.println(e)); //for accending order
//        al.stream().sorted((x,y)->-x.compareTo(y)).forEach(e-> System.out.println(e)); //for decending order

    }
}
