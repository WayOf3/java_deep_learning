package LambdaExpression;

public class CarryingOTest {

    @FunctionalInterface
    interface F2 {
        int op(int a,int b);
    }

    @FunctionalInterface
    interface Fa {
        Fb op(int a);
    }

    @FunctionalInterface
    interface Fb {
        int op(int b);
    }



    public static void main(String[] args) {
        F2 f2 = (a,b) -> a + b;
        f2.op(10,20);

        /**
         * 改造
         *
         * (a) -> 返回另一个函数对象
         *        (b) -> a + b
         */

        Fa fa = (a) -> (b) -> a + b;
        Fb fb = fa.op(10);
        int r = fb.op(20);
        System.out.println(r);
    }


}
