import java.util.Comparator;

public class PersonComparatorByNumbers implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNumber() - o2.getNumber();
    }
}
