package LambdaExpression;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class InnerLoop {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // 需求：  逆序遍历集合，只想负责元素处理，不改变集合
        hiOrder(list,(value) -> System.out.println(value));

    }

    public static <T> void hiOrder(List<T> list, Consumer<T> consumer){
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            T value = iterator.previous();
            consumer.accept(value);
        }

    }
}
