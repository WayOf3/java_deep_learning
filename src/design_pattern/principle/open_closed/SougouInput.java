package design_pattern.principle.open_closed;

// 搜狗输入法
public class SougouInput {

    // 尽管抽象类本身不能被实例化，但我们可以声明抽象类类型的变量，并将其指向实际的子类对象
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }

}
