package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Excercise6 {

    /**
     * 传入参数时，分别用
     *      类名::静态方法
     *      类名::非静态方法
     *      来表示[学生年龄大于等于18]的条件
     */

    static boolean ageGreaterOrEquals18(MethodRef2.Student stu) {
        return stu.getAge() >= 18;
    }





    public static void main(String[] args) {

//        highOrder(Excercise6::ageGreaterOrEquals18);
        highOrder(MethodRef2.Student::ageGreaterOrEquals182);

        /**
         * (MethodRef2.Student stu) -> stu.abc()
         * (Excercise6 obj,MethodRef2.Student stu) -> obj.adb(stu)
         */
    }

    static void highOrder(Predicate<MethodRef2.Student> predicate) {

        List<MethodRef2.Student> list = Arrays.asList(
                new MethodRef2.Student("张三", 18),
                new MethodRef2.Student("李四", 17),
                new MethodRef2.Student("王五", 20)

        );

        for (MethodRef2.Student stu : list) {
            if (predicate.test(stu)) {
                System.out.println(stu + "通过测试");

            }
        }


    }
}
