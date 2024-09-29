package LambdaExpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class FlatMapTest {

    public static void main(String[] args) {

//                Stream.of(
//                        Arrays.asList(
//                                new Fruit("草莓", "Strawberry", "浆果", "红色"),
//                                new Fruit("桑葚", "Mulberry", "浆果", "紫色"),
//                                new Fruit("杨梅", "Waxberry", "浆果", "红色"),
//                                new Fruit("蓝莓", "Blueberry", "浆果", "蓝色")
//                        ),
//                        Arrays.asList(
//                                new Fruit("核桃", "Walnut", "坚果", "棕色"),
//                                new Fruit("草莓", "Peanut", "坚果", "棕色")
//                        )
//                )
//                        .flatMap(Collection::stream)
//                        .forEach(System.out::println);


        Integer[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        Arrays.stream(array2D)
                .flatMap(array -> Arrays.stream(array))
                .forEach(System.out::println);
    }


    private static class Fruit {

        String cname;
        String name;
        String category;
        String color;

        public Fruit(String cname, String name, String category, String color) {
            this.cname = cname;
            this.name = name;
            this.category = category;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Fruit{" +
                    "cname='" + cname + '\'' +
                    ", name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
