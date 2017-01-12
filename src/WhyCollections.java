import java.util.ArrayList;

/**
 * this class demonstrates why collections needed?
*              Array                    |          Collections
 *  -------------------------------------------------------------
 *  1. Fixed in size                    |  Growable in size
 *  2. Can store only homogeneous value |   can store both homogeneous + heterogeneous
 *  etc...
 * there are many reason to choose collections but here i am explaining w.r.t memory
 */

public class WhyCollections {
    public static void main(String[] args) {
        String[] strArr = new String[10];
        strArr[0] = "Jay";
        strArr[1] = "Raju";
        strArr[2] = "Shayam";
        
        // here we are storing only 3 items in integer array but we have given size of array is 10, so 7 element size is wasted. 
        // for best use of memory collections needed.
        System.out.println("Using Collections...........");
        ArrayList<String> list = new ArrayList();
        list.add("Jay");
        list.add("Raju");
        list.add("Shayam");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
