import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {

  private String name;
  private final Date age;

  SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

  public Person(String name, String age) throws ParseException {
    this.name = name;
    this.age = format.parse(age);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getAge() {
    return age;
  }

  @Override
  public String toString() {
    return String.format("ФИО: %s (дата рождения: %td.%<tm.%<tY)", name, age);
  }

  @Override
  public int compareTo(Person o) {
    return -age.compareTo(o.age);
  }
}
