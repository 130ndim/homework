/**
 * Created by dmitry on 05.04.2018.
 */
public class Operations {

    public Vector sum(Vector a, Vector b) {
        if(a.arr.size() != b.arr.size())
            throw new java.lang.Error("Wrong dimension");
        Vector result = new Vector();
        for(int i = 0; i < a.arr.size(); i++) {
            result.add(a.arr.get(i) + b.arr.get(i)) ;
        }
        return result;
    }

    public Vector sub(Vector a, Vector b) {
        if(a.arr.size() != b.arr.size())
            throw new java.lang.Error("Wrong dimension");
        Vector result = new Vector();
        for(int i = 0; i < a.arr.size(); i++) {
            result.add(a.arr.get(i) - b.arr.get(i)) ;
        }
        return result;
    }

    public Vector constantProduct(Vector a, double c) {
        Vector result = new Vector();
        for(double d : a.arr) {
            result.add(d*c);
        }
        return result;
    }

    public double norm(Vector a) {
        double result = 0;
        for(int i = 0; i < a.arr.size(); i++) {
            result += a.arr.get(i) * a.arr.get(i);
        }
        return Math.sqrt(result);
    }

    public double scalarProduct(Vector a, Vector b) {
        if(a.arr.size() != b.arr.size())
            throw new java.lang.Error("Wrong dimension");
        double result = 0;
        for(int i = 0; i < a.arr.size(); i++) {
            result += a.arr.get(i) * b.arr.get(i);
        }
        return result;
    }

    public Vector vectorProduct(Vector a, Vector b) {
        System.out.println(a.arr.size());
        if(a.arr.size() != b.arr.size() || a.arr.size() != 3)
            throw new java.lang.Error("Wrong dimension");
        double x = a.arr.get(1)*b.arr.get(2) - a.arr.get(2) * b.arr.get(1);
        double y = a.arr.get(2)*b.arr.get(0) - a.arr.get(0) * b.arr.get(2);
        double z = a.arr.get(0)*b.arr.get(1) - a.arr.get(1) * b.arr.get(0);
        return new Vector(x, y, z);
    }
}
