import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
//        Stream.of(array).forEach((x) -> System.out.println(x));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(125);
        list.add(124);
        list.add(123);
        list.add(122);

//        list.stream().map(x -> x+2).forEach(System.out::println);
        List<Integer> a = list.stream().map(x -> x+x).collect(Collectors.toList());
        System.out.println(a.stream().filter(x -> x > 30).count());
        System.out.println(a.stream().max((x, y) -> Integer.compare(x, y)));
//        Stream.of(1,2,3,4,5,6,7,8,9,9)
        System.out.println(a);

    }
}

