package LambdaExpression;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTest {

    public static void main(String[] args) {

        // 1.findFirst 找到第一个元素
        IntStream stream = IntStream.of(1,2,3,4,5,6,7);

//        System.out.println(stream.filter(x -> (x & 1) == 0).findFirst().orElse(-1));

//        stream.filter(x -> (x & 1) == 0).findFirst().ifPresent((x) -> System.out.println(x));

        // 2.findAny 找到任意一个元素
        stream.filter(x -> (x & 1) == 0).findAny().ifPresent((x) -> System.out.println(x));

    }
}
