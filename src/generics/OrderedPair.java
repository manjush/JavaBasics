package generics;

/**
 * Created by manjush on 8/8/17.
 */
public class OrderedPair<k, v> implements Pair<k, v> {

    private k key;
    private v value;

    public OrderedPair(k key, v value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public k getKey() {
        return this.key;
    }

    @Override
    public v getValue() {
        return this.value;
    }
}
