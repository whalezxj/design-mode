package demo.builder;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public class BuilderTest {

    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Builder_P builderP = director.construct();
        builderP.show();
    }
}
