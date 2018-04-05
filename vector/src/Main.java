/**
 * Created by dmitry on 05.04.2018.
 */
public class Main {

    public static void main(String[] args) {

        Vector v = new Vector(1.0, 2.0, 3.0, 17.1);
        v.print();
        Vector w = new Vector(5.0, 8.4, 19.1, 23.2);
        w.print();
        Operations o = new Operations();
        Vector res = o.sub(v, w);
        res.print();
        res = o.sum(v, w);
        res.print();
        res = o.constantProduct(v, 3.3);
        res.print();
        System.out.println(o.scalarProduct(v, w));
        res = o.vectorProduct(v, w);
        res.print();;
        System.out.println(o.norm(v) + " " + o.norm(w));

    }
}
