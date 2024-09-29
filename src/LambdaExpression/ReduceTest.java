package LambdaExpression;


import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/*
    化简：两两合并，只剩一个
    适合：最大值、最小值、求和、求个数...
        .reduce((p, x) -> r)        p 上次的合并结果， x 当前元素， r 本次合并结果
        .reduce(init, (p, x) -> r)
        .reduce(init, (p, x) -> r, (r1, r2) -> r)
 */
public class ReduceTest {


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

    public static void main(String[] args) {

        Stream<Hero> stream = Stream.of(
                new Hero("令狐冲", 90),
                new Hero("风清扬", 98),
                new Hero("独孤求败", 100),
                new Hero("方证", 92),
                new Hero("东方不败", 98),
                new Hero("冲虚", 90),
                new Hero("向问天", 88),
                new Hero("任我行", 92),
                new Hero("不戒", 88)
        );

        // 1) 求武力最高的hero
//        Optional<Hero> result = stream
//                .reduce((h1, h2) -> h1.value > h2.value ? h1 : h2);

//        Hero result = stream.reduce(new Hero("-", -1), (h1, h2) -> h1.value > h2.value ? h1 : h2);
//        System.out.println(result);

        // 2) 求高手总数
//        System.out.println(stream.map(x -> 1).reduce(0,Integer::sum));

//        System.out.println(stream.count());
//        System.out.println(stream.max(Comparator.comparingInt(Hero::getValue)));
//        System.out.println(stream.min(Comparator.comparingInt(Hero::getValue)));

//        System.out.println(stream.mapToInt(Hero::getValue).sum());
        System.out.println(stream.mapToInt(Hero::getValue).average());
    }

}
