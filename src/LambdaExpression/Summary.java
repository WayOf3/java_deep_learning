package LambdaExpression;


import java.util.stream.Stream;

public class Summary {

    /*
           掌握 Stream 流的特性

            1. 一次使用
            2. 两类操作（中间操作 lazy 懒惰， 终结操作 eager 迫切）

         */

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5); // 水滴

        s1
                .map(x -> x + 1) // 水管
                .filter(x -> x <= 5) // 水管
                .forEach(System.out::println); // 水管 总阀门 2

    }

}
