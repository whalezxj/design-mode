package demo.prototype;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public class PrototypeTest {


    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        Prototype clone = prototype.clone();
        System.out.println("prototype==clone:"+(prototype==clone));
        System.out.println("prototype.name==clone.name:"+(prototype.getName()==clone.getName()));
    }

}
