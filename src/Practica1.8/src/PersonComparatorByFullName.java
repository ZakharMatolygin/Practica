import java.util.Comparator;

public class PersonComparatorByFullName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
