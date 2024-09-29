package LambdaExpression;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Effective {

    /**
     *  三种基本流
     */

    public static void main(String[] args) {
        IntStream a = IntStream.of(97, 98, 99);
        LongStream b = LongStream.of(1L, 2L, 3L);
        DoubleStream c = DoubleStream.of(1.0, 2.0, 3.0);

        Stream<Integer> d = Stream.of(1, 2, 3);


//        a.mapToObj(x -> Character.toString((char) x)).forEach(System.out::println);

//        a.boxed().forEach(System.out::println);

//        IntSummaryStatistics stat = a.summaryStatistics();
//        System.out.println(stat.getSum());
//        System.out.println(stat.getCount());
//        System.out.println(stat.getMax());
//        System.out.println(stat.getMin());
//        System.out.println(stat.getAverage());


        Stream<Hero> stream = Stream.of(
                new Hero("令狐冲", 90),
                new Hero("风清扬", 98)
        );

        stream.mapToInt(Hero::getValue).forEach(System.out::println);



    }


    static class Hero {

        String name;
        Integer value;

        public Hero(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
}
