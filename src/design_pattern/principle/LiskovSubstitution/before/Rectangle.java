package design_pattern.principle.LiskovSubstitution.before;

// 里氏代换原则 任何父类可以出现的地方，子类一定可以出现 通俗理解:子类可以扩展父类的功能，
// 但不能改变父类原有的功能,即尽量不要重写父类的方法
public class Rectangle {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
