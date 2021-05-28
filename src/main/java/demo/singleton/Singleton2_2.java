package demo.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxj
 * @date 2021/5/28
 **/

public class Singleton2_2 {


    private static List<String> list;


    public Singleton2_2() {

    }

    public List<String> getInstance() {
        synchronized (this) {
            if (this.list == null) {
                this.list = new ArrayList<String>();
            }
        }
        return list;
    }
}
