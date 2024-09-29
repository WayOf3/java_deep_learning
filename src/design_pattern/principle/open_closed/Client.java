package design_pattern.principle.open_closed;

public class Client {

    public static void main(String[] args) {

        // 1.创建搜狗输入法对象
        SougouInput input = new SougouInput();

        // 2.创建皮肤对象
        // DefaultSkin skin = new DefaultSkin();
        HaSkin skin = new HaSkin();


        // 相当于传递了 AbstractSkin skin = new DefaultSkin()
        // 3.将皮肤设置到输入法里面
        // input.setSkin(skin);
        input.setSkin(skin);

        // 4.显示皮肤
        input.display();
    }

}
