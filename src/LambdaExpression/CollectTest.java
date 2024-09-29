package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Collector 收集器
public class CollectTest {

    /*
        收集：将元素收集入容器
            .collect(() -> c, (c, x) -> void, ?)

            () -> c             创建容器 c
            (c, x) -> void      将元素 x 加入 容器 c
     */

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("令狐冲", "风清扬", "独孤求败", "方证",
                "东方不败", "冲虚", "向问天", "任我行", "不戒");


        /*
            1) 收集到 List
            List<String> result = stream.collect(() -> new ArrayList<>(), (list, x) -> list.add(x), (a, b) -> { });
            ArrayList::new   ()->new ArrayList()
            ArrayList::add   (list,x)->list.add(x)
            List<String> result = stream.collect(ArrayList::new, ArrayList::add, (a, b) -> { });
         */

//        List<String> result = stream.collect(Collectors.toList());
//        for (String s : result) {
//            System.out.println(s);
//        }

        /*
            2) 收集到 Set
            Set<String> result = stream.collect(LinkedHashSet::new, Set::add, (a, b) -> { });
         */

//        Set<String> result = stream.collect(Collectors.toSet());


        /*
            3)收集到 Map
            Map<String, Integer> result = stream.collect(HashMap::new, (map,x)->map.put(x, 1), (a, b) -> { });
         */

//        Map<String, Integer> map = stream.collect(Collectors.toMap(x -> x, x -> 1));
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e);
//        }

//        Map<String,Integer> result = stream.collect(HashMap::new, (map,x) -> map.put(x,1), (a, b) -> {});
//        for (Map.Entry<String, Integer> e : result.entrySet()) {
//            System.out.println(e);
//        }

//        StringBuilder sb = stream.collect(StringBuilder::new, StringBuilder::append, (a, b) -> {});
//        System.out.println(sb);

//        String collect = stream.collect(Collectors.joining());

//        StringJoiner sb = stream.collect(() -> new StringJoiner(","), StringJoiner::add, (a, b) -> {});
//        System.out.println(sb);


//        String result = stream.collect(Collectors.joining(","));

        /*
        Map
        3：new ArrayList([])
        4: new ArrayList([])

        下游收集器
         */

//        Map<Integer, List<String>> result = stream.collect(Collectors.groupingBy(x -> x.length(), Collectors.toList()));
//        for (Map.Entry<Integer, List<String>> e : result.entrySet()) {
//            System.out.println(e);
//        }


        Map<Integer, String> result = stream.collect(Collectors.groupingBy(x -> x.length(), Collectors.joining(",")));
        for (Map.Entry<Integer, String> e : result.entrySet()) {
            System.out.println(e);
        }


    }

}


