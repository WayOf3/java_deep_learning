package LambdaExpression;

import LambdaExpression.MethodRef2.Student;

import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Excercise4 {

    public static void main(String[] args) {

//        Function<String,Integer> lambda1 = s -> Integer.parseInt(s);
//        Function<String,Integer> lambda1 = Integer::parseInt; // 类名::静态方法

//        BiPredicate <List<String>,String> lambda2 = (list, element) -> list.contains(element);
        BiPredicate <List<String>,String> lambda2 = List::contains; // 多一个参数 类名::非静态方法


//        BiPredicate<MethodRef1.Student, Object> lambda3 = (stu, obj) -> stu.equals(obj);
        BiPredicate<MethodRef1.Student, Object> lambda3 = MethodRef1.Student::equals; // 类名::非静态方法

//        Predicate<File> lambda4 = (file) -> file.exists();
        Predicate<File> lambda4 = File::exists;

//        Runtime runtime = Runtime.getRuntime();
//        Supplier<Long> lambda5 = () -> runtime.freeMemory();

        Supplier<Long> lambda5 = Runtime.getRuntime()::freeMemory;


    }
}
