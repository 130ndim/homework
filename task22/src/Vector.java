import java.util.ArrayList;

/**
 * Created by dmitry on 05.04.2018.
 */
public class Vector {
    public ArrayList<Double> arr = new ArrayList<>(100);

    public void add(Double c) {
        arr.add(c);
    }

    public Vector(double... p) {
        for(int i = 0; i < p.length; i++) {
            arr.add(p[i]);
        }
    }

    public void print() {
        System.out.println(this.arr);
    }

}
