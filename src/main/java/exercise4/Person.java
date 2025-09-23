package exercise4;

public class Person {

    private final String name;
    public Person(String name) { this.name = name; }

    @Override
    public String toString() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        return name.equals(((Person) o).name);
    }

    @Override
    public int hashCode() { return name.hashCode(); }
}