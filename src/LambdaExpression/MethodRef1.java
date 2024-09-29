package LambdaExpression;

import java.util.stream.Stream;

public class MethodRef1 {

    static class Util {

        public boolean isMale(Student stu) {
            return stu.sex.equals("男");
        }

        public String xyz(Student stu){
            return stu.name;
        }

    }


    public static void main(String[] args) {

        Util util = new Util();
        /**
         * 需求:挑选出所有男性学生
         */
        Stream.of(
               new Student("张无忌","男"),
               new Student("周芷若","女"),
               new Student("宋青书","男")
        )
//            .filter(stu -> stu.sex.equals("男")) // lambda 表达式方式
//                .filter(MethodRef1::isMale) // 静态方法引用方式
//                .filter(Student::isMale) // 非静态方法引用方式
//                .forEach(stu -> System.out.println(stu));
//            .forEach(MethodRef1::abc); // 静态方法引用
//                .forEach(Student::print); // 非静态方法引用
                .filter(util::isMale)
//                .map(stu -> stu.name) // lambda 表达式方式
//                .map(util::xyz) // 对象::非静态方法
                .map(Student::getName) // 类名::非静态方法
                .forEach(System.out::println);
        /**
         * (stu) -> util.isMale()
         * (stu) -> util.xyz()
         */

        /**
         * 对象::非静态方法
         * System.out::println
         * stu -> System.out.println(stu)
         */

        /**
         *  (Student stu) -> stu.sex().equals("男")
         *  (Student stu) -> MethodRef1.isMale(stu)
         */

        /**
         *  一个参数 -> void
         *  (Student stu) -> System.out.println(stu)
         *  类名::静态方法
         *  (Student stu) -> MethodRef1。abc(stu)
         */


    }

    public static boolean isMale(Student stu){
        return stu.sex.equals("男");
    }

    public static void abc(Student stu) {
        System.out.println(stu);
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

        public boolean isMale() {

            return this.sex.equals("男");

        }
        /**
         *  Student::isMale  类名::静态方法
         *  (stu) -> stu.isMale
         */

        public void print() {
            System.out.println(this);
        }

        /**
         * Student::print  类名::非静态方法
         * (stu) -> stu.print()
         */

        /**
         *  Student :: name
         *  stu -> stu.name()
         */
        public String getName() {
            return name;
        }

        public String getSex() {
            return sex;
        }
    }
}
