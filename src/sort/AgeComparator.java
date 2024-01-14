package sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o2.getAge() - o1.getAge();
    }
}
