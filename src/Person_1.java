import java.util.Objects;

public class Person_1 {
    private String name;
    private  int Id ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Person_1(String name, int id) {
        this.name = name;
        Id = id;
    }

    public Person_1() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_1 person_1 = (Person_1) o;
        return Id == person_1.Id && Objects.equals(name, person_1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Id);
    }
}
