package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class mapMethod
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(19);
        al.add(13);

        al.stream().map(e->e*e).forEach(integer -> System.out.println(integer));
    }
}
