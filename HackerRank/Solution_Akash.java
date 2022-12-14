package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result
{
    public static List<Integer> gradingStudents(List<Integer> grades)
    {
        return grades.stream().map(a -> a % 5 >= 3 && a >= 38 ? (a + (5 - (a % 5))) : a).collect(Collectors.toList());
    }

}
public class Solution_Akash
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i ->
                {
                    try
                    {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex)
                    {
                        throw new RuntimeException(ex);
                    }
                }).map(String::trim).map(Integer::parseInt).collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
        }
    }
