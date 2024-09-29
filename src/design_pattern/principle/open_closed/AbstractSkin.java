package design_pattern.principle.open_closed;

// 开闭原则：对扩展开放，对修改关闭  -> 使用接口和抽象类

/**
 * 抽象皮肤类
 */
public abstract class AbstractSkin {

    // 方法加上abstract关键字 要求子类实现
    public abstract void display();
}
