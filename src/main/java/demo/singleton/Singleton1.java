package demo.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxj
 * @date 2021/5/28
 **/
//饿汉 hungry
public class Singleton1 {


    private static List<String> list = new ArrayList<String>();


    public Singleton1() {
    }

    public List<String> getInstance(){
        return list;
    }
}
