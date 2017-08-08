package generics;

/**
 * Created by manjush on 8/8/17.
 */
public class Box<T> {
    /*
    *
    * E- Element
    * K - Key
    * N - Number
    * T - Type
    * V - Value
    * */


    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

}
