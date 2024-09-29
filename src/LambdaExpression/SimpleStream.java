package LambdaExpression;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;

public class SimpleStream<T> {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,1,2,3);

//        SimpleStream.of(list)
////                .filter(x -> (x & 1) == 1)
//                .map(x -> x * x)
//                .forEach(System.out::println);

//        System.out.println(SimpleStream.of(list).reduce(0, Integer::sum));
//        System.out.println(SimpleStream.of(list).reduce(Integer.MAX_VALUE, Integer::min));
//        System.out.println(SimpleStream.of(list).reduce(Integer.MIN_VALUE, Integer::max));

//        HashSet<Integer> collect1 = SimpleStream.of(list)
//                .collect(HashSet::new, HashSet::add); // HashSet::add (set,t) -> set.add(t) // 调用非静态方法
//        System.out.println(collect1);
//
//        StringBuilder collect2 = SimpleStream.of(list).collect(StringBuilder::new, StringBuilder::append);
//        System.out.println(collect2);
//
//        SimpleStream.of(list).collect(() -> new StringJoiner("-"),(joiner, t) ->  joiner.add(String.valueOf(t)));
//        StringJoiner collect3 = SimpleStream.of(list).map(String::valueOf) // t -> String.valueOf(t)
//                .collect(() -> new StringJoiner("-"), StringJoiner::add);
//
//        System.out.println(collect3);

        // (StringJoiner,Integer) -> void
                // (StringJoiner,CharSequence) -> void


        /**

            key    value
             1       2
             2       2
             3       2
             4       1
             5       1

         */

        HashMap<Integer, Integer> collect = SimpleStream.of(list).collect(HashMap::new, (map,t) -> {
            if (!map.containsKey(t)) {
                map.put(t, 1);
            } else {
                map.put(t, map.get(t) + 1);
            }
        });

        System.out.println(collect);

        /*
            如果key在 map中不存在,将Key 连同新生成的value值存入map,并返回 value
            如果key在 map中存在,将Key 会返回key 上次的value值

         */


        HashMap<Integer, AtomicInteger> collect2 = SimpleStream.of(list).collect(HashMap::new, (map, t) -> map.computeIfAbsent( t, v -> new AtomicInteger()).getAndIncrement());

        System.out.println(collect);


    }

    // C 代表容器类型
    // supplier 用来创建容器
    public <C> C collect(Supplier<C>  supplier,BiConsumer<C,T> consumer) {
        C c = supplier.get(); // 创建了容器
        for (T t : collection) {
            consumer.accept(c, t); // 向容器中添加元素
        }
        return c;
    }

    // o 代表 p的初始值
    public T reduce(T o ,BinaryOperator<T> operator) {
        T p = o; // 上次的合并结果
        for (T t : collection) { // t是本次遍历的元素
            p = operator.apply(p,t);
        }
        return p;
    }

    public static <T> SimpleStream<T> of(Collection<T> collection) {
        return new SimpleStream<>(collection);
    }

    public SimpleStream<T> filter(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : collection) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }

        return new SimpleStream<>(result);
    }

    public <U> SimpleStream<U>  map(Function<T,U> function){
        List<U> result = new ArrayList<>();
        for (T t : collection) {
            U u = function.apply(t);
            result.add(u);
        }

        return new SimpleStream<>(result);
    }

    public void forEach(Consumer<T> consumer){
        for (T t : collection) {
            consumer.accept(t);
        }
    }


    private Collection<T> collection;
    private SimpleStream(Collection<T> collection) {
        this.collection = collection;
    }
}
