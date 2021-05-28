package demo.builder;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public class ConcreteBuilder extends AbstractBuilder{
    @Override
    protected void buildPA() {
        builder_p.setPa("pa");
    }

    @Override
    protected void buildPB() {
        builder_p.setPb("pb");

    }

    @Override
    protected void buildPC() {
        builder_p.setPc("pc");
    }
}
