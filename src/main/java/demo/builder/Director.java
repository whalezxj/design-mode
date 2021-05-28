package demo.builder;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public class Director {

    private AbstractBuilder abstractBuilder;

    public Director(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    public Builder_P construct(){
        abstractBuilder.buildPA();
        abstractBuilder.buildPB();
        abstractBuilder.buildPC();
        return abstractBuilder.getResult();
    }
}
