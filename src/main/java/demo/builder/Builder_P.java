package demo.builder;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public class Builder_P {

    private String pa;
    private String pb;
    private String pc;


    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public void show(){
        System.out.println(this.getPa());
        System.out.println(this.getPb());
        System.out.println(this.getPc());
    }


}
