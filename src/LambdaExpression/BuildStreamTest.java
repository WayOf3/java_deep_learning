package LambdaExpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class BuildStreamTest {

    public static void main(String[] args) {

        // 1.从集合中创建
        Arrays.asList(1,2,3).stream().forEach(System.out::println);
        Map<String,Integer> map = (Map<String, Integer>) new HashMap();
        map.put("a",1);
        map.put("b",2);
        map.entrySet().stream().forEach(System.out::println);

        // 2. 从数组中构建
        int [] array = {1,2,3};
        Arrays.stream(array).forEach(System.out::println);

        // 3.从对象中构建
        Stream.of(1,2,3,4,5).forEach(System.out::println);
    }
}
