package design_pattern.principle.open_closed;

public class DefaultSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
