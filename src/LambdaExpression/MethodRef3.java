package LambdaExpression;

import java.util.stream.Stream;

public class MethodRef3 {



    public static void main(String[] args) {

        Util util = new UtilExt();
        /**
         * 需求:挑选出所有男性学生
         */
        util.hiOrder(Stream.of(
               new Student("张无忌","男"),
               new Student("周芷若","女"),
               new Student("宋青书","男")
        ));
//


    }


    static class Util {

        private boolean isMale (Student stu) {
            return  stu.sex.equals("男");
        }

        private boolean isFemale (Student stu) {
            return  stu.sex.equals("女");
        }

       // 过滤男性同学并打印
        void hiOrder(Stream<Student> stream){
            stream
                    .filter(this::isMale)
                    .forEach(System.out::println);
        }

    }

    static class UtilExt extends Util{



        // 过滤女性学生并打印
        void hiOrder(Stream<Student> stream){
            stream
                    .filter(super::isFemale)
                    .forEach(System.out::println);
        }
    }

    static class Student {
        private String name;
        private String sex;


        public Student(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }


        public String getName() {
            return name;
        }

        public String getSex() {
            return sex;
        }
    }
}
