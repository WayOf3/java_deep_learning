package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise3 {

    public static void main(String[] args) {

//        List<Integer> result = filter(Arrays.asList(1, 2, 3, 4, 5, 6), (Integer number) -> (number & 1) == 0);
//        System.out.println(result);

//        List<String> result = map(Arrays.asList(1, 2, 3, 4, 5, 6), number -> String.valueOf(number));
//        System.out.println(result);

//        consume(Arrays.asList(1, 2, 3, 4, 5, 6),number -> System.out.println(number));

        List<Integer> supply = supply(5, () -> ThreadLocalRandom.current().nextInt());
        System.out.println(supply);
    }


    /**
     *  (number & 1) == 0
     *  (Integer number) -> (number & 1) == 0
     *  Integer -> boolean
     */
    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            // 筛选: 判断是否是偶数，但以后可能改变筛选规则
            if (predicate.test(number)){
                result.add(number);
            }
        }
        return result;
    }


    /**
     *   (Integer number) -> String.valueOf(number)
     */
    static List<String> map(List<Integer> list, Function<Integer,String> function) {
        ArrayList<String> result = new ArrayList<>();
        for (Integer number : list) {
            // 转换：将数字转为字符串，但以后可能改变筛选规则
            result.add(function.apply(number));
        }
        return result;
    }



    /**  consumer
     *  (Integer number) -> System.out.println(number);
     */

    static void consume(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer number : list) {
            // 消费： 打印，但以后可能改变消费规则
            consumer.accept(number);
        }
    }


    /**
     * () -> ThreadLocalRandom.current().nextInt()
     */

    static List<Integer> supply(int count, Supplier<Integer> supplier) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(supplier.get());
        }
        return result;
    }









}

