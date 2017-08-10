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

    public <U extends Number> void inspect(U u) {
        System.out.print("T : " + object.getClass().getName());
        System.out.print("U : " + u.getClass().getName());

    }

}
