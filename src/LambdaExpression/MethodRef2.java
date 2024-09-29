package LambdaExpression;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MethodRef2 {

    static class Student {
        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public  boolean ageGreaterOrEquals182() {
            return this.getAge() >= 18;
        }

        private final String name;
        private final Integer age;


        public Student() {
            this.name = "张无忌";
            this.age = 18;
        }

        public Student(String name) {
            this.name = name;
            this.age = 18;
        }
        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';


        }
    }


    public static void main(String[] args) {

        Supplier<Student> s1 =  Student::new;
        Function<String,Student> s2 =  Student::new;
        BiFunction<String,Integer,Student> s3 = Student::new;

        System.out.println(s1.get());
        System.out.println(s2.apply("宋青书"));
        System.out.println(s3.apply("周芷若", 17));

    }
}
