package demo.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxj
 * @date 2021/5/28
 **/

public class Singleton2_1 {


    private static List<String> list ;


    public Singleton2_1() {

    }

    public List<String> getInstance() {
        if (this.list==null){
            this.list = new ArrayList<String>();
        }
        return list;
    }
}
