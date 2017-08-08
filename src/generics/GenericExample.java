package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manjush on 8/8/17.
 */
public class GenericExample {

    @Test
    public void betterForCasting() {
        List<String> list = new ArrayList<>();
        list.add("a string");
        list.add("another String");

        String s1 = list.get(0);
        String s2 = list.get(1);

    }

    @Test
    public void boxTests(){
        List<Box<String>> boxList = new ArrayList<>();

    }
}
