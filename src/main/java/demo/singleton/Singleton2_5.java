package demo.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxj
 * @date 2021/5/28
 **/

public class Singleton2_5 {



    public Singleton2_5() {

    }

    public List<String> getInstance() {
        return SingletonInner.list;
    }

    public static class SingletonInner{
        private static List<String> list = new ArrayList<String>();
    }
}
