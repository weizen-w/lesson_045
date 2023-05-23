import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {

  private String name;
  private Date birthdate;
  private static final SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

  public Person(String name, String birthdate) throws ParseException {
    this.name = name;
    this.birthdate = format.parse(birthdate);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public String getName() {
    return name;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  @Override
  public String toString() {
    return String.format("ФИО: %s (дата рождения: %td.%<tm.%<tY)", name, birthdate);
  }

  @Override
  public int compareTo(Person o) {
    return -birthdate.compareTo(o.birthdate);
  }
}
