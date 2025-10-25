package ua.opnu.list;

import java.util.Comparator;

public class AvgMarkSorter implements Comparator<Student> {
    private final boolean ascending;

    public AvgMarkSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = Double.compare(s1.getAvgMark(), s2.getAvgMark());
        return ascending ? result : -result;
    }
}

