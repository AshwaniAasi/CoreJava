package StreamAPI;

import java.util.ArrayList;

//WAP to upperCase of all strings
public class mapMethod2
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Ashwani");
        al.add("rani");
        al.add("rahul");
        al.add("ritesh");
        al.add("priya");

        al.stream().map(e->e.toUpperCase()).forEach(e-> System.out.println(e));
    }
}
