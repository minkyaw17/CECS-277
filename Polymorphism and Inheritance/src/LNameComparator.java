import java.util.Comparator;

import java.util.*;

// method for E.
public class LNameComparator implements Comparator{
    public int compare(Object l1, Object l2) {
        Employee e1 = (Employee) l1;
        Employee e2 = (Employee) l2;
        return e2.getLastName().compareTo(e1.getLastName());
    }
}
