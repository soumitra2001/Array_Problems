import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,8,1,9,5);

        // Stream<Integer> s=list.parallelStream();
        Stream<Integer> strm=list.stream();

        // s.forEach(num-> System.out.println(num));  // unordered iteration over list;

        // strm.forEach(num-> System.out.println(num));

        Stream<Integer> ans=strm.filter(num-> num>=5 );

        ans.forEach(num->System.out.println(num));

        // We also can use method reference here => (::)

        // ans.forEach(System.out::println);

    }
}