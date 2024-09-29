package LambdaExpression;

public class Excercise5 {

    static class Color {
        public Integer red;
        public Integer green;

        public Integer blue;

        public Color(Integer red, Integer green, Integer blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }

    // 如果想用 Color::new 来构造Color对象，还应该补充哪些代码
    public static void main(String[] args) {

        TernaryFunction lambda = Color::new; // (Integer,Integer,Integer) -> Color
        lambda.create(255,255,255);
        System.out.println("White");

    }

    @FunctionalInterface
    interface TernaryFunction {

        Color create(Integer red, Integer green, Integer blue);
    }
}

