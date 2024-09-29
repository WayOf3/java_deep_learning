package LambdaExpression;

import java.util.stream.IntStream;

public class MatchTest {

    public static void main(String[] args) {

        // 1.findFirst 找到第一个元素
        IntStream stream = IntStream.of(1,3,5);

//        System.out.println(stream.anyMatch(x -> (x & 1) == 0));
//        System.out.println(stream.allMatch(x -> (x & 1) == 0));
        System.out.println(stream.noneMatch(x -> (x & 1) == 0));

    }
}
