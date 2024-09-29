package LambdaExpression;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortTest {

    public static void main(String[] args) {

        // 去重
//        IntStream.of(1,2,3,1,2,3,3,4,5)
//                .distinct()
//                .forEach(System.out::println);


        // 排序
        Stream.of(
                new Hero("令狐冲", 90),
                new Hero("风清扬", 98),
                new Hero("独孤求败", 100),
                new Hero("方证", 92),
                new Hero("东方不败", 98),
                new Hero("冲虚", 90),
                new Hero("向问天", 88),
                new Hero("任我行", 92),
                new Hero("不戒", 88)
        )
                // Comparator (a,b) -> int 如果返回负数 a小b大 a前b后 如果返回正数 a大b小 a后b前 返回0 相等排序都行
//                .sorted((a,b) -> a.value < b.value ? -1: a.value ==  b.value ? 0:1).forEach(System.out::println);
//                .sorted((a,b) -> Integer.compare(a.value,b.value)).forEach(System.out::println);
//                .sorted(Comparator.comparingInt(Hero::getValue).reversed()).forEach(System.out::println);
                .sorted(Comparator.comparingInt(Hero::getValue).reversed().thenComparingInt(h -> h.getName().length())).forEach(System.out::println); // 按武力降序，武力相等的按名字长度升序

    }

    private static class Hero {

        String name;

        int value;

        public Hero(String name, int value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    ", value=" + value +
                    '}';
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }
    }
}
