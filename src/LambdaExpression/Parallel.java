package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parallel {

    /*
            1) 数据量问题: 数据量大时才建议用并行流
            2) 线程会无限增加吗: 跟 cpu 能处理的线程数相关
            3) 收尾的意义: 转不可变集合、StringBuilder 转 String ...
            4) 是否线程安全: 不会有线程安全问题
            5) 特性：
                是否需要收尾（默认收尾）
                是否需要保证顺序（默认保证）
                容器是否支持并发（默认不需要支持）

                到达选择哪一种？
                    A. Characteristics.CONCURRENT + Characteristics.UNORDERED + 线程安全容器  并发量大性能可能会受影响
                    B. 默认 + 线程不安全容器                                                   占用内存多，合并多也会影响性能

         */


    public static void main(String[] args) {

        List<Integer> collect = Stream.of(1, 2, 3, 4)
                .parallel()
                .collect(Collector.of(

                        () -> {
                            return  new Vector();
                        }
                                , // 如何创建容器
                        (list,x) -> list.add(x), // 如何向容器添加数据
                        (list1,list2) -> {
                            list1.addAll(list2);
                            return list1;
                        }, // 如何合并两个容器之间的数据
                        list -> {
                            return Collections.unmodifiableList(list);  // 不可变集合
                        }    // 收尾
                        // 特性：并发、是否需要收尾、是否要保证收集顺序 容器不支持并发，需要收尾，要保证收集顺序
                        , Collector.Characteristics.IDENTITY_FINISH  // 不需要收尾
                        , Collector.Characteristics.UNORDERED  // 不需要保证顺序
                        , Collector.Characteristics.CONCURRENT  // 容器需要支持并发

                ));
        System.out.println(collect);
        collect.add(100);
        System.out.println(collect);

    }
}
