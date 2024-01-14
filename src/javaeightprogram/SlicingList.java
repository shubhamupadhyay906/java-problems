package javaeightprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlicingList {

    public static void main(String[] args) {
        //[1, 2, 3, 4, 5, 6, 7, 8, 9]
        //[2,3,4]
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list1 = list.stream().skip(1).limit(3).toList();
        System.out.println(list1);

    }
}
