package demo.builder;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public abstract class AbstractBuilder {

    protected Builder_P builder_p = new Builder_P();


    protected abstract void buildPA();

    protected abstract void buildPB();

    protected abstract void buildPC();

    public Builder_P getResult() {
        return builder_p;
    }


}
