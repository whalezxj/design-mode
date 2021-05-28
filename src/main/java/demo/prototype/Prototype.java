package demo.prototype;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public class Prototype implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prototype() {
        this.name = "具体原型";
        System.out.println("创建具体原型成功");
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        System.out.println("创建克隆原型成功");
        return (Prototype)super.clone();
    }
}
