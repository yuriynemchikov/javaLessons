package Tree;

public class Connection {
    Person person1;
    Relationship re;
    Person person2;

    enum Relationship {
        PARENT,
        CHILDREN;
    }

    public Connection(Person p1, Relationship re, Person p2){
        this.person1 = p1;
        this.re = re;
        this.person2 = p2;
    }

    public String getPerson1() {
        return String.valueOf(person1);
    }


    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, re, person2);
    }


}
