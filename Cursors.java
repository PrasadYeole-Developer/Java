import java.util.*;
class Cursors{
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");
        

        Enumeration k1=v1.elements();
        while(k1.hasMoreElements()){

            System.out.println(k1.nextElement());

        }

    }
}