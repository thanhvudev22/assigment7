
package assigment.pkg7;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);

        Collections.sort(numbers);

        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + numbers);
        // TODO code application logic here
    }
    
}
