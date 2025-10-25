package ua.opnu.list;

import java.util.Comparator;

public class SurnameSorter implements Comparator<Student> {
    private final boolean ascending;

    public SurnameSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getLastName().compareToIgnoreCase(s2.getLastName());
        return ascending ? result : -result;
    }
}