package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manjush on 8/8/17.
 */
public class GenericExample {
    double d = 0.0;
    @Test
    public void betterForCasting() {
        List<String> list = new ArrayList<>();
        list.add("a string");
        list.add("another String");

        String s1 = list.get(0);
        String s2 = list.get(1);

    }

    @Test
    public void boxTests() {
        List<Box<String>> boxList = new ArrayList<>();

        Box<String> box = new Box<>();
        box.setObject("a string");

        Box<String> box2 = new Box<>();
        box2.setObject("Another String ");

        boxList.add(box);
        boxList.add(box2);

        box.inspect(123);
        box.inspect(123.00);

    }

    @Test
    public void usingPairs() {
        Pair<String, String> pair = new OrderedPair<>("akey", "avalue");
        Pair<Integer, String> integerStringPair = new OrderedPair<>(123, "aValue");
    }

    @Test
    public void testWildCard(){
        sumOfNumbers(Arrays.asList(1,2,3));
        sumOfNumbers(Arrays.asList(11.444,2.7777,3.004));
        sumOfNumbers(Arrays.asList(1L,55L,333L));
    }

    public void sumOfNumbers(List<? extends Number> numbers){
        numbers.parallelStream().forEach(o -> {
            d += o.doubleValue();
        });
        System.out.print("Sum : "+d);
    }
}
