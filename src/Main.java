import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws ParseException {
    List<Person> personList = new ArrayList<>();
    personList.add(new Person("Person1", "10.2.2017"));
    personList.add(new Person("Person2", "15.3.2015"));
    personList.add(new Person("Person3", "5.1.2019"));
    System.out.println(personList);
    Collections.sort(personList);
    System.out.println(personList);
  }
}
