package app.entity;

import java.io.Serializable;

public class Person implements Serializable {
    private final static long SerialVersionUID = 1L;
 private String first;
  private String last;

  public Person(String first, String last){
    this.first= first;
    this.last = last;
  }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
